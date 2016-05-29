package com.bloc.securitypackages.apples;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/
import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.colors.Red;

public class Macintosh extends Apple {

	public Macintosh() {
		super(Macintosh.class.getSimpleName(), 200, new Red(), 0.14d);
	}

	public void bite() {
		setWeight(getWeight() - 0.01d);
	}

}