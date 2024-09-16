package com.andrascsanyi.javasandbox.controllers.graphql;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Header {
    private Integer id;
    private String name;
    private String value;
}