package com.gmail.cactuscata.episode8;

public class Task {

	private int power;
	private String title, description;
	private boolean check = false;

	public int getPower() {
		return power;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
