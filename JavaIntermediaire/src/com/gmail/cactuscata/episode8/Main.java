package com.gmail.cactuscata.episode8;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String strNumberOne = JOptionPane.showInputDialog("Saississez le premier nombre !");
		String strNumberTwo = JOptionPane.showInputDialog("Saississez le second nombre !");

		JOptionPane.showMessageDialog(null, "L'addition de " + strNumberOne + " + " + strNumberTwo + " = "
				+ (Integer.parseInt(strNumberTwo) + Integer.parseInt(strNumberOne)));

	}

}
