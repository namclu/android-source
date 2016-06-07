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
	List<Pastry> pastries = new ArrayList<Pastry>();


	public FavoritePastries() {
		/************************************************
 	 	 *	WORK HERE
		/************************************************/
		mPastryRatingMap = new HashMap<Integer, List<Pastry>>();
		//Take pastry item and add it to List<Pastry> pastries
		pastries.add(new Pastry("Cronut"));
		mPastryRatingMap.put(new Integer(5), pastries);
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
		//Take pastry item and add it to List<Pastry> pastries
		pastries.add(pastry);
		//Cast int to an Integer
		Integer ratings = new Integer(rating);
		
		//If pastry already exists, find pastry and update its rating
		if(mPastryRatingMap.containsValue(pastries)){
			mPastryRatingMap.replace(ratings, pastries);
		}
		//If pastry does not exist, add the pastry and its rating
		else{
			mPastryRatingMap.put(ratings, pastries);
		}
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
		//Take pastry item and add it to List<Pastry> pastries
		pastries.add(pastry);
		
		//If pastry is present, remove it and return true, else return false
        if(mPastryRatingMap.containsValue(pastries)){
            mPastryRatingMap.remove(pastries);
            return true;
        } else{
            return false;
		}
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
		//Take pastry item and add it to List<Pastry> pastries
		pastries.add(pastry);
		int pastryRating = 0;
		
		//If pastry exist, return its rating for pastry, else return -1
		for(Integer i : mPastryRatingMap.keySet()){
			if(mPastryRatingMap.get(i).equals(pastries)){
				pastryRating = i;
			} else{
				pastryRating = -1;
			}
		}
		return pastryRating;
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
		//Cast int to an Integer
		Integer ratings = new Integer(rating);
		
		
		
		//If the rating for a pastry matches, return pastry to keySet
		if(mPastryRatingMap.containsKey(ratings)){
			return mPastryRatingMap.get(ratings).keySet();
		} else{
			return null;
		}
		
	}

}