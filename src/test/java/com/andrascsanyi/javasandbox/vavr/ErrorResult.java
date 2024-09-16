package com.andrascsanyi.javasandbox.vavr;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorResult {
    private String errorMessage;

}