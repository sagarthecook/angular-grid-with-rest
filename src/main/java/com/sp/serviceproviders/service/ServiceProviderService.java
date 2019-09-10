package com.sp.serviceproviders.service;

import java.util.List;

import com.sp.serviceproviders.dto.ServiceProvider;

/**
 * @author sagar
 *
 */
public interface ServiceProviderService {

	public List<ServiceProvider> findAllServiceProviders() throws Exception;
}
