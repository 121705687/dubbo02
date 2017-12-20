package com.mapper;

import com.model.UserBigInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
	
//	@Select("select * from fnd_user where telephone=13033333333")
	List<UserBigInfo> select01();
}
