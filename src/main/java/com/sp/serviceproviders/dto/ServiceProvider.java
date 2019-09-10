package com.sp.serviceproviders.dto;

/**
 * @author sagar
 * SERVICE_PROVIDERS DTO TO MAINTIAN PROVIDERS INFO
 */
public class ServiceProvider {

	private String name, max_speed, description, contact_no, email, url;
	private Integer lowest_price;
	private Float rating;

	public ServiceProvider(String name, String max_speed, String description, String contact_no, String email,
			String url, Integer lowest_price, Float rating) {
		super();
		this.name = name;
		this.max_speed = max_speed;
		this.description = description;
		this.contact_no = contact_no;
		this.email = email;
		this.url = url;
		this.lowest_price = lowest_price;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public String getMax_speed() {
		return max_speed;
	}

	public String getDescription() {
		return description;
	}

	public String getContact_no() {
		return contact_no;
	}

	public String getEmail() {
		return email;
	}

	public String getUrl() {
		return url;
	}

	public Integer getLowest_price() {
		return lowest_price;
	}

	public Float getRating() {
		return rating;
	}

}
