package com.andrascsanyi.javasandbox.vavr;

import io.vavr.control.Either;
import java.util.UUID;

public class VavrPractice {

    public static void handle(Context context) {

        var result = Either.<ErrorResult, WhateverEntityInput>right(context.getWhateverEntityInput())
            .flatMap(validatedWhateverEntity -> validateInput(context.getWhateverEntityInput(), context.getCorrelationId()))
            .flatMap(input -> mapToWhateverEntity(input, context.getCorrelationId()))
            .flatMap(whateverEntity -> saveToDatabase(whateverEntity, context.getCorrelationId()))
            .flatMap(recordedEntity -> mapToWhateverEntityResult(recordedEntity, context.getCorrelationId()));
    }

    private static Either<ErrorResult, WhateverEntityInput> validateInput(WhateverEntityInput whateverEntityInput, UUID correlationId) {
    }

    private static Either<ErrorResult, WhateverEntity> mapToWhateverEntity(WhateverEntityInput whateverEntityInput, UUID correlationId) {
    }

    private static Either<ErrorResult, WhateverEntity> saveToDatabase(WhateverEntity whateverEntity, UUID correlationId) {
    }

    private static Either<ErrorResult, WhateverEntityResult> mapToWhateverEntityResult(WhateverEntity whateverEntity, UUID correlationId) {
    }
}