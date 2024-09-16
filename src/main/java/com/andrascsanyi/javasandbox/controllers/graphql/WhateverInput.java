package com.andrascsanyi.javasandbox.controllers.graphql;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class WhateverInput {
    private Integer id;
    private String name;
}