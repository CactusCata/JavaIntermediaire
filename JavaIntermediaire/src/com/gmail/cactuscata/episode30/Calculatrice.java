package com.gmail.cactuscata.episode30;

public class Calculatrice {

	private double result;

	public void additionate(double... numbers) {
		for (double number : numbers)
			this.result += number;
	}

	public void multiplicate(double... numbers) {
		for (double number : numbers)
			this.result *= number;
	}

	public void divise(double... numbers) {
		for (double number : numbers)
			this.result /= number;
	}

	public void substract(double... numbers) {
		for (double number : numbers)
			this.result -= number;
	}

	public void modulo(double... numbers) {
		for (double number : numbers)
			this.result %= number;
	}

	public void power(double... numbers) {
		for (double number : numbers)
			this.result = Math.pow(this.result, number);
	}

	public double getResult() {
		return this.result;
	}

}
