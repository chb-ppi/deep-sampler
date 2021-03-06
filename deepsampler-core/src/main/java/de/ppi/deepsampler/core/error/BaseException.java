/*
 * Copyright 2020  PPI AG (Hamburg, Germany)
 * This program is made available under the terms of the MIT License.
 */

package de.ppi.deepsampler.core.error;

public class BaseException extends RuntimeException {

    public BaseException(final String message, final Object... args) {
        super(String.format(message, args));
    }

    public BaseException(final String message, final Throwable cause, final Object... args) {
        super(String.format(message, args), cause);
    }
}
