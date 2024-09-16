package com.andrascsanyi.javasandbox.vavr;

import java.util.UUID;
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
public class Context {

    private UUID correlationId;
    private WhateverEntityInput whateverEntityInput;
}