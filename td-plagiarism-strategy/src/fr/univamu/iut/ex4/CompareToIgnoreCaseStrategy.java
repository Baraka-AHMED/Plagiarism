package fr.univamu.iut.ex4;

public class CompareToIgnoreCaseStrategy implements StrategieDeCalculDeDistance{
		
			private static final String String = null;

			public int calculdistance(Corpus corpus, String text) {
				PlagiarismChecker plagiat = new PlagiarismChecker(corpus, 10);;
			int distance = 1;
			for (String s : corpus.getcorpus()) {
				
				int newDistance = Math.abs(text.compareToIgnoreCase(s));
				System.out.println("(" + newDistance + ") " + s);
				
				
				
			}
			System.out.println(plagiat.checkPlagiarism(corpus, distance));
			System.out.println("Distance : ");
			
			return distance;
	}
    	
}