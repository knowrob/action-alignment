package main;

import java.util.ArrayList;
import alignmentAlgorithm.NeedlemanWunsch;
import alignmentAlgorithm.SmithWaterman;

import evaluation.ConfusionMatrix;
import fileReader.LabelsDATFileReader;
import ontology.Ontology;
import sequence.ActionSequence;
import sequenceElement.ActionElement;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		LabelsCSVFileReader r1 = new LabelsCSVFileReader();
//		LabelsCSVFileReader r2 = new LabelsCSVFileReader();
//		
//		ArrayList<ActionElement> seqLeft00 = r1.getSequence("Data/SequencesHands/lefthand-0-0-condensed.csv");
//		ArrayList<ActionElement> seqRight00 = r2.getSequence("Data/SequencesHands/righthand-0-0-condensed.csv");
//		
//		ActionSequence aLeft00 = new ActionSequence("lefthand-0-0", seqLeft00);
//		ActionSequence aRight00 = new ActionSequence("righthand-0-0", seqRight00);
//		
//		NeedlemanWunsch ndl = new NeedlemanWunsch(aLeft00, aRight00);
//		ndl.printMatrix();
//		ndl.printTraceback();
//		ndl.printAlignment();
		
		String url = "http://ias.cs.tum.edu/kb/knowrob.owl";
		Ontology ontology = new Ontology(url);
		
//		LabelsDATFileReader reader1 = new LabelsDATFileReader();
//		LabelsDATFileReader reader2 = new LabelsDATFileReader();
//		LabelsDATFileReader reader3 = new LabelsDATFileReader();
//		LabelsDATFileReader reader4 = new LabelsDATFileReader();
//		LabelsDATFileReader reader5 = new LabelsDATFileReader();
//		LabelsDATFileReader reader6 = new LabelsDATFileReader();
//		LabelsDATFileReader reader7 = new LabelsDATFileReader();
//		LabelsDATFileReader reader8 = new LabelsDATFileReader();
//		LabelsDATFileReader reader9 = new LabelsDATFileReader();
//		LabelsDATFileReader reader10 = new LabelsDATFileReader();
//		LabelsDATFileReader reader11 = new LabelsDATFileReader();
//		LabelsDATFileReader reader12 = new LabelsDATFileReader();
//		LabelsDATFileReader reader13 = new LabelsDATFileReader();
//		LabelsDATFileReader reader14 = new LabelsDATFileReader();
//		LabelsDATFileReader reader15 = new LabelsDATFileReader();
//		LabelsDATFileReader reader16 = new LabelsDATFileReader();
//		LabelsDATFileReader reader17 = new LabelsDATFileReader();
		LabelsDATFileReader reader18 = new LabelsDATFileReader();
		LabelsDATFileReader reader19 = new LabelsDATFileReader();
		LabelsDATFileReader reader20 = new LabelsDATFileReader();
		LabelsDATFileReader reader21 = new LabelsDATFileReader();
		LabelsDATFileReader reader22 = new LabelsDATFileReader();
		LabelsDATFileReader reader23 = new LabelsDATFileReader();
		LabelsDATFileReader reader24 = new LabelsDATFileReader();
		LabelsDATFileReader reader25 = new LabelsDATFileReader();
		LabelsDATFileReader reader26 = new LabelsDATFileReader();
		LabelsDATFileReader reader27 = new LabelsDATFileReader();
		LabelsDATFileReader reader28 = new LabelsDATFileReader();
		LabelsDATFileReader reader29 = new LabelsDATFileReader();
		LabelsDATFileReader reader30 = new LabelsDATFileReader();
		LabelsDATFileReader reader31 = new LabelsDATFileReader();
		LabelsDATFileReader reader32 = new LabelsDATFileReader();
		LabelsDATFileReader reader33 = new LabelsDATFileReader();
		
