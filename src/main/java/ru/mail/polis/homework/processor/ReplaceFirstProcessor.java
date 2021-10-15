package ru.mail.polis.homework.processor;

public class ReplaceFirstProcessor implements TextProcessor {
    private static final ProcessingStage PROCESSING_STAGE = ProcessingStage.PROCESSING;
    private final String regex;
    private final String replacement;

    public ReplaceFirstProcessor(String regex, String replacement) {
        this.regex = regex;
        this.replacement = replacement;
    }

    @Override
    public int getStagePriority() {
        return PROCESSING_STAGE.getPriority();
    }

    @Override
    public String process(String text) {
        return text.replaceFirst(regex, replacement);
    }
}
