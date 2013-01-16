package decomposition;

import java.util.List;

import org.apache.uima.jcas.JCas;

import decomposition.entities.EntailmentUnit;
import decomposition.entities.TextualInput;

/**
 * This class implements the entailment unit creation for German. 
 * 
 * TO BE IMPLEMENTED BY DFKI/OMQ
 * 
 * @author Kathrin
 *
 */

public class EntailmentUnitCreatorGerman implements EntailmentUnitCreator {
	
	//read annotated fragments on TextualInputCAS and extract subfragments; store both fragments and subfragments and their relations
	public List<EntailmentUnit> generateEntailmentUnits(JCas in) {
		//for example: remove all modifiers
		//create a recursive method List<EntailmentUnit> removeModifiers(EntailmentUnit eu) {foreach eu: removeModifiers; if not change: break loop}
		return null;
	}
	
}
