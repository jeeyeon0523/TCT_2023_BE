package com.lgcns.tct.mapper;

import com.lgcns.tct.dto.UsedataDto;
import com.lgcns.tct.dto.UsedListDto;
import com.lgcns.tct.dto.UsedListRequestDto;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface UsedataMapper {    
    

    UsedataDto getUseData(@Param("user_no")String user_no, @Param("start_dt")String start_dt);

    //🔨🔨이곳에 코드를 작성하세요!

    // List<UsedListDto> getUsedList(@Param("user_no")String user_no, @Param("start_dt")String start_dt);

    //pageNation
    List<UsedListDto> getUsedList(UsedListRequestDto request);
    int getUsedListTotalCount(UsedListRequestDto request);

}




