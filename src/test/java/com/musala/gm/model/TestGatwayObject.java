package com.musala.gm.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestGatwayObject {
	
	@Test
	public void testGatewayCreation() {
		final String serialNumber = "";
		final String ident = "";
		final byte[] ipAddress = new byte[] {(byte) 192,(byte) 168, 0, 1};
		
		Gateway gateway = new Gateway(serialNumber, ident, ipAddress);
		assertTrue(gateway.isValid());
	}
}
