package org.deepsampler.core.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodCall {
    private final List<Object> args;
    private final Object returnValue;

    public MethodCall(final Object returnValue, final List<Object> args) {
        this.args = args == null ? new ArrayList<>() :  args;
        this.returnValue = returnValue;
    }

    public List<Object> getArgs() {
        return Collections.unmodifiableList(args);
    }

    public Object getReturnValue() {
        return returnValue;
    }
}
