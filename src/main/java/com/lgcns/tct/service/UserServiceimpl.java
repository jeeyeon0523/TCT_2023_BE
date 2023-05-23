package com.lgcns.tct.service;

import com.lgcns.tct.dto.UserInfoDto;
import com.lgcns.tct.dto.UserInsertDto;
import com.lgcns.tct.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

// 기제공 api service 구현체
@Service
@RequiredArgsConstructor
public class UserServiceimpl implements UserService {
    @Autowired
    private final UserMapper userMapper;
    
	@Override
	public UserInfoDto getUserInfo(String user_no){

        UserInfoDto result = userMapper.getUserInfo(user_no);
        
		return result;
	}

	@Override
	public int postUserInfo(List<UserInsertDto> user){
		int result = userMapper.postUserInfo(user);
		return result;
	}
}
