package eu.excitementproject.tl.laputils;

import static org.uimafit.factory.AnalysisEngineFactory.createPrimitiveDescription;

import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.resource.ResourceInitializationException;

import de.tudarmstadt.ukp.dkpro.core.maltparser.MaltParser;
//import de.tudarmstadt.ukp.dkpro.core.tokit.BreakIteratorSegmenter;
import de.tudarmstadt.ukp.dkpro.core.treetagger.TreeTaggerPosLemmaTT4J;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpPosTagger;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpSegmenter;

import eu.excitementproject.eop.lap.LAPAccess;
import eu.excitementproject.eop.lap.LAPException;
import eu.excitementproject.eop.lap.implbase.LAP_ImplBaseAE;

/**
 * 
 * 
 * @author Tae-Gil Noh
 *
 */
public class DependencyLevelLapEN extends LAP_ImplBaseAE implements LAPAccess {

	public DependencyLevelLapEN() throws LAPException
	{
		
		AnalysisEngineDescription[] descArr = new AnalysisEngineDescription[4];
		try {
		descArr[0] = createPrimitiveDescription(OpenNlpSegmenter.class);
		descArr[1] = createPrimitiveDescription(TreeTaggerPosLemmaTT4J.class);
		descArr[2] = createPrimitiveDescription(OpenNlpPosTagger.class);
		descArr[3] = createPrimitiveDescription(MaltParser.class,
		MaltParser.PARAM_VARIANT, null,
		MaltParser.PARAM_PRINT_TAGSET, true);
		} catch (ResourceInitializationException e) {
		throw new LAPException("Unable to create AE descriptions", e);
		}
		// b) call initializeViews()
		initializeViews(descArr);
		// c) set lang ID
		languageIdentifier = "EN"; // set languageIdentifer
				
		// force load model. 
		this.generateSingleTHPairCAS("Hello world.", "Hello everyone."); 

	}	

}
