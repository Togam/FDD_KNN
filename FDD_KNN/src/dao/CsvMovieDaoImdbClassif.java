package dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Movie;
import csv_access.CsvFile;

/**
 * @author six descamps lalande
 * 
 */
public class CsvMovieDaoImdbClassif implements MovieDaoInterface {

	private File file;
	private CsvFile csvFile;

	/**
	 * Constructeur
	 */
	private CsvMovieDaoImdbClassif() {
		super();
	}

	/**
	 * @param file
	 * @throws IOException
	 */
	public CsvMovieDaoImdbClassif(File file) throws IOException {
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
		List<Movie> movieImdbs = new ArrayList<Movie>();

		final List<String[]> data = csvFile.getData();
		final List<String[]> dataSansEntete = data; // juste data
		dataSansEntete.remove(0);

		for (String[] oneData : dataSansEntete) {
			Movie movie = tabToMovieImdbs(oneData);
			movieImdbs.add(movie);
		}

		return movieImdbs;
	}

	/**
	 * Permet de construire un objet film grâce à un tableau de string récupéré
	 * (ce tableau correspond à une ligne d'un fichier csv)
	 * 
	 * @param tab
	 * @return movie
	 */
	private Movie tabToMovieImdbs(String[] tab) {
		Movie movie = new Movie();

		movie.setDuration(Long.parseLong(tab[0]));
		movie.setDirectorFbLikes(Long.parseLong(tab[1]));
		movie.setActor1FbLikes(Long.parseLong(tab[2]));
		movie.setCastFbLikes(Long.parseLong(tab[3]));
		movie.setImdbDiscretise(tab[4]);

		long[] tabfinal = { movie.getDuration(), movie.getDirectorFbLikes(),
				movie.getActor1FbLikes(), movie.getCastFbLikes() };
		movie.setTab(tabfinal);

		return movie;
	}

}
