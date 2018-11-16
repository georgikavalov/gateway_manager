package com.musala.gm.repo;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.musala.gm.model.Peripheral;

public class TestPeripheralRepo {
	@Test
	public void testPeripheralepository() {
		PeripheralRepository peripheralRepo = new PeripheralRepositoryImpl();
		
		List<Peripheral> peripherals = peripheralRepo.findAll();
		assertTrue(peripherals.size() > 0);
	}
}
