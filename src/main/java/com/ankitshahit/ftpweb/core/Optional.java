package com.ankitshahit.ftpweb.core;

import java.util.Objects;
import java.util.function.Supplier;

public class Optional<T> {
    private static final Optional<?> EMPTY = new Optional<>();
    private T value;

    private Optional(T t) {
        this.value = Objects.requireNonNull(t);
    }

    private Optional() {
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return Utils.isNullOrEmpty(t) ? empty() : of(t);
    }

    public static <T> Optional<T> empty() {
        @SuppressWarnings("unchecked")
        Optional<T> t = (Optional<T>) EMPTY;
        return t;
    }

    public static <T> Optional<T> exceptionOnNullable(T t, ErrorMessages errorMessages, ExceptionType exceptionType) {
        if (!Utils.isNullOrEmpty(t)) {
            return of(t);
        }
        throw Utils.newRuntimeException(exceptionType, errorMessages);
    }

    public static <T> Optional<T> validationExceptionOnNull(T t, ErrorMessages errorMessages) {
        if (!Utils.isNullOrEmpty(t)) {
            return of(t);
        }
        throw Utils.newRuntimeException(ExceptionType.VALIDATION_EXCEPTION, errorMessages);
    }

    public T get() {
        return this.value;
    }

    public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X {
        if (value != null) {
            return value;
        } else {
            throw exceptionSupplier.get();
        }
    }
}
