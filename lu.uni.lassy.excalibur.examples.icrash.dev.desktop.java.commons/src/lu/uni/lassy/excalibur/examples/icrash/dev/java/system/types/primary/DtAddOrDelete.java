package lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.primary;

import lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.design.JIntIs;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean;

public class DtAddOrDelete extends PtBoolean implements JIntIs {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 227L;
	
	/**
	 * Instantiates a new datatype latitude.
	 *
	 * @param r The primitive type of the real (double) number to create the datatype
	 */
	public DtAddOrDelete(boolean r) {
		super(r);
	}

	public PtBoolean is(){
		return new PtBoolean(this.equals(true)||this.equals(false));
	}

}
