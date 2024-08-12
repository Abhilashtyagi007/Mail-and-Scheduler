package com.email.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MailDto {

    private String mailFrom;
    private String mailTo;
    private String subject;
    private Body body;

    @Data
    @Builder
    public static class Body {
        private String type;
        private String content;

    }
}




