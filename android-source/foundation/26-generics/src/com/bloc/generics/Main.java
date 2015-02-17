package com.bloc.generics;


import com.bloc.generics.things.*;

public class Main extends Object {

	public static void main(String [] args) {
		//I tried it this way, too - by instantiating the object first. Is that within the constraints of generics and this checkpoint?
		Book fiction = new Book();
		ToyBox toyBox = new ToyBox();
		
		Toy<ActionFigure> superman = new Toy<ActionFigure>(new ActionFigure());
		Toy<Spoon> spoon = new Toy<Spoon>(new Spoon());
		
		
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Place several Toy objects into toyBox
		/************************************************/

		toyBox.addToy(superman);
		toyBox.addToy(spoon);
		toyBox.addToy(new Toy<Book>(fiction));

		
		assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
