package com.gmail.cactuscata.episode42;

public class Main {

	public static void main(String[] args) {
		
		Quiz quiz = new GuiQuiz(new MathQuestion(2));
		quiz.sendQuestion();
		quiz.getResults();

	}

}
