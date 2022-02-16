package sofka_taller3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Represents Class Library that extends ChooseSong class and implements ILibrary interface.
 * @author Juan Pablo Allin Cañas
 * @author Juan Esteban Patiño
 * @version 1.0
 */
public class Library extends ChooseSong implements ILibrary {

    /**
     * Creates a sonList object that contains an ArrayList for Songs.
     */
    private ArrayList<Song> songList = new ArrayList<>();

    /**
     * Creates a playlist object that contains an ArrayList for Songs.
     */
    protected ArrayList<Song> playlist = new ArrayList<>();

    /**
     * Creates a playsong object that contains the message from the ChooseSong
     * class.
     */
    static ChooseSong playsong = new ChooseSong();

    Scanner entry = new Scanner(System.in);

    /**
     * Display a menu, prompts for user input (int selection), and returns the input.
     *
     * @return int
     */
    public int Menu() {
        int option;
        System.out.print("\nQué te gustaría hacer? \n" +
                "1- Añadir canción de biblioteca a la lista de reproducción\n" +
                "2- Ver lista de reproducción \n" +
                "3- Reproducir lista de reproducción \n" +
                "4- Filtrar Canciones \n" +
                "5- Ordenar"
                + "\n\nSeleccionar opción: ");
        option = entry.nextInt();
        System.out.print("\n");
        return option;
    }

    /**
     * Displays menu from showMenu(): Contains a switch,
     * executes case based on returned int from showMenu().
     * Creation of an exception handling in case the user enters an input different from int.
     */
    public void runMenu() {
        try {
            int option = Menu();
            switch (option) {
                case 1:
                    addSongtoPlaylist();
                    runMenu();
                    break;
                case 2:
                    showPlaylist();
                    runMenu();
                    break;
                case 3:
                   // playPlaylist();
                    runMenu();
                    break;
                case 4:
                    //filterSong();
                    runMenu();
                    break;
                case 5:
                   // order();
                    runMenu();
                    break;
                default:
                    System.out.println("\nNo es una selección válida!\n");
                    runMenu();
            }
        } catch (InputMismatchException e) {
            System.out.println("\nDebes ingresar un número entero! Corre de nuevo el programa\n");
            entry.nextLine();
        }
    }

    /**
     * Creation of Song library.
     */
    public void Library() {
        songList.add(new Song(1, "Milk it", "2001-09-15", "4:10", "Rock", "../src/Imagenes/Nirvana.jpg", "Banda de rock de los 90'"));
        songList.add(new Song(2, "Pump it", "2005-08-07", "3:10", "Electrónica", "./Imagenes/BEP.jpg", "4 integrantes"));
        songList.add(new Song(3, "Velouria", "1991-01-03", "3:30", "Rock", "../src/Imagenes/Pixies.jpg", "Banda de rock"));
        songList.add(new Song(4, "Enjoy the Silence", "1994-04-29", "4:20", "Rock", "./Imagenes/DM.jpg", "Clásico"));
        songList.add(new Song(5, "Be A Body", "2012-09-09", "3:10", "Alternativo", "./Imagenes/Grimes.png", "Cantante Australiana"));
        songList.add(new Song(6, "Burn The Witch", "2015-12-17", "3:10", "Rock alternativo", "./Imagenes/Rh.jpg", "Banda Británica"));
        songList.add(new Song(7, "Chop Suey", "1998-07-22", "4:30", "Rock", "./Imagenes/SOAD.jfif", "Banda de rock USA"));
        songList.add(new Song(8, "Count Contessa", "2010-03-22", "4:00", "Rap", "./Imagenes/AzBanks.jpg", "Rapera USA"));
        songList.add(new Song(9, "Du Hast", "1994-11-27", "4:20", "Rock", "./Imagenes/Rammstein.jpg", "Banda de rock Alemania"));
        songList.add(new Song(10, "Bad", "1993-08-19", "3:50", "Pop", "./Imagenes/MJ.jpg", "Rey del pop"));
    }

    /**
     * Adds songs from the library to the playlist.
     */
    public void addSongtoPlaylist() {
        for (int i = 0; i < songList.size(); i++) {
            System.out.println(songList.get(i).toString());
        }
        try {
            System.out.print("\nEscribe el id de la canción que quieres agregar: ");
            int id = entry.nextInt();
            if (id <= 0 || id > 10) {
                System.out.println("\nIngrese un Id válido!");
            } else {
                for (Song song : songList) {
                    if (id == song.getId()) {
                        playlist.add(song);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("\nDebes ingresar un número entero!");
            entry.nextLine();
        }
    }

    /**
     * Displays playlist.
     */
    public void showPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("\nLa lista de reproducción está vacia!");
        } else {
            for (Song e : playlist) {
                System.out.println(e.toString());
            }
        }
    }
}
