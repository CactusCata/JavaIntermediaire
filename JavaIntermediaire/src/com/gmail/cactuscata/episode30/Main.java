package com.gmail.cactuscata.episode30;

public class Main {

	public static void main(String[] args) {

		Calculatrice calculatrice = new Calculatrice();

		calculatrice.additionate(1.0d, 5.0d);
		calculatrice.multiplicate(5.0d, 5.0d);
		calculatrice.power(8.0d);
		getValue(calculatrice);

	}

	private static void getValue(Calculatrice calculatrice) {
		System.out.println(calculatrice.getResult());
	}

}
