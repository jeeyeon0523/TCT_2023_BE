package com.lgcns.tct.mapper;
import com.lgcns.tct.dto.UserInfoDto;
import com.lgcns.tct.dto.UserInsertDto;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    UserInfoDto getUserInfo(@Param("user_no")String user_no);

    int postUserInfo(List<UserInsertDto> user);
}
