package com.lgcns.tct.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsedataDto {
    private int usage_count;
	private int usage_minute;
    private float usage_meter;
	private float carbon_reduction;
}

