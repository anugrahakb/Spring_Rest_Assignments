package com.productstore;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.productstore.Product;

public interface Productservice {


	public void createEmployee(List<Product> emp);

	
	public Collection<Product> getAllEmployees();

	
	public Optional<Product> findEmployeeById(int id);

	
	public void deleteEmployeeById(int id);

	
	public void updateEmployee(Product emp);

	
	public void deleteAllEmployees();
}