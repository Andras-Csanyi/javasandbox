package com.andrascsanyi.javasandbox.vavr;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WhateverEntityResult {

    private Long id;
    private String name;
    private String description;
}