//		ArrayList<ActionElement> seqEgg06 = reader1.getSequence("Data/MakingEggs/S06/labels.dat");
//		ArrayList<ActionElement> seqEgg07 = reader2.getSequence("Data/MakingEggs/S07/labels.dat");
//		ArrayList<ActionElement> seqEgg08 = reader3.getSequence("Data/MakingEggs/S08/labels.dat");
//		ArrayList<ActionElement> seqEgg09 = reader4.getSequence("Data/MakingEggs/S09/labels.dat");
//		ArrayList<ActionElement> seqEgg11 = reader5.getSequence("Data/MakingEggs/S11/labels.dat");
//		ArrayList<ActionElement> seqEgg12 = reader6.getSequence("Data/MakingEggs/S12/labels.dat");
//		ArrayList<ActionElement> seqEgg13 = reader7.getSequence("Data/MakingEggs/S13/labels.dat");
//		ArrayList<ActionElement> seqEgg14 = reader8.getSequence("Data/MakingEggs/S14/labels.dat");
//		ArrayList<ActionElement> seqEgg15 = reader9.getSequence("Data/MakingEggs/S15/labels.dat");
//		ArrayList<ActionElement> seqEgg16 = reader10.getSequence("Data/MakingEggs/S16/labels.dat");
//		ArrayList<ActionElement> seqEgg17 = reader11.getSequence("Data/MakingEggs/S17/labels.dat");
//		ArrayList<ActionElement> seqEgg19 = reader12.getSequence("Data/MakingEggs/S19/labels.dat");
//		ArrayList<ActionElement> seqEgg20 = reader13.getSequence("Data/MakingEggs/S20/labels.dat");
//		ArrayList<ActionElement> seqEgg25 = reader14.getSequence("Data/MakingEggs/S25/labels.dat");
//		ArrayList<ActionElement> seqEgg53 = reader15.getSequence("Data/MakingEggs/S53/labels.dat");
//		ArrayList<ActionElement> seqEgg54 = reader16.getSequence("Data/MakingEggs/S54/labels.dat");
//		ArrayList<ActionElement> seqEgg55 = reader17.getSequence("Data/MakingEggs/S55/labels.dat");
		
		ArrayList<ActionElement> seqBro06 = reader18.getSequence("Data/MakingBrownie/S06/labels.dat");
		ArrayList<ActionElement> seqBro07 = reader19.getSequence("Data/MakingBrownie/S07/labels.dat");
		ArrayList<ActionElement> seqBro08 = reader20.getSequence("Data/MakingBrownie/S08/labels.dat");
		ArrayList<ActionElement> seqBro09 = reader21.getSequence("Data/MakingBrownie/S09/labels.dat");
		ArrayList<ActionElement> seqBro10 = reader22.getSequence("Data/MakingBrownie/S10/labels.dat");
		ArrayList<ActionElement> seqBro12 = reader23.getSequence("Data/MakingBrownie/S12/labels.dat");
		ArrayList<ActionElement> seqBro13 = reader24.getSequence("Data/MakingBrownie/S13/labels.dat");
		ArrayList<ActionElement> seqBro14 = reader25.getSequence("Data/MakingBrownie/S14/labels.dat");
		ArrayList<ActionElement> seqBro16 = reader26.getSequence("Data/MakingBrownie/S16/labels.dat");
		ArrayList<ActionElement> seqBro17 = reader27.getSequence("Data/MakingBrownie/S17/labels.dat");
		ArrayList<ActionElement> seqBro18 = reader28.getSequence("Data/MakingBrownie/S18/labels.dat");
		ArrayList<ActionElement> seqBro19 = reader29.getSequence("Data/MakingBrownie/S19/labels.dat");
		ArrayList<ActionElement> seqBro20 = reader30.getSequence("Data/MakingBrownie/S20/labels.dat");
		ArrayList<ActionElement> seqBro22 = reader31.getSequence("Data/MakingBrownie/S22/labels.dat");
		ArrayList<ActionElement> seqBro23 = reader32.getSequence("Data/MakingBrownie/S23/labels.dat");
		ArrayList<ActionElement> seqBro24 = reader33.getSequence("Data/MakingBrownie/S24/labels.dat");
		
