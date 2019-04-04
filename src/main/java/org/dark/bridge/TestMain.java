package org.dark.bridge;

import org.dark.bridge.assembly.AssemblyIntf;
import org.dark.bridge.assembly.AssemblyOfEngine;
import org.dark.bridge.assembly.AssemblyOfRadar;
import org.dark.bridge.assembly.AssemblyOfUnderCart;
import org.dark.bridge.assembly.AssemblyOfWings;
import org.dark.bridge.plane.AbstractPlane;
import org.dark.bridge.plane.J15;
import org.dark.bridge.plane.J20;
import org.dark.bridge.plane.Su27;

public class TestMain {

	public static void main(String[] args) {
		AbstractPlane plane = null;
		AssemblyIntf intf = null;
		
		intf = new AssemblyOfEngine();
		plane = new J20();
		plane.printUnit(intf);
		
		intf = new AssemblyOfRadar();
		plane.printUnit(intf);
		
		intf = new AssemblyOfUnderCart();
		plane = new J15();
		plane.printUnit(intf);
		
		intf = new AssemblyOfWings();
		plane = new Su27();
		plane .printUnit(intf);
	}

}
