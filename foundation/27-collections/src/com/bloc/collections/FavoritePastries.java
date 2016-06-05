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
	//private HashMap<Integer, List<Pastry>> mPastryRatingMap;
	private HashMap<List<Pastry>, Integer> mPastryRatingMap;
	public FavoritePastries() {
		/************************************************
 	 	 *	WORK HERE
		/************************************************/
		Pastry cronut = new Pastry("Cronut");
		//mPastryRatingMap = new HashMap<Integer, List<Pastry>>();
		mPastryRatingMap = new HashMap<List<Pastry>, Integer>();
		mPastryRatingMap.put((List)cronut, new Integer(5));
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
		//If pastry already exists, find pastry and update its rating hashmap
		if(mPastryRatingMap.containsValue(pastry)){
			mPastryRatingMap.replace((List)pastry, rating);
		}  
		//If pastry does not exist, add the pastry and its rating to hashmap
		else{
			mPastryRatingMap.put((List)pastry, rating);
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
		//If pastry is present, remove it and return true, else return false
		if(mPastryRatingMap.containsValue(pastry)){
			mPastryRatingMap.remove(pastry);
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
		//If pastry exists, returns the rating for that pastry. If not found, returns -1
		return mPastryRatingMap.getOrDefault(pastry, -1);
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
		/* Set<Pastry> pastriesForRatingList = new Set<Pastry>();
		
		//If rating exists in hashmap, put the corresponding pastries into a list and return that list
		for(HashMap<Integer, List<Pastry>> i : mPastryRatingMap){
			if(mPastryRatingMap.containsValue(rating)){
				pastriesForRatingList.put(mPastryRatingMap.get())
			}
		}
			return pastriesForRatingList.keySet();
		}
		else{
			return null;
		} */
		return null;
	}

}