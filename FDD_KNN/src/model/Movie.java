package model;

/**
 * @author six descamps lalande
 * 
 */
public class Movie {

	private long duration; // minutes
	private long directorFbLikes;
	private long actor1FbLikes;
	private long castFbLikes;
	private String imdbDiscretise;
	private long budget;
	private long langage; // 1 si c'est anglais, 0 si c'est autre
	private String ratioRentabDisc;
	private long[] tab;

	public Movie() {
	}

	/**
	 * @return
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 */
	public void setDuration(final long duration) {
		this.duration = duration;
	}

	/**
	 * @return
	 */
	public long getDirectorFbLikes() {
		return directorFbLikes;
	}

	/**
	 * @param directorFbLikes
	 */
	public void setDirectorFbLikes(final long directorFbLikes) {
		this.directorFbLikes = directorFbLikes;
	}

	/**
	 * @return
	 */
	public long getActor1FbLikes() {
		return actor1FbLikes;
	}

	/**
	 * @param actor1FbLikes
	 */
	public void setActor1FbLikes(final long actor1FbLikes) {
		this.actor1FbLikes = actor1FbLikes;
	}

	/**
	 * @return
	 */
	public long getCastFbLikes() {
		return castFbLikes;
	}

	/**
	 * @param castFbLikes
	 */
	public void setCastFbLikes(final long castFbLikes) {
		this.castFbLikes = castFbLikes;
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
	public long[] getTab() {
		return tab;
	}

	/**
	 * @param tab
	 */
	public void setTab(final long[] tab) {
		this.tab = tab;
	}

	/**
	 * @return
	 */
	public long getBudget() {
		return budget;
	}

	/**
	 * @param budget
	 */
	public void setBudget(final long budget) {
		this.budget = budget;
	}

	/**
	 * @return
	 */
	public String getRatioRentabDisc() {
		return ratioRentabDisc;
	}

	/**
	 * @param ratioRentabDisc
	 */
	public void setRatioRentabDisc(final String ratioRentabDisc) {
		this.ratioRentabDisc = ratioRentabDisc;
	}

	/**
	 * @return the langage
	 */
	public long getLangage() {
		return langage;
	}

	/**
	 * @param langage
	 *            the langage to set
	 */
	public void setLangage(final long langage) {
		this.langage = langage;
	}
}
