package com.liuweiwei.dao;

import java.util.List;

import com.liuweiwei.pojo.Customer;
import com.liuweiwei.pojo.QueryVo;

public interface CustomerMapper {
	List<Customer> findCustomerByVo(QueryVo vo);
	Integer findCustomerByVoCount(QueryVo vo);
	Customer findCustomerById(Long id);
	void updateCustomerById(Customer customer);
	void delCustomerById(Long id);
}
