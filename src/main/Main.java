package main;

import java.awt.List;
import java.io.File;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Set;

import org.semanticweb.HermiT.Reasoner;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.ConsoleProgressMonitor;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.SimpleConfiguration;

import fileReader.DataFileReader;
import fileReader.SequenceFileReader;
import alignmentAlgorithm.NeedlemanWunsch;
import alignmentAlgorithm.SmithWaterman;
import sequence.ActionSequence;
import sequenceElement.ActionElement;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		ActionElement reach = new ActionElement("Reaching");
		ActionElement take = new ActionElement("TakingSomething");
		ActionElement move = new ActionElement("Moving");
		ActionElement put = new ActionElement("PuttingDown");
		ActionElement release = new ActionElement("Releasing");
		ActionElement wait = new ActionElement("Waiting");
		
		ArrayList<ActionElement> seq1 = new ArrayList<ActionElement>();
		seq1.add(reach);
		seq1.add(take);
		seq1.add(move);
		seq1.add(put);
		seq1.add(release);
		seq1.add(wait);
		
		ArrayList<ActionElement> seq2 = new ArrayList<ActionElement>();
		seq2.add(reach);
		seq2.add(take);
		seq2.add(move);
		seq2.add(wait);
		seq2.add(wait);
		seq2.add(put);
		seq2.add(release);
		seq2.add(wait);
		*/
		
		/*
		SequenceFileReader reader1 = new SequenceFileReader();
		SequenceFileReader reader2 = new SequenceFileReader();
		
		ArrayList<ActionElement> seq1 = reader1.getSequence("C:/Users/Administrator/Desktop/Data/sequences-johannes/lefthand-0-2-condensed.csv");
		ArrayList<ActionElement> seq2 = reader2.getSequence("C:/Users/Administrator/Desktop/Data/sequences-johannes/lefthand-0-11-condensed.csv");
		
		NeedlemanWunsch ndl = new NeedlemanWunsch(seq1, seq2);
		
		ndl.printMatrix();
		ndl.printTraceback();
		ndl.printAlignment();
			
		SmithWaterman smt = new SmithWaterman(seq1, seq2);
		
		smt.printMatrix();
		smt.printTraceback();
		smt.printAlignment();
		*/
		
		/*
		DataFileReader reader1 = new DataFileReader();
		DataFileReader reader2 = new DataFileReader();
		DataFileReader reader3 = new DataFileReader();
		DataFileReader reader4 = new DataFileReader();
		DataFileReader reader5 = new DataFileReader();
		DataFileReader reader6 = new DataFileReader();
		DataFileReader reader7 = new DataFileReader();
		DataFileReader reader8 = new DataFileReader();
		DataFileReader reader9 = new DataFileReader();
		DataFileReader reader10 = new DataFileReader();
		DataFileReader reader11 = new DataFileReader();
		DataFileReader reader12 = new DataFileReader();
		DataFileReader reader13 = new DataFileReader();
		DataFileReader reader14 = new DataFileReader();
		DataFileReader reader15 = new DataFileReader();
		DataFileReader reader16 = new DataFileReader();
		DataFileReader reader17 = new DataFileReader();
		
		ArrayList<ActionElement> seq1 = reader1.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S06/labels.dat");
		ArrayList<ActionElement> seq2 = reader2.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S07/labels.dat");
		ArrayList<ActionElement> seq3 = reader3.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S08/labels.dat");
		ArrayList<ActionElement> seq4 = reader4.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S09/labels.dat");
		ArrayList<ActionElement> seq5 = reader5.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S11/labels.dat");
		ArrayList<ActionElement> seq6 = reader6.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S12/labels.dat");
		ArrayList<ActionElement> seq7 = reader7.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S13/labels.dat");
		ArrayList<ActionElement> seq8 = reader8.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S14/labels.dat");
		ArrayList<ActionElement> seq9 = reader9.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S15/labels.dat");
		ArrayList<ActionElement> seq10 = reader10.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S16/labels.dat");
		ArrayList<ActionElement> seq11 = reader11.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S17/labels.dat");
		ArrayList<ActionElement> seq12 = reader12.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S19/labels.dat");
		ArrayList<ActionElement> seq13 = reader13.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S20/labels.dat");
		ArrayList<ActionElement> seq14 = reader14.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S25/labels.dat");
		ArrayList<ActionElement> seq15 = reader15.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S53/labels.dat");
		ArrayList<ActionElement> seq16 = reader16.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S54/labels.dat");
		ArrayList<ActionElement> seq17 = reader17.getSequence("C:/Users/Administrator/Desktop/Data/MakingEggsAnnotatedData_ASUAnnotation/S55/labels.dat");
		
		ActionSequence a1 = new ActionSequence("S06", seq1);
		ActionSequence a2 = new ActionSequence("S07", seq2);
		ActionSequence a3 = new ActionSequence("S08", seq3);
		ActionSequence a4 = new ActionSequence("S09", seq4);
		ActionSequence a5 = new ActionSequence("S11", seq5);
		ActionSequence a6 = new ActionSequence("S12", seq6);
		ActionSequence a7 = new ActionSequence("S13", seq7);
		ActionSequence a8 = new ActionSequence("S14", seq8);
		ActionSequence a9 = new ActionSequence("S15", seq9);
		ActionSequence a10 = new ActionSequence("S16", seq10);
		ActionSequence a11 = new ActionSequence("S17", seq11);
		ActionSequence a12 = new ActionSequence("S19", seq12);
		ActionSequence a13 = new ActionSequence("S20", seq13);
		ActionSequence a14 = new ActionSequence("S25", seq14);
		ActionSequence a15 = new ActionSequence("S53", seq15);
		ActionSequence a16 = new ActionSequence("S54", seq16);
		ActionSequence a17 = new ActionSequence("S55", seq17);
		
		ArrayList<ActionSequence> aList = new ArrayList<ActionSequence>();
		aList.add(a1);
		aList.add(a2);
		aList.add(a3);
		aList.add(a4);
		aList.add(a5);
		aList.add(a6);
		aList.add(a7);
		aList.add(a8);
		aList.add(a9);
		aList.add(a10);
		aList.add(a11);
		aList.add(a12);
		aList.add(a13);
		aList.add(a14);
		aList.add(a15);
		aList.add(a16);
		aList.add(a17);
		
		ConfusionMatrix cm = new ConfusionMatrix(aList);
		cm.printConfusionMatrix();
		*/
		
		try {
			
			/*
			OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
			IRI iri = IRI.create("http://ias.cs.tum.edu/kb/knowrob.owl");
			OWLOntology ontology = manager.loadOntologyFromOntologyDocument(iri);
			//for (OWLClass cls : ontology.getClassesInSignature()){
			//	System.out.println(cls);
			//}
			//System.out.println();
			OWLDataFactory dataFactory = manager.getOWLDataFactory();
			OWLClass closingADoorClass = dataFactory.getOWLClass(IRI.create("http://ias.cs.tum.edu/kb/knowrob.owl#ClosingADoor"));
			OWLClass parallelExtensionClass = dataFactory.getOWLClass(IRI.create("http://ias.cs.tum.edu/kb/knowrob.owl#ParallelExtension"));
			//Set<OWLClassExpression> set = actionClass.getSuperClasses(ontology);
			//for (OWLClassExpression clsExpression : set){
			//	System.out.println(clsExpression);
			//}
			//System.out.println();
			OWLReasonerFactory reasonerFactory = new Reasoner.ReasonerFactory();
			//ConsoleProgressMonitor progressMonitor = new ConsoleProgressMonitor();
			//OWLReasonerConfiguration config = new SimpleConfiguration(progressMonitor);
			OWLReasoner reasoner = reasonerFactory.createNonBufferingReasoner(ontology);
			
			NodeSet<OWLClass> nodeSet = reasoner.getSuperClasses(closingADoorClass, false);
			for (Node<OWLClass> cls : nodeSet){
				System.out.println(cls.getRepresentativeElement());
			}
			System.out.println();
			nodeSet = reasoner.getSuperClasses(parallelExtensionClass, false);
			for (Node<OWLClass> cls : nodeSet){
				System.out.println(cls.getRepresentativeElement());
			}
			*/
			
			
			OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
			OWLDataFactory dataFactory = manager.getOWLDataFactory();
			OWLReasonerFactory reasonerFactory = new Reasoner.ReasonerFactory();
			OWLOntology ontology = manager.loadOntologyFromOntologyDocument(IRI.create("http://ias.cs.tum.edu/kb/knowrob.owl"));
			OWLReasoner reasoner = reasonerFactory.createReasoner(ontology);
			
			System.out.println("Class1: OpeningADoor");
			OWLClass class1 = dataFactory.getOWLClass(IRI.create("http://ias.cs.tum.edu/kb/knowrob.owl#OpeningADoor"));
			NodeSet<OWLClass> superClasses1 = reasoner.getSuperClasses(class1, false);
			Set<Node<OWLClass>> set1 = superClasses1.getNodes();
			ArrayList<Node<OWLClass>> list1 = new ArrayList<Node<OWLClass>>(set1);
			int depth1 = list1.size();
			System.out.println("Depth: " + depth1);
			OWLClass[] array1 = new OWLClass[depth1];
			System.out.println("SuperClasses of Class1");
			for (int i = 0; i < depth1; i++){
				array1[i] = list1.get(i).getRepresentativeElement();
				System.out.println(array1[i]);
			}
			
			System.out.println();
			
			System.out.println("Class2: ParallelExtension");
			OWLClass class2 = dataFactory.getOWLClass(IRI.create("http://ias.cs.tum.edu/kb/knowrob.owl#ParallelExtension"));
			NodeSet<OWLClass> superClasses2 = reasoner.getSuperClasses(class2, false);
			Set<Node<OWLClass>> set2 = superClasses2.getNodes();
			ArrayList<Node<OWLClass>> list2 = new ArrayList<Node<OWLClass>>(set2);
			int depth2 = list2.size();
			System.out.println("Depth: " + depth2);
			OWLClass[] array2 = new OWLClass[depth2];
			System.out.println("SuperClasses of Class2");
			for (int i = 0; i < depth2; i++){
				array2[i] = list2.get(i).getRepresentativeElement();
				System.out.println(array2[i]);
			}
			
			System.out.println();
			
			System.out.println("Lowest common ancestor:");
			OWLClass ancestor = null;
			for (int i = depth1 - 1; i >=0; i--){
				for (int j = depth2 - 1; j >= 0; j--) {
					if (array1[i].equals(array2[j])) {
						ancestor = array1[i];	
					}
					if (ancestor != null){
						break;
					}
				}
				if (ancestor != null){
					break;
				}
			}
			System.out.println(ancestor);
			NodeSet<OWLClass> superClasses3 = reasoner.getSuperClasses(ancestor, false);
			Set<Node<OWLClass>> set3 = superClasses3.getNodes();
			int depth3 = set3.size();
			System.out.println("Depth: " + depth3);
			System.out.println("SuperClasses of ancestor");
			for (Node<OWLClass> cls : superClasses3){
				System.out.println(cls.getRepresentativeElement());
			}
			
			System.out.println();
			
			double wup = (2.0 * depth3) / ((depth1 - depth3) + (depth2 - depth3) + 2.0 * depth3);
			System.out.println("WUP similarity: " + wup);
			
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
