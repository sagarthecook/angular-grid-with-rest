package com.sp.serviceproviders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.serviceproviders.dto.ResponseBean;
import com.sp.serviceproviders.service.ServiceProviderService;

@RestController
@RequestMapping(value = "/api/service_providers")
@CrossOrigin()
public class ServiceProviderController {

	@Autowired
	private ServiceProviderService providerService;

	@GetMapping(value = "/")
	public ResponseEntity<ResponseBean> findAlllServiceProviders() {
		ResponseEntity<ResponseBean> responseBean = null;
		try {
			ResponseBean bean = new ResponseBean(true, "Retrived data successfully",
					providerService.findAllServiceProviders());
			responseBean = new ResponseEntity<ResponseBean>(bean, HttpStatus.OK);
		} catch (Exception e) {
			ResponseBean bean = new ResponseBean(false, "data not retrived", null);
			responseBean = new ResponseEntity<ResponseBean>(bean, HttpStatus.OK);
		}
		return responseBean;
	}
}
