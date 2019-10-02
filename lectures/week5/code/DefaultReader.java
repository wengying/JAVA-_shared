public class DefaultReader implements Reader {

    @Override public void read(String text) {
	System.out.printf("DefaultReader read - %s%n", text);
    }

}
