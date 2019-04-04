package org.dark.bridge.plane;

import org.dark.bridge.assembly.AssemblyIntf;

public class Su27 extends AbstractPlane {

	@Override
	public void printPlane() {
		super.printPlane();
		System.out.println("ÌK27");
	}
	
	@Override
	public void printUnit(AssemblyIntf intf) {
		printPlane();
		intf.printUnitName();
	}

}
