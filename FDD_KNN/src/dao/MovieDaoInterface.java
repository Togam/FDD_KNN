package dao;
import java.util.List;

import model.MovieImdb;

/**
 * @author six descamps lalande
 * 
 */
public interface MovieDaoInterface {

	List<MovieImdb> findAllMovies();
}