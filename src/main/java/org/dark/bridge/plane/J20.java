package org.dark.bridge.plane;

import org.dark.bridge.assembly.AssemblyIntf;

public class J20 extends AbstractPlane {

	@Override
	public void printPlane() {
		super.printPlane();
		System.out.println("��20");
	}

	@Override
	public void printUnit(AssemblyIntf intf) {
		printPlane();
		intf.printUnitName();
	}
}
