package org.dark.bridge.plane;

import org.dark.bridge.assembly.AssemblyIntf;
import org.dark.bridge.assembly.AssemblyOfEngine;

public class J15 extends AbstractPlane {

	@Override
	public void printPlane() {
		super.printPlane();
		System.out.println("歼15");
	}

	@Override
	public void printUnit(AssemblyIntf intf) {
		printPlane();
		intf.printUnitName();
	}
}
