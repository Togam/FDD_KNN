package model;

/**
 * simple class to model results (distance + class)
 * 
 * @author six lalande descamps
 * 
 */
public class Result {
	private double distance;
	private String imdb;

	public Result(double distance, String imdb) {
		this.setImdb(imdb);
		this.setDistance(distance);
	}

	/**
	 * @return the distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * @param distance
	 *            the distance to set
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * @return the imdb
	 */
	public String getImdb() {
		return imdb;
	}

	/**
	 * @param imdb
	 *            the imdb to set
	 */
	public void setImdb(String imdb) {
		this.imdb = imdb;
	}
}