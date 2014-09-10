package eu.excitementproject.tl.evaluation.fragmentannotator;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
//import org.junit.Ignore;
import org.junit.Test;

import eu.excitementproject.eop.lap.LAPException;
import eu.excitementproject.tl.decomposition.exceptions.FragmentAnnotatorException;
import eu.excitementproject.tl.evaluation.utils.EvaluationMeasures;

public class FragmentAnnotatorEvaluationTest {
	
	@Test
	public void test() {
	
		Logger logger = Logger.getLogger("eu.excitementproject.tl.evaluation.fragmentannotator: test");
		logger.setLevel(Level.INFO);
		
		try {
			EvaluationMeasures eval = FragmentAnnotatorEvaluator.evaluateFragments(
//					"src/test/resources/WP2_public_data_CAS_XMI/nice_email_3", 
//					"src/test/resources/WP2_public_data_CAS_XMI/ALMA_social_media",
//					"target/WP2_public_data_CAS_XMI/ALMA_social_media",
					
					"src/test/resources/WP2_public_data_CAS_XMI/NICE_open/all/",
					
//					"eu.excitementproject.tl.decomposition.fragmentannotator.SentenceAsFragmentAnnotator",
					"eu.excitementproject.tl.decomposition.fragmentannotator.KeywordBasedFixedLengthFragmentAnnotator",
//					"eu.excitementproject.tl.decomposition.fragmentannotator.KeywordBasedFragmentAnnotator", 
					"IT");
			
			logger.info(eval.toString());
			
		} catch (LAPException e) {
			logger.error("Error creating the LAP object");
			e.printStackTrace();
		} catch (FragmentAnnotatorException e) {
			logger.error("Error creating fragment annotator object");
			e.printStackTrace();
		} catch (IOException e) {
			logger.error("I/O error");
			e.printStackTrace();
		}
		
	}
}
