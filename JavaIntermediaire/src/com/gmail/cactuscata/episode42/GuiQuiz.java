package com.gmail.cactuscata.episode42;

import javax.swing.JOptionPane;

public class GuiQuiz extends Quiz {

	private final Question question;

	public GuiQuiz(final Question question) {
		this.question = question;
	}

	@Override
	public void sendQuestion() {
		question.sendQuestion(this);

	}

	@Override
	public void getResults() {
		say("Bonne réponse : " + question.getGoodReponse() + "/" + question.getNumberOfQuestion() + " !");

	}

	@Override
	public void say(String message) {

		JOptionPane.showMessageDialog(null, message);

	}

	@Override
	public int want(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));

	}

}
