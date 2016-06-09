package com.bloc.collections;

import java.util.*;

/*
 * FavoritePastries
 * 
 * This class maintains a record of Pastry objects and their
 * relation to a 1 to 5 rating scale.
 *
 * For example:
 * 5 Star Pastries: Cronut, Cherry Pie
 * 4 Star Pastries: Strudel, Apple Pie
 * 3 Star Pastries: Bear Claw
 * 2 Star Pastries: Pop-Tart
 * 1 Star Pastries: Pot Pie
 *
 * A pastry may not have duplicate entries
 */
public class FavoritePastries {

	/************************************************
 	 *	ASSIGNMENT:
	 *	Use a HashMap to store the relationship
	 *	between rating and pastry: HashMap<Integer, List<Pastry>>
	/************************************************/
	HashMap<Integer, List<Pastry>> mPastryRatingMap;


	public FavoritePastries() {
		/************************************************
 	 	 *	WORK HERE
		/************************************************/
		mPastryRatingMap = new HashMap<Integer, List<Pastry>>();
		
		//Create a HashMap and initialize with just the ratings (1-5) and a blank list of pastries
		for(int i = 1; i <=5; i++){
			mPastryRatingMap.put(new Integer(i), new ArrayList<Pastry>());
		}
	}

	/* 
	 * addPastry
	 *
	 * Add a Pastry to the FavoritePastries class.
	 *
	 * This method stores this Pastry and its
	 * associated rating in some sort of data structure.
	 *
	 * If this Pastry already exists in FavoritePastries,
	 * its old rating should be updated.
	 *
	 * @param pastry The Pastry to store
	 * @param rating The rating to associate with it
	 * @return nothing
	 */
	public void addPastry(Pastry pastry, int rating) {
		/************************************************
 	 	 *	WORK HERE
		/************************************************/
		Collection<Pastry> pastries = new ArrayList<Pastry>();
		int ratingForPastry = getRatingForPastry(pastry);
		
		//Check to see if Pastry already exists
		if(ratingForPastry > 0){
			//If Pastry already exists w/ a different rating, update its rating 
			if(ratingForPastry != rating){
				//Remove Pastry from the old rating
				removePastry(pastry);
				//Add Pastry to new rating
				pastries = mPastryRatingMap.get(rating);
				pastries.add(pastry);
			} else{
				return;
			}
		}
		//If Pastry does not exist, add Pastry
		pastries = getPastriesForRating(rating);
		pastries.add(pastry);
	}

	/* 
	 * removePastry
	 *
	 * Remove a Pastry from FavoritePastries
	 *
	 * This method removes any reference to this exact
	 * Pastry object and its associated rating
	 *
	 * @param pastry The Pastry to remove
	 * @return true if the Pastry was found and removed,
	 *		   false otherwise
	 */
	public boolean removePastry(Pastry pastry) {
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
		boolean isRemoved = false;
		int ratingForPastry = getRatingForPastry(pastry);
		Collection<Pastry> pastries = new ArrayList<Pastry>();
		
		//If pastry is found, remove pastry from rating, and return true
		if(ratingForPastry != -1){
			pastries = getPastriesForRating(ratingForPastry);
			pastries.remove(pastry);
			isRemoved = true;
		}
		//If Pastry not found, return false
		return isRemoved;
	}

	/* 
	 * getRatingForPastry
	 *
	 * Return the associated rating for a given Pastry
	 *
	 * This method will find the associated rating for
	 * this Pastry inside of FavoritePastries and return
	 * it to its caller.
	 *
	 * @param  pastry The Pastry for which a rating must
	 * 		   be recovered
	 * @return the rating associated with this Pastry or
	 *		   -1 if not found among FavoritePastries
	 */
	public int getRatingForPastry(Pastry pastry) {
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
		int ratingFound = -1;
		
		//If Pastry is not found, return -1
		
		//If Pastry is found, return its rating
		return ratingFound;
	}

	/* 
	 * getPastriesForRating
	 *
	 * Return a Set of all the Pastries with a given
	 * rating.
	 *
	 * This method returns a Set<Pastry> object containing
	 * references to all of the Pastries associated with
	 * a particular rating.
	 *
	 * @param  rating The rating of the Pastry objects the
	 *		   caller wishes to recover
	 * @return A Set of all the Pastry objects with a rating
	 * 		   of `rating`. Returns an empty set if none are
	 *         found
	 */
	public Collection<Pastry> getPastriesForRating(int rating) {
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
		
		return null;
	}

}