package evaluation;

import java.util.ArrayList;

import ontology.Ontology;

import alignmentAlgorithm.NeedlemanWunsch;

import sequence.ActionSequence;

public class ConfusionMatrix {

	private ArrayList<ActionSequence> seqList;
	private int compare;
	private Ontology ontology;
	private int number;
	private double[][] confusionMatrix;
	
	public ConfusionMatrix(ArrayList<ActionSequence> seqList, int compare, Ontology ontology){
		this.seqList = seqList;
		this.compare = compare;
		this.ontology = ontology;
		number = seqList.size();
	}
	
	private void calculateConfusionMatrix(){
		confusionMatrix = new double[number][number];
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				if (i <= j) {
					NeedlemanWunsch ndl = new NeedlemanWunsch(seqList.get(i).getSequence(), seqList.get(j).getSequence(), compare, ontology);
					confusionMatrix[i][j] = ndl.getScore();
				} else {
					confusionMatrix[i][j] = confusionMatrix[j][i];
				}
			}
		}
	}
	
	public void printConfusionMatrix(){
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 12; j++){
				System.out.print(" ");
			}
			for (int k = 0; k < number; k++){
				String c;
				String identifier = seqList.get(k).getIdentifier();
				int length = identifier.length();
				if (i < 10 - length){
					c = " ";
				} else {
					c = String.valueOf(identifier.charAt(i - (10 - length)));
				}
				for (int l = 0; l < 5; l++){
					System.out.print(" ");
				}
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();
		this.calculateConfusionMatrix();
		for (int i = 0; i < number; i++){
			String identifier = seqList.get(i).getIdentifier();
			int length = identifier.length();
			for (int j = 0; j < 10 - length; j++){
				System.out.print(" ");
			}
			System.out.print(identifier + "  ");
			for (int k = 0; k < number; k++){
				double score = confusionMatrix[i][k];
				for (int l = 0; l < 6 - String.valueOf(score).length(); l++) {
					System.out.print(" ");
				}
				System.out.print(String.valueOf(score));
			}
			System.out.println();
		}
		long ende = System.currentTimeMillis();
		System.out.println();
		System.out.println("Zeit ben�tigt: " + ((ende - start)/1000.0) + " sec");
	}
	
}
