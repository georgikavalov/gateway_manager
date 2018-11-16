package com.musala.gm.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.musala.gm.model.Gateway;

@Repository("gatewayRepository")
public class GatewayRepositoryImpl implements GatewayRepository {

	@Override
	public List<Gateway> findAll() {
		List<Gateway> gs = new ArrayList<>();
		Gateway g = new Gateway("823174-28364-1", "Printer Gateway", new byte[] {100, 100, 50, 0});
		g.addPeripheral(0, "Musala");
		gs.add(g);
		return gs;
	}
}