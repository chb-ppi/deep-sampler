package org.deepmock.persistence.api;

public class PersistentPersonality {
    public static PersistentPersonalityAssistant source(SourceProvider sourceProvider) {
        return new PersistentPersonalityAssistant();
    }
}
