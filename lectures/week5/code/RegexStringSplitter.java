import java.util.regex.Pattern;

public class RegexStringSplitter implements StringSplitter {

    @Override public String[] split(String input, String by) {
        if ((input == null) || (by == null)) {
            return (input == null ? null : new String[] { input });
        }
        return input.split(Pattern.quote(by));
    }
    
}
