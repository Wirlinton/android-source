package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the GreatDane class below
 *
 *	Great Danes have an extra size category, "huge".
 *	After growing to a "large" size, they may grow
 *	to an additional, "huge" size after 3 meals.
/************************************************/
class GreatDane extends Dog {
			
	int fCounter = 0;

	@Override
	void feed() {
		mWeight += WEIGHT_GAINED_FROM_FEEDING;
		// Pre-increment feed counter
		if (++fCounter == 3) {
			changeSize(true);
			fCounter = 0;
		}
	}


	/* I was suprised to see that the code below actually worked. I take it this bypasses the change
	 *Size method by creating it manually here?
	
	@Override
			void feed() {
		mWeight = mWeight + WEIGHT_GAINED_FROM_FEEDING;
			if(mSize == "tiny" && fCounter == 2) {
				mSize = "Small";
				fCounter = 0;
			}
			if(mSize == "small" && fCounter == 2) {
				mSize = "average";
				fCounter = 0;
			}
			if(mSize == "average" && fCounter == 2) {
				mSize = "large";
				fCounter = 0;
			}
			if(mSize == "large" && fCounter == 2) {
				mSize = "huge";
				fCounter = 0;
			}
			else
			{	mSize = mSize; }
			fCounter++;		
		}
		*/
	}
