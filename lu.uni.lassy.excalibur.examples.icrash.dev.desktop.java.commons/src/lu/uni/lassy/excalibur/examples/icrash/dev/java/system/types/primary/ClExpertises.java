package lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.primary;

import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean;

public class ClExpertises {
	public EtExpertise expertise;
	public PtBoolean init(EtExpertise expertise){

		this.expertise = expertise;
		
		return new PtBoolean(true);
	}
	

}
