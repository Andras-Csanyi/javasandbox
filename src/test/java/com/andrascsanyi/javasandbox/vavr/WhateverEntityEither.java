package com.andrascsanyi.javasandbox.vavr;

import io.vavr.control.Either;

public class WhateverEntityEither implements Either<ErrorResult, WhateverEntityResult> {

    @Override
    public ErrorResult getLeft() {
        return null;
    }

    @Override
    public boolean isLeft() {
        return false;
    }

    @Override
    public boolean isRight() {
        return false;
    }

    @Override
    public WhateverEntityResult get() {
        return null;
    }

    @Override
    public String stringPrefix() {
        return "";
    }
}