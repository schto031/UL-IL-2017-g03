package lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.primary;

import lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.design.JIntIs;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean;

public enum EtExpertise implements JIntIs{
	Fire,OversizeTransport,HazardousElements,MassCrash,Snow;

	@Override
	public PtBoolean is() {
		// TODO Auto-generated method stub
		return new PtBoolean(this.name() == EtExpertise.Fire.name() ||
				this.name() == EtExpertise.HazardousElements.name() ||this.name() == EtExpertise.MassCrash.name() ||this.name() == EtExpertise.OversizeTransport.name() ||this.name() == EtExpertise.Snow.name());
	}

}
