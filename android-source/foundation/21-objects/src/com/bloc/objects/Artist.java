package com.bloc.objects;

class Artist extends Object {
	// The artist's first name
	String mFirstName;
	// The artist's last name
	String mLastName;

	/*
	 * Artist
	 *
	 * @param firstName (String)
	 * @param lastName (String)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the Artist constructor
	/************************************************/
	Artist(String pFirstName, String pLastName) {
		this.mFirstName = pFirstName;
		this.mLastName = pLastName;

	}
}