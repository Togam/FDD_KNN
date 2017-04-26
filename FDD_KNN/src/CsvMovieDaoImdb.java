import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author six descamps lalande
 * 
 */
public class CsvMovieDaoImdb implements MovieDaoInterface {

	private File file;
	private CsvFile csvFile;

	/**
	 * Constructeur
	 */
	private CsvMovieDaoImdb() {
		super();
	}

	/**
	 * @param file
	 * @throws IOException
	 */
	public CsvMovieDaoImdb(File file) throws IOException {
		this();
		this.file = file;
		this.csvFile = new CsvFile(file);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see MovieDaoInterface#findAllMovies()
	 */
	public List<MovieImdb> findAllMovies() {
		List<MovieImdb> movieImdbs = new ArrayList<MovieImdb>();

		final List<String[]> data = csvFile.getData();
		final List<String[]> dataSansEntete = data; // juste data
		dataSansEntete.remove(0);

		for (String[] oneData : dataSansEntete) {
			MovieImdb movie = tabToMovieImdbs(oneData);
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
	private MovieImdb tabToMovieImdbs(String[] tab) {
		MovieImdb movie = new MovieImdb();

		movie.setDuration(Integer.parseInt(tab[0]));
		movie.setDirectorFbLikes(Integer.parseInt(tab[1]));
		movie.setActor1FbLikes(Integer.parseInt(tab[2]));
		movie.setGross(Integer.parseInt(tab[3]));
		movie.setCastFbLikes(Integer.parseInt(tab[4]));
		movie.setMovieFbLikes(Integer.parseInt(tab[5]));
		movie.setImdbDiscretise(tab[6]);

		return movie;
	}

}
