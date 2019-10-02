import java.util.Arrays;

public class DefaultBookReader extends DefaultReader implements BookReader {

    @Override public void read(Book book) {
	read(Arrays.toString(book.getWords()));
    }

}
