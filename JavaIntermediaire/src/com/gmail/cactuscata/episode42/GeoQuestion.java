package com.gmail.cactuscata.episode42;

import java.util.ArrayList;
import java.util.HashMap;

public class GeoQuestion extends Question {

	private final int numberOfQuestion;
	private final ArrayList<Boolean> list = new ArrayList<>();
	private final HashMap<String, String> map = new HashMap<>();

	public GeoQuestion(final int numberOfQuestion) {
		this.numberOfQuestion = numberOfQuestion;
	}

	@Override
	public int getNumberOfQuestion() {
		return this.numberOfQuestion;
	}

	@Override
	public void sendQuestion(Quiz quiz) {
		setup();
		for(int i = 0; i < this.numberOfQuestion; i++){
			//quiz.wa
		}

	}

	@Override
	public int getGoodReponse() {
		return this.list.size();

	}

	private void setup() {
		map.put("France", "Paris");
		map.put("Albanie", "Tirana");
		map.put("Allemagne", "Berlin");
		map.put("Andorre", "Andorre-la-Vieille");
		map.put("Autriche", "Vienne");
		map.put("Belgique", "Bruxelles");
		map.put("Biélorussie", "Minsk");
		map.put("Bosnie-Herzégovine", "Sarajevo");
		map.put("Bulgarie", "Sofia");
		map.put("Chypre", "Nicosie");
		map.put("Croatie", "Zagreb");
		map.put("Danemark", "Copenhague");
		map.put("Espagne", "Madrid");
		map.put("Estonie", "Tallinn");
		map.put("Finlande", "Helsinki");
		map.put("France", "Paris");
		map.put("Grèce", "Athènes");
		map.put("Hongrie", "Budapest");
	}
}
