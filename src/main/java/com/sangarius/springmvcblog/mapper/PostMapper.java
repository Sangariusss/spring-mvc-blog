package com.sangarius.springmvcblog.mapper;

import com.sangarius.springmvcblog.dto.PostDTO;
import com.sangarius.springmvcblog.model.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostMapper {

    PostDTO toDTO(Post post);
    Post toEntity(PostDTO postDTO);
}