//		ActionSequence aEgg06 = new ActionSequence("Egg_S06", seqEgg06);
//		ActionSequence aEgg07 = new ActionSequence("Egg_S07", seqEgg07);
//		ActionSequence aEgg08 = new ActionSequence("Egg_S08", seqEgg08);
//		ActionSequence aEgg09 = new ActionSequence("Egg_S09", seqEgg09);
//		ActionSequence aEgg11 = new ActionSequence("Egg_S11", seqEgg11);
//		ActionSequence aEgg12 = new ActionSequence("Egg_S12", seqEgg12);
//		ActionSequence aEgg13 = new ActionSequence("Egg_S13", seqEgg13);
//		ActionSequence aEgg14 = new ActionSequence("Egg_S14", seqEgg14);
//		ActionSequence aEgg15 = new ActionSequence("Egg_S15", seqEgg15);
//		ActionSequence aEgg16 = new ActionSequence("Egg_S16", seqEgg16);
//		ActionSequence aEgg17 = new ActionSequence("Egg_S17", seqEgg17);
//		ActionSequence aEgg19 = new ActionSequence("Egg_S19", seqEgg19);
//		ActionSequence aEgg20 = new ActionSequence("Egg_S20", seqEgg20);
//		ActionSequence aEgg25 = new ActionSequence("Egg_S25", seqEgg25);
//		ActionSequence aEgg53 = new ActionSequence("Egg_S53", seqEgg53);
//		ActionSequence aEgg54 = new ActionSequence("Egg_S54", seqEgg54);
//		ActionSequence aEgg55 = new ActionSequence("Egg_S55", seqEgg55);
		
		ActionSequence aBro06 = new ActionSequence("Bro_S06", seqBro06);
		ActionSequence aBro07 = new ActionSequence("Bro_S07", seqBro07);
		ActionSequence aBro08 = new ActionSequence("Bro_S08", seqBro08);
		ActionSequence aBro09 = new ActionSequence("Bro_S09", seqBro09);
		ActionSequence aBro10 = new ActionSequence("Bro_S10", seqBro10);
		ActionSequence aBro12 = new ActionSequence("Bro_S12", seqBro12);
		ActionSequence aBro13 = new ActionSequence("Bro_S13", seqBro13);
		ActionSequence aBro14 = new ActionSequence("Bro_S14", seqBro14);
		ActionSequence aBro16 = new ActionSequence("Bro_S16", seqBro16);
		ActionSequence aBro17 = new ActionSequence("Bro_S17", seqBro17);
		ActionSequence aBro18 = new ActionSequence("Bro_S18", seqBro18);
		ActionSequence aBro19 = new ActionSequence("Bro_S19", seqBro19);
		ActionSequence aBro20 = new ActionSequence("Bro_S20", seqBro20);
		ActionSequence aBro22 = new ActionSequence("Bro_S22", seqBro22);
		ActionSequence aBro23 = new ActionSequence("Bro_S23", seqBro23);
		ActionSequence aBro24 = new ActionSequence("Bro_S24", seqBro24);
		
		NeedlemanWunsch ndl1 = new NeedlemanWunsch(aBro06, aBro07);
		//ndl1.printMatrix();
		//ndl1.printTraceback();
		ndl1.printAlignment();
		
		NeedlemanWunsch ndl2 = new NeedlemanWunsch(aBro06, aBro07, ontology);
		//ndl2.printMatrix();
		//ndl2.printTraceback();
		ndl2.printAlignment();
		
		SmithWaterman smt1 = new SmithWaterman(aBro06, aBro07);
		//smt1.printMatrix();
		//smt1.printTraceback();
		smt1.printAlignment();
		
		SmithWaterman smt2 = new SmithWaterman(aBro06, aBro07, ontology);
		//smt2.printMatrix();
		//smt2.printTraceback();
		smt2.printAlignment();
		
		ArrayList<ActionSequence> aList = new ArrayList<ActionSequence>();
		
		aList.add(aBro06);
		aList.add(aBro07);
		aList.add(aBro08);
		aList.add(aBro09);
		aList.add(aBro10);
		aList.add(aBro12);
		aList.add(aBro13);
		aList.add(aBro14);
		aList.add(aBro16);
		aList.add(aBro17);
		aList.add(aBro18);
		aList.add(aBro19);
		aList.add(aBro20);
		aList.add(aBro22);
		aList.add(aBro23);
		aList.add(aBro24);
		
//		aList.add(aEgg06);
//		aList.add(aEgg07);
//		aList.add(aEgg08);
//		aList.add(aEgg09);
//		aList.add(aEgg11);
//		aList.add(aEgg12);
//		aList.add(aEgg13);
//		aList.add(aEgg14);
//		aList.add(aEgg15);
//		aList.add(aEgg16);
//		aList.add(aEgg17);
//		aList.add(aEgg19);
//		aList.add(aEgg20);
//		aList.add(aEgg25);
//		aList.add(aEgg53);
//		aList.add(aEgg54);
//		aList.add(aEgg55);
		
		ConfusionMatrix cm1 = new ConfusionMatrix(aList);
		cm1.printConfusionMatrix();
		
		ConfusionMatrix cm2 = new ConfusionMatrix(aList, ontology);
		cm2.printConfusionMatrix();
		
	}

}
