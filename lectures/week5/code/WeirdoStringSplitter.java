public class WeirdoStringSplitter implements StringSplitter {

    @Override public String[] split(String input, String by) {
	String[] split = new String[input.length() / 3];
	int index = 0;
	for (int i = 0; index + 3 < input.length(); index += 3) {
	    split[i++] = input.substring(index, index + 3);
	}
	return split;
    }

}
