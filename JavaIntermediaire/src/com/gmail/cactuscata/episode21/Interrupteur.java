package com.gmail.cactuscata.episode21;

final class Interrupteur {

	private boolean press;
	private Lampe lampe;
	private static int buttonsPressed;

	public Interrupteur(Lampe lampe) {
		this.lampe = lampe;
		this.press = false;
		buttonsPressed++;
	}

	public final void pressButton() {
		this.press = !this.press;
		this.lampe.toggleLight();
	}

	public final boolean isPressed() {
		return this.press;
	}

	public final static int getButtonsPressed() {
		return buttonsPressed;
	}

}
