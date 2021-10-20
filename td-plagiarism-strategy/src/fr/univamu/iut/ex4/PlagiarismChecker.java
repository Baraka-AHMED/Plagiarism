package fr.univamu.iut.ex4;
public class PlagiarismChecker {
	private int theresthold;
	Corpus corpus;
	
	public PlagiarismChecker (Corpus corpus2, int thereshold) {
	}
	
	public int getTheresthold() {
		return theresthold;
	}

	public void setTheresthold(int theresthold) {
		this.theresthold = theresthold;
	}
	
	public boolean checkPlagiarism(Corpus corpus, int distance) {
		
		if (theresthold > distance) {
			System.out.println("Plagiat");
			return true; }
		else
		System.out.println("Non Plagiat");
		return false;
		
	}
}
	
