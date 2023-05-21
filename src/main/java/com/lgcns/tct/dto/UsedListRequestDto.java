package com.lgcns.tct.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsedListRequestDto {
    private String user_no;
    private int ptype;
    private String start_dt;
    private int page_size;
    private int page_index;
    private int offset;
}
