package com.bloc.objects;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;
	
	Ensemble ensemble = new Ensemble("The Beatles");
	
	/*
	 * Song
	 *
	 * Default Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first Song constructor
	/************************************************/
	Song() {
		mEnsemble = ensemble;
		mTitle = "Strawberry Fields";
		mYearReleased = 1969;
	}
	/*
	 * Song
	 *
	 * Side-effects: Sets the year of release to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second Song constructor
	/************************************************/
	Song(Ensemble pEnsemble, String pTitle) {
		this.mEnsemble = pEnsemble;
		this.mTitle = pTitle;
		mYearReleased = 0;
	}
	/*
	 * Song
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the third Song constructor
	/************************************************/
	Song(Ensemble pEnsemble, String pTitle, int pYearReleased) {
		this.mEnsemble = pEnsemble;
		this.mTitle = pTitle;
		this.mYearReleased = pYearReleased;
	}
}