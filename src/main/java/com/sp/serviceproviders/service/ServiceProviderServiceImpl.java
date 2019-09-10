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
		providers.add(new ServiceProvider("Idea", "150MB", "Idea providers", "8888688944", "idea@idea.coom",
				"www.idea.com", 100, 4.5f));
		providers.add(new ServiceProvider("Vodafone", "200MB", "Vodafone providers", "1987542163", "customer@Vodafone.coom",
				"www.idea.com", 200, 4.5f));
		providers.add(new ServiceProvider("Jio", "250MB", "Jio providers", "7458963210", "jio@jio.coom",
				"www.idea.com", 100, 4.5f));
		providers.add(new ServiceProvider("Airtel", "150MB", "Airtel providers", "7458691235", "airtel@airtel.coom",
				"www.idea.com", 100, 4.5f));
		providers.add(new ServiceProvider("BSNL", "160MB", "BSNL providers", "8888688944", "bsnl@bsnl.coom",
				"www.idea.com", 100, 4.5f));
		providers.add(new ServiceProvider("MTNL", "120MB", "MTNL providers", "9865485475", "mtnl@mtnl.coom",
				"www.idea.com", 100, 4.5f));
		return providers;
	}

}
