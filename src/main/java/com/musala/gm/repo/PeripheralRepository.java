package com.musala.gm.repo;

import java.util.List;

import com.musala.gm.model.Peripheral;

public interface PeripheralRepository {
	List<Peripheral> findAll();
}
