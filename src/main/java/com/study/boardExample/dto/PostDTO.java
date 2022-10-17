package com.study.boardExample.dto;

import lombok.Data;

public class PostDTO {
    @Data
    public static class PostResponse {
        private Long id;
        private String contents;
        private Integer cnt;
        private String email;
    }

    @Data
    public static class CreatePostRequest {
        private String contents;
    }
}
