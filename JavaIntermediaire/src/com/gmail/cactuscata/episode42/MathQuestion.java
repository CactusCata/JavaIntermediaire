package com.gmail.cactuscata.episode42;

import java.util.ArrayList;
import java.util.Random;

public class MathQuestion extends Question {

	private final int numberOfQuestion;
	private final ArrayList<Boolean> list = new ArrayList<>();

	public MathQuestion(final int numberOfQuestion) {
		this.numberOfQuestion = numberOfQuestion;
	}

	@Override
	public int getNumberOfQuestion() {
		return this.numberOfQuestion;
	}

	@Override
	public void sendQuestion(Quiz quiz) {
		Random random = new Random();
		for (int i = 0; i < this.numberOfQuestion; i++) {
			int first = random.nextInt(5) + 1;
			int seconds = random.nextInt(5)+ 1;
			int j = quiz.want(first + " + " + seconds);
			if (j != first + seconds) quiz.say("Mauvais réponse ! C'était " + (first + seconds ) + " !");
			else {
				quiz.say("Bonne réponse !");
				this.list.add(true);
			}
		}
	}

	@Override
	public int getGoodReponse() {
		return this.list.size();

	}

}
