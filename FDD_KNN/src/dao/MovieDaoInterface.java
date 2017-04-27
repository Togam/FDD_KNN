package dao;
import java.util.List;

import model.Movie;

/**
 * @author six descamps lalande
 * 
 */
public interface MovieDaoInterface {

	List<Movie> findAllMovies();
}