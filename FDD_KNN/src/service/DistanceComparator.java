package service;

import java.util.Comparator;

import model.Result;

/**
 * simple comparator class used to compare results via distances
 * 
 * @author six lalande descamps
 * 
 */
public class DistanceComparator implements Comparator<Result> {
	public int compare(Result a, Result b) {
		return a.getDistance() < b.getDistance() ? -1 : a.getDistance() == b
				.getDistance() ? 0 : 1;
	}
}