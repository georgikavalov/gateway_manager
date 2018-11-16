package com.musala.gm.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.musala.gm.model.Peripheral;

@Repository("peripheralRepository")
public class PeripheralRepositoryImpl implements PeripheralRepository {

	@Override
	public List<Peripheral> findAll() {
		List<Peripheral> retVal = new ArrayList<>();
		retVal.add(new Peripheral(0, "Musala"));		
		return retVal;
	}
}