package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the Chihuahua class below
 *
 *	Chiuahuas must be fed 5 times in order to grow
 *	larger.
/************************************************/
class Chihuahua extends Dog {

	int fCounter = 0;
	
	@Override
	void feed() {
		mWeight += WEIGHT_GAINED_FROM_FEEDING;
		// Pre-increment feed counter
		if (++fCounter == 5) {
			changeSize(true);
			fCounter = 0;
		}
	}
}