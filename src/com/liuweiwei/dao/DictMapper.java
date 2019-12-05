package com.liuweiwei.dao;

import java.util.List;

import com.liuweiwei.pojo.BaseDict;

public interface DictMapper {
	List<BaseDict> findDictByCode(String code);
}
