package service;

import org.springframework.stereotype.Service;

import entity.Pincode;

@Service
public interface ServicePin {

	public Pincode getDetails(int pincode);

}
