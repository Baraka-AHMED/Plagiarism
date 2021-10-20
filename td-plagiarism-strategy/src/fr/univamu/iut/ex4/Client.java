package fr.univamu.iut.ex4;


public class Client {
    public static void main(String[] args) {
    	StrategieDeCalculDeDistance test = new CompareToIgnoreCaseStrategy();
    	
    	
		
    	Corpus corpus = new Corpus();
		
		corpus.addText("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		corpus.addText("test");
		
		System.out.println(test.calculdistance(corpus, "Hello"));





		
    }}

