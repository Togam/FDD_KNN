package dao;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import model.Movie;
import csv_access.CsvFile;

/**
 * @author six descamps lalande
 * 
 */
public class CsvMovieDaoRentab implements MovieDaoInterface {

	private File file;
	private CsvFile csvFile;

	/**
	 * Constructeur
	 */
	private CsvMovieDaoRentab() {
		super();
	}

	/**
	 * @param file
	 * @throws IOException
	 */
	public CsvMovieDaoRentab(File file) throws IOException {
		this();
		this.file = file;
		this.csvFile = new CsvFile(file);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see MovieDaoInterface#findAllMovies()
	 */
	public List<Movie> findAllMovies() {
		List<Movie> movies = new ArrayList<Movie>();

		final List<String[]> data = csvFile.getData();
		final List<String[]> dataSansEntete = data; // juste data
		dataSansEntete.remove(0);

		for (String[] oneData : dataSansEntete) {
			Movie movie = tabToMovieRentab(oneData);
			movies.add(movie);
		}

		return movies;
	}

	/**
	 * Permet de construire un objet film grâce à un tableau de string récupéré
	 * (ce tableau correspond à une ligne d'un fichier csv)
	 * 
	 * @param tab
	 * @return movie
	 */
	private Movie tabToMovieRentab(String[] tab) {
		Movie movie = new Movie();

		movie.setDuration(Long.parseLong(tab[0]));
		movie.setDirectorFbLikes(Long.parseLong(tab[1]));
		movie.setActor1FbLikes(Long.parseLong(tab[2]));
		movie.setCastFbLikes(Long.parseLong(tab[3]));
		movie.setLangage(Long.parseLong(tab[4]));
		movie.setBudget(Long.parseLong(tab[5]));
		movie.setRatioRentabDisc(tab[6]);

		long[] tabfinal = { movie.getDuration(), movie.getDirectorFbLikes(),
				movie.getActor1FbLikes(), movie.getCastFbLikes(),
				movie.getLangage(), movie.getBudget() };
		movie.setTab(tabfinal);

		return movie;
	}

}
