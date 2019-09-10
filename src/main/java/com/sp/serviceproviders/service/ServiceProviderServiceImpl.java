package com.sp.serviceproviders.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sp.serviceproviders.dto.ServiceProvider;

@Service
public class ServiceProviderServiceImpl implements ServiceProviderService {

	@Override
	public List<ServiceProvider> findAllServiceProviders() throws Exception {
		List<ServiceProvider> providers = new ArrayList<ServiceProvider>();
		providers.add(new ServiceProvider("Idea", "150MB", "Idea providers", "8888688944", "sagarjdhv968@gmail.coom",
				"www.idea.com", 100, 4.5f));
		return providers;
	}

}
