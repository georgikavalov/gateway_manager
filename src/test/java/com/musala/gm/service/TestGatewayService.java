package com.musala.gm.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.musala.gm.repo.GatewayRepositoryImpl;

public class TestGatewayService {

	@Test
	public void testFindAllGatewayServices() {
			GatewayService service = new GatewayServiceImpl(new GatewayRepositoryImpl());
			assertTrue(service.findAll().size() > 0);

	}
}
