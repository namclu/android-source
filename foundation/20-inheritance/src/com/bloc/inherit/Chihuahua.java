package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the Chihuahua class below
 *
 *	Chiuahuas must be fed 5 times in order to grow
 *	larger.
/************************************************/

class Chihuahua extends Dog{
	
	/*
	 * feed
	 * Side-effect: 1. The Chihuahua gains weight
	 * 				2. Every 5 meals, the Chihuahua grows to a larger size, if possible
	 *				i.e. "tiny" -> "small" -> "average" -> "large"
	 * @return nothing
	 */
	@Override
	void feed(){
		super.mWeight += super.WEIGHT_GAINED_FROM_FEEDING;
		if (++super.mFeedCounter == 5) {
			super.changeSize(true);
			super.mFeedCounter = 0;
		}
	}
}
