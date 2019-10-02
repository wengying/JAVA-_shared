import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
	BookReader bookReader = new DefaultBookReader();
	Reader reader = bookReader;
	reader.read("Hello there!");
	Book book = new Book("Hello how are you", new RegexStringSplitter());
	bookReader.read(book);
    }

    private static void read(StringSplitter splitter) {
	Book book = new Book("Hello how are you", splitter);
	System.out.printf("Book words - %s%n", Arrays.toString(book.getWords()));
    }

}
