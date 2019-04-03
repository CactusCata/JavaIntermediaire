package com.gmail.cactuscata.episode42;

import java.util.Scanner;

public class ConsoleQuiz extends Quiz {

	private final Question question;

	public ConsoleQuiz(final Question question) {
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
		System.out.println(message);

	}

	@Override
	public int wantInt(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();

	}
	
	@Override
	public String want(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextLine();

	}

}
