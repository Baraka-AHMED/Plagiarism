package fr.univamu.iut.ex4;


 public class CompareToStrategy implements StrategieDeCalculDeDistance{
	 
	public int calculdistance(Corpus corpus, String text) {

		int distance = 1;
		for (String s : corpus.getcorpus()) {

			int newDistance = Math.abs(text.compareTo(s));
			System.out.println("(" + newDistance + ") " + s);
			System.out.println("taille: " + s.length());
			
			
			if (distance > newDistance)
				distance = newDistance;
		}
		
		System.out.println("Distance : ");
		return distance;
	}


	}
