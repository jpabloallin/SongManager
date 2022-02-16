package sofka_taller3;

/**
 * Represents Interface ILibrary
 * @author Juan Pablo Allin Cañas
 * @author Juan Esteban Patiño
 * @version 1.0
 */

public interface ILibrary {

    void showPlaylist();
    void filterSong();
    Library list = new Library();
}
