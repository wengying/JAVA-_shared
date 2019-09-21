## Homework 3 - Week 3

### Motivation
* Demonstrate your ability to program in an object-orientated fashion within the Java programming language

### Instructions
* There are two tasks to complete
    - Fix all compilation errors within the [FixMe](src/main/java/edu/nyu/cs9053/homework3/FixMe.java) class (and dependent classes) and ensure it is coded to standards outlined in lecture.
    - Create a command line program to read in a single [ASCII character](http://en.wikipedia.org/wiki/ASCII) (0-9 or A-Z, no lower case characters) and print it as [ASCII-art](http://en.wikipedia.org/wiki/Ascii_art)
        - Each letter should be 20 lines wide by 10 lines high       

### Implementation
* Ensure your code is correct by compiling and testing it
* A portion of your grade will be based upon readability and organization of your code.
    - Follow the naming guidelines of lecture
    - Break large functions into multiple functions based on logical organizations

### ASCII Instructions
* Create a `Letter` class placed in [directory](src/main/java/edu/nyu/cs9053/homework3/oo).
* The `Letter` class needs a constructor taking in the following parameters. 
    - `char[][]` of size 10 rows x 20 columns (so instantiated as `new char[10][20]`)
    - `PrintStream` used to output the ASCII-art
* The `Letter` class should also have a public method called `print` with no arguments which prints the art to the inputted `PrintStream` object
* Create a class named `AsciiArt` placed in [directory](src/main/java/edu/nyu/cs9053/homework3/oo) which contains the `main` method of your program.
* Your implementation must not import any packages within `java.awt` or `javax.imageio`
* Do not have subclasses of `Letter` (this will be covered in next lecture)
* How you print your letter is up to you (i.e., as long as you print using 10 rows and 20 columns and it is identifiable as the inputted letter then you are ok)
    - i.e., it does not need to be dynamic; supported ASCII letters may be hard coded
    
### Example Runs of Program
    $ java -cp TODO edu.nyu.cs9053.homework3.oo.AsciiArt 1
    $         11         
    $          1          
    $          1
    $          1
    $          1
    $          1
    $          1
    $          1
    $          1
    $       1111111       
    $ java -cp TODO edu.nyu.cs9053.homework3.oo.AsciiArt q
    $ unknown character
    $ java -cp TODO edu.nyu.cs9053.homework3.oo.AsciiArt Q
    $       .Q..Q..Q.         
    $     .Q.       .Q.         
    $   .Q.           .Q.
    $ .Q.              .Q.     
    $ .Q.              .Q.
    $ .Q.              .Q.
    $ .Q.              .Q.
    $   .Q.      .Q. .Q.
    $     .Q.      ..Q..
    $       .Q..Q..Q. .Q.
    

    