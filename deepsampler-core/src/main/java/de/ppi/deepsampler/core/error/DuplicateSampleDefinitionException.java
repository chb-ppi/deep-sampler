/*
 * Copyright 2020  PPI AG (Hamburg, Germany)
 * This program is made available under the terms of the MIT License.
 */

package de.ppi.deepsampler.core.error;

import de.ppi.deepsampler.core.model.SampleDefinition;
import de.ppi.deepsampler.core.model.SampleRepository;

/**
 * Exception type that is thrown while trying to add a duplicated {@link SampleDefinition}
 * to the {@link SampleRepository}
 *
 * @author Hendrik Surma
 */
public class DuplicateSampleDefinitionException extends BaseException {

    /**
     * Message to show when this exception occurs.
     */
    public static final String MESSAGE = "The SampleDefinition with ID '%s' for Methodcall '%s' " +
                    "has already been sampled. " +
                    "Keep in mind to sample methodcalls only once!";

    /**
     * Constructor.
     *
     * @param sampleDefinition the already existing instance of {@link SampleDefinition}
     */
    public DuplicateSampleDefinitionException(final SampleDefinition sampleDefinition) {
        super(MESSAGE, sampleDefinition.getSampleId(), sampleDefinition.getSampledMethod().getMethod().getName());
    }
}
