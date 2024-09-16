package com.andrascsanyi.javasandbox.vavr;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WhateverEntity {

    private Long id;
    private String name;
    private String description;
}