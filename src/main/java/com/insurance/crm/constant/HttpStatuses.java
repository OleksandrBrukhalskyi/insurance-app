package com.insurance.crm.constant;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HttpStatuses {
    public static final String OK = "OK";
    public static final String CREATED = "Created";

    public static final String BAD_REQUEST = "Bad Request";
    public static final String UNAUTHORIZED = "Unauthorized";
    public static final String FORBIDDEN = "Forbidden";
    public static final String NOT_FOUND = "Not Found";
    public static final String SEE_OTHER = "SEE_OTHER";
}
