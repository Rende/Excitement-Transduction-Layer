/**
 * 
 */
package  eu.excitementproject.tl.decomposition.exceptions;

/** Exception thrown by FragmentGraphGenerator if any of the needed data is missing in the input CAS or if the implementation can't generate the graphs for some
  reason
 * @author Lili
 *
 */
public class FragmentGraphGeneratorException extends Exception {
	
	private static final long serialVersionUID = 2565175967769513901L;

	/** Exception thrown by FragmentGraphGenerator if any of the needed data is missing in the input CAS or if the implementation can't generate the graphs for some
  reason
	 * @param message
	 */
	public FragmentGraphGeneratorException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
