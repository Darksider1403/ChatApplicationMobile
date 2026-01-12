package com.chat_application.ChatApplication.Mapper;

import org.mapstruct.Mapper;

import com.chat_application.ChatApplication.Dto.Response.PostResponseWithoutUser;
import com.chat_application.ChatApplication.Entities.Post;

@Mapper(componentModel = "spring")
public interface PostMapper {
    PostResponseWithoutUser toUserResponse(Post post);

}
