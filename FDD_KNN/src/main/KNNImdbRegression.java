package main;
import java.io.File;
import java.io.IOException;
import java.util.*;

import dao.CsvMovieDaoImdb;

import model.MovieImdb;

/**
 * @author six lalande descamps
 * 
 */
class KNNImdbRegression {

	/**
	 * Returns the majority value in an array of strings majority value is the
	 * most frequent value (the mode) handles multiple majority values (ties
	 * broken at random)
	 * 
	 * @param array
	 *            an array of strings
	 * @return the most frequent string in the array
	 */
	private static String findMajorityClass(String[] array) {
		// add the String array to a HashSet to get unique String values
		Set<String> h = new HashSet<String>(Arrays.asList(array));
		// convert the HashSet back to array
		String[] uniqueValues = h.toArray(new String[0]);
		// counts for unique strings
		int[] counts = new int[uniqueValues.length];
		// loop thru unique strings and count how many times they appear in
		// origianl array
		for (int i = 0; i < uniqueValues.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j].equals(uniqueValues[i])) {
					counts[i]++;
				}
			}
		}

		for (int i = 0; i < uniqueValues.length; i++)
			System.out.println(uniqueValues[i]);
		for (int i = 0; i < counts.length; i++)
			System.out.println(counts[i]);

		int max = counts[0];
		for (int counter = 1; counter < counts.length; counter++) {
			if (counts[counter] > max) {
				max = counts[counter];
			}
		}
		System.out.println("max # of occurences: " + max);

		// how many times max appears
		// we know that max will appear at least once in counts
		// so the value of freq will be 1 at minimum after this loop
		int freq = 0;
		for (int counter = 0; counter < counts.length; counter++) {
			if (counts[counter] == max) {
				freq++;
			}
		}

		// index of most freq value if we have only one mode
		int index = -1;
		if (freq == 1) {
			for (int counter = 0; counter < counts.length; counter++) {
				if (counts[counter] == max) {
					index = counter;
					break;
				}
			}
			// System.out.println("one majority class, index is: "+index);
			return uniqueValues[index];
		} else {// we have multiple modes
			int[] ix = new int[freq];// array of indices of modes
			System.out.println("multiple majority classes: " + freq
					+ " classes");
			int ixi = 0;
			for (int counter = 0; counter < counts.length; counter++) {
				if (counts[counter] == max) {
					ix[ixi] = counter;// save index of each max count value
					ixi++; // increase index of ix array
				}
			}

			for (int counter = 0; counter < ix.length; counter++)
				System.out.println("class index: " + ix[counter]);

			// now choose one at random
			Random generator = new Random();
			// get random number 0 <= rIndex < size of ix
			int rIndex = generator.nextInt(ix.length);
			System.out.println("random index: " + rIndex);
			int nIndex = ix[rIndex];
			// return unique value at that index
			return uniqueValues[nIndex];
		}

	}

	/**
	 * Returns the mean (average) of values in an array of doubless sums
	 * elements and then divides the sum by num of elements
	 * 
	 * @param array
	 *            an array of doubles
	 * @return the mean
	 */
	@SuppressWarnings("unused")
	private static double meanOfArray(double[] m) {
		double sum = 0.0;
		for (int j = 0; j < m.length; j++) {
			sum += m[j];
		}
		return sum / m.length;
	}

	public static void main(String args[]) throws IOException {

		int k = 3;// number of neighbours

		// list to save city data
		List<MovieImdb> movieImdbList = new ArrayList<MovieImdb>();

		// list to save distance result
		List<Result> resultList = new ArrayList<Result>();

		// add city data to cityList
		CsvMovieDaoImdb daoImdb = new CsvMovieDaoImdb(new File(
				"/home/m1miage/six/Documents/FDD/projet/predictionIMDB.csv"));
		movieImdbList = daoImdb.findAllMovies();

		// data about unknown movie
		int[] query = { 132, 475, 640, 73058679, 1873, 24000 };

		// find distances
		for (MovieImdb movie : movieImdbList) {
			double dist = 0.0;
			int[] attributes = movie.getTab();
			for (int j = 0; j < movie.getTab().length; j++) {
				dist += Math.pow(attributes[j] - query[j], 2);
				// System.out.print(attributes[j]+" ");
			}
			double distance = Math.sqrt(dist);
			resultList.add(new Result(distance, movie.getImdbDiscretise()));
			System.out.println(distance);
		}

		Collections.sort(resultList, new DistanceComparator());
		String[] ss = new String[k];
		for (int x = 0; x < k; x++) {
			System.out.println(resultList.get(x).imdb + " .... "
					+ resultList.get(x).distance);
			// get classes of k nearest instances (imdb discretisé) from the
			// list into an array
			ss[x] = resultList.get(x).imdb;
		}
		String majClass = findMajorityClass(ss);
		System.out.println("Class of new instance is: " + majClass);
	}

	// simple class to model results (distance + class)
	static class Result {
		double distance;
		String imdb;

		public Result(double distance, String imdb) {
			this.imdb = imdb;
			this.distance = distance;
		}
	}

	// simple comparator class used to compare results via distances
	static class DistanceComparator implements Comparator<Result> {
		public int compare(Result a, Result b) {
			return a.distance < b.distance ? -1 : a.distance == b.distance ? 0
					: 1;
		}
	}

}