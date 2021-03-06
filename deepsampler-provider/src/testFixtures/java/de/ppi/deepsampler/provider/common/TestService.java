/*
 * Copyright 2020  PPI AG (Hamburg, Germany)
 * This program is made available under the terms of the MIT License.
 */

package de.ppi.deepsampler.provider.common;

import java.sql.Date;
import java.time.LocalDateTime;

/**
 * A Service that will be instrumented to test the interceptors.
 */
public class TestService {

    public static final String HARD_CODED_RETURN_VALUE = "Some value";

    private int counter = 0;

    /**
     * This method returns a primitve parameter if the method is not sampled.
     * This Method is intended to be used in positive and negative tests.
     *
     * @param param The parameter that will be returned unchanged
     * @return the unchanged parameter value
     */
    public String echoParameter(final String param) {
        return param;
    }


    /**
     * A method that will always return -1 if it is not sampled
     * @return always -1
     */
    public int getMinusOne() {
        return -1;
    }

    /**
     * This method returns a non primitive parameter if the method is not mocked.
     * This Method is intended to be used in positive and negative tests.
     *
     * @param someObject The parameter that will be returned unchanged
     * @return the unchanged parameter value
     */
    public TestBean echoParameter(final TestBean someObject) {
        return someObject;
    }

    /**
     * This method is needed to test whether calls of void methods can be verified or not.
     *
     * @param someInt
     */
    @SuppressWarnings("unused")
    public void noReturnValue(final int someInt) {
        // There is nothing to do here, we are only interested in the method call itself.
    }

    @SuppressWarnings("unused")
    public Date testSqlDate(final RecTestBean someObject) {
        return new Date(1);
    }


    @SuppressWarnings("unused")
    public String methodWithTwoParameter(final String parameterOne, final String parameterTwo) {
        return HARD_CODED_RETURN_VALUE;
    }

    public LocalDateTime testLocalDateTime() {
        return LocalDateTime.of(2020, 10, 29, 10, 10, 10);
    }

    public String throwsException() throws TestException {
        // The Exception must be thrown by the Answer (Stub)
        return null;
    }

    public void voidThrowsException() throws TestException {
        // The Exception must be thrown by the Answer (Stub)
    }

    public int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        counter++;
    }

    public void setCounter(final int counter) {
        this.counter = counter;
    }

}
