package org.dark.bridge.plane;

import org.dark.bridge.assembly.AssemblyIntf;

public abstract class AbstractPlane {

	public void printPlane() {
		System.out.print("抽象飞机：");
	}
	
	public abstract void printUnit(AssemblyIntf intf);
}
