package com.chat_application.ChatApplication.Dto.Request;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AvatUserReq {
    String username;
    String file; // Thêm thuộc tính để nhận tệp
}
