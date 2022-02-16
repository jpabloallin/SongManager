package sofka_taller3;

/**
 * Represents Class ChooseSong that extends class Playsong.
 * @author Juan Pablo Allin Cañas
 * @author Juan Esteban Patiño
 * @version 1.0
 */
public class ChooseSong extends PlaySong {

    /** 
     * @return Returns message about playlist reproduction.
     */
    @Override
    public String playSong() {
      return "La lista de reproducción se está reproducciendo...";
    }
  }
