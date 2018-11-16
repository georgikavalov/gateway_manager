package com.musala.gm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musala.gm.model.Peripheral;
import com.musala.gm.repo.PeripheralRepository;

@Service("peripheralService")
public class PeripheralServiceImpl implements PeripheralService {

	private PeripheralRepository peripheralRepo;

	@Autowired
	public PeripheralServiceImpl(PeripheralRepository peripheralRepo) {
		super();
		this.peripheralRepo = peripheralRepo;
	}

	@Override
	public List<Peripheral> findAll() {
		return peripheralRepo.findAll();
	}
}
