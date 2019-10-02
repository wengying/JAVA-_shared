public class AnonExample {

    public static void main(String[] args) {
	AnonExample example = new AnonExample();
	example.read("Hello there, how are you", new Reader() {
		@Override public void read(String text) {
		    System.out.printf("Anon reader - %s%n", text);
		}
	    });
    }
    
    public void read(String text, Reader reader) {
	reader.read(text);
    }

}
