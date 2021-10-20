package fr.univamu.iut.ex4;
import java.util.ArrayList;
import java.util.List;

public class Corpus {
	private ArrayList<String> liste = new ArrayList<String>();
    
    public Corpus() {
    	this.liste = new ArrayList<String>();
    }

    
    public List<String> corpus;

    public void addText(String text) {
    	liste.add(text);
    }

    public List<String> getcorpus() {
        return liste;
    }

}