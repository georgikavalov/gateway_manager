package com.musala.gm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musala.gm.model.Gateway;
import com.musala.gm.repo.GatewayRepository;

@Service("gatewayService")
public class GatewayServiceImpl implements GatewayService {

	private GatewayRepository gatewayRepo;
	
	@Autowired
	public GatewayServiceImpl(GatewayRepository gatewayRepo) {
		this.gatewayRepo = gatewayRepo;
	}

	@Override
	public List<Gateway> findAll() {
		return gatewayRepo.findAll();
	}
}
