package com.study.boardExample.dto;

import com.study.boardExample.domain.Post;
import lombok.Data;

import java.util.Date;
import java.util.List;

public class MemberDTO {

    @Data
    public static class MemberResponse{
        private Long id;
        private String name;
        private Integer age;
        private String gender;
        private String level;
        private String tel;
        private Date createDt;
        private Date lastLoginDt;
        private List<Post> postList;
    }

}
