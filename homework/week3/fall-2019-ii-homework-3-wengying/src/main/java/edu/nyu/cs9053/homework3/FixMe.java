package edu.nyu.cs9053.homework3;

/**
 * User: blangel
 */
public class FixMe {

    private final String name;

    public final String metadata;

    public FixMe(String name) {
        this.name = name;
    }

    public FixMe(String name, String metadata) {
        this.name = name;
        metadata = new Processor(true).process(metadata);
    }

    public FixMe changeName(String name) {
        return new FixMe(name);
    }

    public FixMe changeName(String firstName, String lastName) {
        return new FixMe(changeName(firstName, lastName), metadata);
    }

    public String changeName(String firstName, String lastName) {
        return String.format("%s %s", firstName, lastName);
    }

    public String getName() {
        return name;
    }

}
