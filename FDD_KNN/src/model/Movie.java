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
	private String durationDisc;
	private String DirFbLikesDisc;
	private String actor1FbLikesDisc;
	private String castFbLikesDisc;
	private String budgetDisc;
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

	/**
	 * @return the durationDisc
	 */
	public String getDurationDisc() {
		return durationDisc;
	}

	/**
	 * @param durationDisc the durationDisc to set
	 */
	public void setDurationDisc(String durationDisc) {
		this.durationDisc = durationDisc;
	}

	/**
	 * @return the dirFbLikesDisc
	 */
	public String getDirFbLikesDisc() {
		return DirFbLikesDisc;
	}

	/**
	 * @param dirFbLikesDisc the dirFbLikesDisc to set
	 */
	public void setDirFbLikesDisc(String dirFbLikesDisc) {
		DirFbLikesDisc = dirFbLikesDisc;
	}

	/**
	 * @return the actor1FbLikesDisc
	 */
	public String getActor1FbLikesDisc() {
		return actor1FbLikesDisc;
	}

	/**
	 * @param actor1FbLikesDisc the actor1FbLikesDisc to set
	 */
	public void setActor1FbLikesDisc(String actor1FbLikesDisc) {
		this.actor1FbLikesDisc = actor1FbLikesDisc;
	}

	/**
	 * @return the castFbLikesDisc
	 */
	public String getCastFbLikesDisc() {
		return castFbLikesDisc;
	}

	/**
	 * @param castFbLikesDisc the castFbLikesDisc to set
	 */
	public void setCastFbLikesDisc(String castFbLikesDisc) {
		this.castFbLikesDisc = castFbLikesDisc;
	}

	/**
	 * @return the budgetDisc
	 */
	public String getBudgetDisc() {
		return budgetDisc;
	}

	/**
	 * @param budgetDisc
	 *            the budgetDisc to set
	 */
	public void setBudgetDisc(String budgetDisc) {
		this.budgetDisc = budgetDisc;
	}
}
