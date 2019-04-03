package com.gmail.cactuscata.episode21;

import javax.swing.JOptionPane;

final class Main {

	public final static void main(String[] args) {

		Lampe firstLight = new Lampe();
		Interrupteur firstInterrupter = new Interrupteur(firstLight);

		getInformation(firstLight, firstInterrupter);
		firstInterrupter.pressButton();
		getInformation(firstLight, firstInterrupter);
		JOptionPane.showMessageDialog(null, "Interrupteur.getButtonsPressed()" + Interrupteur.getButtonsPressed());

	}

	private final static void getInformation(Lampe light, Interrupteur interrupter) {
		JOptionPane.showMessageDialog(null, "lampe.getLighting() : " + light.getLighting());
		JOptionPane.showMessageDialog(null, "interupteur.isPressed() : " + interrupter.isPressed());
	}

}
