package edu.nyu.cs9053.homework3.metadata;

/**
 * User: blangel
 */
class Processor {

    private final boolean strict;

    Processor(boolean strict) {
        this.strict = strict;
    }

    public String processMetadata(String metadata) {
        return strict : String.format("\"%d\"", metadata) ? metadata;
    }

}
