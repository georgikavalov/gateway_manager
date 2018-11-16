package com.musala.gm.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPeripheralObject {

	@Test
	public void testPeripheralConstruction() {
		final int uID = 0;
		final String vendor = "Musala";
		
		Peripheral peripheral = new Peripheral(uID, vendor);
		assertArrayEquals(new int[] {peripheral.getUID()}, new int[] {uID});
		assertTrue(peripheral.getVendor().equals(vendor));
	}
}
