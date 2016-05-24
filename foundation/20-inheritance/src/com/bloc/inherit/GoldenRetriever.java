package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the GoldenRetriever class below
 *
 *	Golden Retrievers shrink to a smaller size after
 *	playing only 3 times.
/************************************************/

class GoldenRetriever extends Dog{
	/*
	 * play
	 * Side-effect: 1. Golden Retriever loses weight
	 *				2. Every 3 play invocations, Golden Retriever shrinks to a smaller size, if possible
	 *				i.e. "large" -> "average" -> "small" -> "tiny"
	 * @return nothing
	 */
	@Override
	void play() {
		super.setWeight(super.getWeight() - super.WEIGHT_LOST_FROM_FEEDING);
		if (super.getWeight() < super.MINIMUM_WEIGHT) {
			super.setWeight(super.MINIMUM_WEIGHT);
		}
		// Pre-increment play counter
		if (++super.mPlayCounter == 3) {
			super.changeSize(false);
			super.mPlayCounter = 0;
		}
	}
}
	