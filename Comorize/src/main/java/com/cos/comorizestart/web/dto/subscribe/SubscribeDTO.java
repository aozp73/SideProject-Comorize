package com.cos.comorizestart.web.dto.subscribe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SubscribeDTO {
	private int userId;
	private String username;
	private String profileImageUrl;
	private Integer subscribeState;
	private Integer equalUserState;
}
