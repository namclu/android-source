package com.bloc.securitypackages.apples;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/
import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.colors.Color;

public abstract class Apple extends Fruit {

	public Apple(String name, int calories, Color color, double weight){
		super(name, calories, color, weight);
	}
	
	abstract void bite();

}