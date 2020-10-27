package org.deepsampler.core.error;

import org.deepsampler.core.model.SampleDefinition;
import org.deepsampler.core.model.SampledMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class VerifyException extends BaseException {

    public VerifyException(final SampledMethod sampledMethod, final int expected, final int actual) {
        super("The sampled method %s was " +
                "expected to get invoked %s times, " +
                "actually it got invoked %s times", sampledMethod.toString(), expected, actual);
    }

    public VerifyException(final SampledMethod sampledMethod, final Object[] args, final int expected, final int actual) {
        super("The sampled method %s called with %s was " +
                "expected to get invoked %s times, " +
                "actually it got invoked %s times", sampledMethod.toString(), formatArguments(args), expected, actual);
    }

    public VerifyException(final SampleDefinition actualDefinition, final Object[] wantedArgs , final int actualTimes) {
        super("The sampled method %s that was expected to be called with %s was actually called with %s (%s times).", actualDefinition.getSampleId(),
                formatArguments(wantedArgs), formatArguments(actualDefinition.getParameterValues()), actualTimes);
    }

    private static String formatArguments(final List<Object> args) {
        return formatArguments(args.toArray());
    }

    private static String formatArguments(final Object[] args) {
        if (args == null) {
            return "(null)";
        }

        final String formattedArgs = Arrays.asList(args).stream()//
            .map(Objects::toString)//
            .collect(Collectors.joining(", "));

        return "(" + formattedArgs + ")";
    }

}
