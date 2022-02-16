package sofka_taller3;
import java.util.Comparator;

/**
 * Represents Class Ordering that implementes Comparator interface.
 * @author Juan Pablo Allin Cañas
 * @author Juan Esteban Patiño
 * @version 1.0
 */
public class Ordering implements Comparator<Song> {

    /**
     * Compares two songs lexicographically by their duration.
     * @param sn1 Song number1
     * @param sn2 Song number 2
     * @return Returns comparation.
     */
    @Override
    public int compare(Song sn1, Song sn2) {
        Song song1 = sn1;
        Song song2 = sn2;
        return (song1.getDuration().compareTo(song2.getDuration()));
    }
    /**
     * Compare songs by their Date.
     */
    Comparator date = (Comparator<Song>) Comparator.comparing(Song::getDate);

    /**
     * Compare songs by their Id.
     */
    Comparator id = (Comparator<Song>) Comparator.comparing(Song::getId);

    }

