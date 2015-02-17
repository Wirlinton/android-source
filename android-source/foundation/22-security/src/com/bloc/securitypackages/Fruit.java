package com.bloc.securitypackages;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/


public abstract class Fruit extends Object {
	// The name of the fruit
	public String mName;
	// Number of calories
	public int mCalories;
	// Color of the fruit
	public Color mColor;
	// Weight of the fruit, in pounds
	public double mWeight;

	public Fruit() {
		this("Apple");
		// Default fruit
	}

	public Fruit(String name) {
		this(name, 0);
	}

	public Fruit(String name, int calories) {
		this(name, calories, null);
	}

	public Fruit(String name, int calories, Color color) {
		this(name, calories, color, 0d);
	}

	public Fruit(String name, int calories, Color color, double weight) {
		this.mName = name;
		this.mCalories = calories;
		this.mColor = color;
		this.mWeight = weight;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	int getCalories() {
		return mCalories;
	}

	void setCalories(int calories) {
		mCalories = calories;
	}

	public Color getColor() {
		return mColor;
	}

	public void setColor(Color color) {
		mColor = color;
	}

	protected double getWeight() {
		return mWeight;
	}

	public void setWeight(double weight) {
		mWeight = weight;
	}
}