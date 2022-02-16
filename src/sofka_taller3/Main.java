package sofka_taller3;

/** 
 * Runs an application that manages a list of songs.
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.Library();
        library.runMenu();
    }
}
