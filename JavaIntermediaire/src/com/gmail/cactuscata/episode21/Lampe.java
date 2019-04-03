package com.gmail.cactuscata.episode21;

final class Lampe {

	private boolean onLight;

	public Lampe() {
		this.onLight = false;
	}

	public final void toggleLight() {
		this.onLight = !this.onLight;
	}

	public final boolean getLighting() {
		return this.onLight;
	}

}
