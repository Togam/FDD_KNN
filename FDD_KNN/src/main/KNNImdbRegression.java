package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Movie;
import model.Result;
import service.DistanceComparator;
import service.KNNalgo;
import dao.CsvMovieDaoImdbReg;

/**
 * @author six lalande descamps
 * 
 */
class KNNImdbRegression {

	public static void main(String args[]) throws IOException {

		int k = 3;// number of neighbours

		// list to save city data
		List<Movie> movieImdbList = new ArrayList<Movie>();

		// list to save distance result
		List<Result> resultList = new ArrayList<Result>();

		// add city data to cityList
		CsvMovieDaoImdbReg daoImdb = new CsvMovieDaoImdbReg(new File(
				"/home/m1miage/six/Documents/FDD/projet/predictionIMDB.csv"));
		movieImdbList = daoImdb.findAllMovies();

		// data about unknown movie
		int[] query = { 132, 475, 640, 1873 };

		// find distances
		for (Movie movie : movieImdbList) {
			double dist = 0.0;
			long[] attributes = movie.getTab();
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
			System.out.println(resultList.get(x).getImdb() + " .... "
					+ resultList.get(x).getDistance());
			// get classes of k nearest instances (imdb discretisé) from the
			// list into an array
			ss[x] = resultList.get(x).getImdb();
		}
		String majClass = KNNalgo.findMajorityClass(ss);
		System.out.println("Class of new instance is: " + majClass);
	}

}