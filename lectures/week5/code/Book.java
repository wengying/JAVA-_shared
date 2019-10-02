public class Book {

    private final String[] words;

    public Book(String text, StringSplitter stringSplitter) {
        this.words = stringSplitter.split(text, " ");
    }
    
    public int getWordCount() {
        return this.words.length;
    }

    public String[] getWords() {
        return words;
    }

}
