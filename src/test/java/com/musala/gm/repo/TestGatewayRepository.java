package com.musala.gm.repo;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.musala.gm.model.Gateway;

public class TestGatewayRepository {
	@Test
	public void testGatewayRepository() {
		GatewayRepository gatewayRepo = new GatewayRepositoryImpl();
		
		List<Gateway> gateways = gatewayRepo.findAll();
		assertTrue(gateways.size() > 0);
	}
}
