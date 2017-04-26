package model;
/**
 * @author six descamps lalande
 * 
 */
public class MovieImdb {

	private int duration; // minutes
	private int gross;
	private int directorFbLikes;
	private int actor1FbLikes;
	private int castFbLikes;
	private int movieFbLikes;
	private String imdbDiscretise;
	private int[] tab;

	public MovieImdb() {
	}

	/**
	 * Constructeur
	 * 
	 * @param duration
	 * @param gross
	 * @param directorFbLikes
	 * @param actor1FbLikes
	 * @param castFbLikes
	 * @param moveFbLikes
	 * @param imdbDIscretise
	 */
	public MovieImdb(final int duration, final int gross,
			final int directorFbLikes, final int actor1FbLikes,
			final int castFbLikes, final int moveFbLikes,
			final String imdbDIscretise) {
		// Constructeur pour la lecture fichier IMDB
		this.duration = duration;
		this.gross = gross;
		this.directorFbLikes = directorFbLikes;
		this.actor1FbLikes = actor1FbLikes;
		this.castFbLikes = castFbLikes;
		this.movieFbLikes = moveFbLikes;
		this.imdbDiscretise = imdbDIscretise;
	}

	/**
	 * @return
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 */
	public void setDuration(final int duration) {
		this.duration = duration;
	}

	/**
	 * @return
	 */
	public int getGross() {
		return gross;
	}

	/**
	 * @param gross
	 */
	public void setGross(final int gross) {
		this.gross = gross;
	}

	/**
	 * @return
	 */
	public int getDirectorFbLikes() {
		return directorFbLikes;
	}

	/**
	 * @param directorFbLikes
	 */
	public void setDirectorFbLikes(final int directorFbLikes) {
		this.directorFbLikes = directorFbLikes;
	}

	/**
	 * @return
	 */
	public int getActor1FbLikes() {
		return actor1FbLikes;
	}

	/**
	 * @param actor1FbLikes
	 */
	public void setActor1FbLikes(final int actor1FbLikes) {
		this.actor1FbLikes = actor1FbLikes;
	}

	/**
	 * @return
	 */
	public int getCastFbLikes() {
		return castFbLikes;
	}

	/**
	 * @param castFbLikes
	 */
	public void setCastFbLikes(final int castFbLikes) {
		this.castFbLikes = castFbLikes;
	}

	/**
	 * @return
	 */
	public int getMovieFbLikes() {
		return movieFbLikes;
	}

	/**
	 * @param movieFbLikes
	 */
	public void setMovieFbLikes(final int movieFbLikes) {
		this.movieFbLikes = movieFbLikes;
	}

	/**
	 * @return
	 */
	public String getImdbDiscretise() {
		return imdbDiscretise;
	}

	/**
	 * @param imdbDiscretise
	 */
	public void setImdbDiscretise(final String imdbDiscretise) {
		this.imdbDiscretise = imdbDiscretise;
	}

	/**
	 * @return
	 */
	public int[] getTab() {
		return tab;
	}

	/**
	 * @param tab
	 */
	public void setTab(final int[] tab) {
		this.tab = tab;
	}
}
