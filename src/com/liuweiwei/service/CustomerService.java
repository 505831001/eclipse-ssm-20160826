package com.liuweiwei.service;

import java.util.List;

import com.liuweiwei.pojo.BaseDict;
import com.liuweiwei.pojo.Customer;
import com.liuweiwei.pojo.QueryVo;

public interface CustomerService {

	public List<BaseDict> findDictByCode(String code);
	
	public List<Customer> findCustomerByVo(QueryVo vo);
	public Integer findCustomerByVoCount(QueryVo vo);
	
	public Customer findCustomerById(Long id);
	
	public void updateCustomerById(Customer customer);
	
	public void delCustomerById(Long id);
}
