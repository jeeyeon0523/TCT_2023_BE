package com.lgcns.tct.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.lgcns.tct.dto.UserInfoDto;
import com.lgcns.tct.dto.UserInsertDto;

public interface UserService {
    //기제공 api Service interface
    public UserInfoDto getUserInfo(@Param("user_no")String user_no);

    public int postUserInfo(List<UserInsertDto> user_no);
}
