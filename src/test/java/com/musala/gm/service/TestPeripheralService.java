package com.musala.gm.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.musala.gm.repo.PeripheralRepositoryImpl;

public class TestPeripheralService {

	@Test
	public void testFindAllPeripheralServices() {
		PeripheralService service = new PeripheralServiceImpl(new PeripheralRepositoryImpl());
		assertTrue(service.findAll().size() > 0);
	}
}
