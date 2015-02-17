package com.bloc.singletons;

import java.util.*;

/************************************************
 *	ASSIGNMENT:
 *	Populate this class with the defined methods.
 *
 *	This is a singleton class which maintains communication
 *	between Talker and Listener interface objects.
/************************************************/

public class Speakerphone extends Object {

	private static Speakerphone sPhone;
	
	private Speakerphone(){}
	
	public static Speakerphone get() {
		if (sPhone == null) {
			sPhone = new Speakerphone();
		}
	
		return sPhone;
	}
	
	HashSet<Listener> hSpeakerSet = new HashSet<Listener>();  
	
	/*
	 * get
	 *
	 * @return the singleton instance of Speakerphone (Speakerphone)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the get method
	/************************************************/
	
	public void addListener(Listener listener) {
		
		hSpeakerSet.add(listener);	
		
	}
	/*
	 * addListener
	 *
	 * Add a listener to Speakerphone's list
	 *
	 * @param listener an instance of the Listener interface (Listener)
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the addListener method
	/************************************************/
	public void removeListener(Listener listener) {
		
		hSpeakerSet.remove(listener);
	}
	/*
	 * removeListener
	 *
	 * Remove a Listener from the Speakerphone's list
	 *
	 * @param listener the Listener to remove (Listener)
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the removeListener method
	/************************************************/

	/*
	 * removeAll
	 *
	 * Removes all Listeners from Speakerphone
	 *
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the removeAll method
	/************************************************/

	
	public void removeAll() {
		HashSet<Listener> allListeners = hSpeakerSet;
		allListeners.removeAll(hSpeakerSet);
	}
	/*
	 * contains
	 *
	 * Checks whether a Listener is found in the Speakerphone's
	 * collection.
	 *
	 * @param listener
	 * @return `true` if the Listener has already been added to
	 *		   the Speakerphone, `false` otherwise (boolean)
	 */
	
	public boolean contains(Listener listener) {
		if (hSpeakerSet.contains(listener)){
			return true;
		}
		return false;
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the contains method
	/************************************************/	

	/*
	 * shoutMessage
	 *
	 * Sends the message to all of the Listeners tracked by Speakerphone
	 *
	 * @param talker a Talker whose message will be sent (Talker)
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the shoutMessage method
	/************************************************/
	public void shoutMessage(Talker talker) {
		
		Iterator<Listener> hearIt = hSpeakerSet.iterator();
		while (hearIt.hasNext()) {
			hearIt.next().onMessageReceived(talker.getMessage());
		}
	}
	/*
	 * shoutMessage
	 *
	 * Sends the message to all of the Listeners which are instances of
	 * the cls parameter
	 *
	 * @param talker a Talker whose message will be sent (Talker)
	 * @param cls a Class object representing the type which the Listener
	 *			  should extend from in order to receive the message (Class)
	 * @return nothing
	 *
	 * HINT: see Class.isAssignableFrom()
	 *		 http://docs.oracle.com/javase/7/docs/api/java/lang/Class.html#isAssignableFrom(java.lang.Class)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the shoutMessage method
	/************************************************/

	public void shoutMessage(Talker talker, Class<?> cls) {
		Class<?> c = cls.getClass();
		Iterator<Listener> hearIt = hSpeakerSet.iterator();
			if(c.isAssignableFrom(cls)) {
				hearIt.next().onMessageReceived(talker.getMessage());
			}
		}
			
	}