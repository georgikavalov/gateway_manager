package com.musala.gm.repo;

import java.util.List;

import com.musala.gm.model.Gateway;

public interface GatewayRepository {
	List<Gateway> findAll();
}
