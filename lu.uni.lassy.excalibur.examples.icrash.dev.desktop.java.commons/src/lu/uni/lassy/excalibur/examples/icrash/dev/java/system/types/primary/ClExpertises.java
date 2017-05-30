package lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.primary;

import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean;

public class ClExpertises {
	private static final long serialVersionUID = 227L;
	public EtExpertise expertise;
	public PtBoolean init(EtExpertise expertise){

		this.expertise = expertise;
		
		return new PtBoolean(true);
	}
	public ClExpertises(EtExpertise expertise) {
		super();
		this.expertise = expertise;
	}
	

}
