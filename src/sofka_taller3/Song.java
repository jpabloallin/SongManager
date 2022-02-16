package sofka_taller3;

/**
 * Represents Class Song
 * @author Juan Pablo Allin Cañas
 * @author Juan Esteban Patiño
 * @version 1.0
 */
public class Song {

    private int id;
    private String title;
    private String date;
    private String duration;
    private String genre;
    private String coverPage;
    private String description;

    /**
     * Creates a Song object with an id, title, date, duration, genre, and coverPage.
     * @param id Song's id
     * @param title Song's title
     * @param date Song's date
     * @param duration Song's duration
     * @param genre Song's genre
     * @param coverPage Song's coverPage
     * @param description Song's description
     */
    public Song(int id, String title, String date, String duration, String genre, String coverPage, String description) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.coverPage = coverPage;
        this.description = description;
    }

    /**
     * @return the value of Id in a Song.
     */
    public int getId() {
        return id;
    }

    /**
     * @param id Sets Son's id to argument id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return Returns the value of Title in a Song.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title Sets Son's title to argument title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return Returns the value of Date in a Song.
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date Sets Song's date to argument date.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return Returns the value of Duration in a song.
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Creates DurationException.
     * this checks for validity by seeing if the argument String
     * contains both a colon and only numbers.
     * @param duration Sets song's duration to duration argument.
     * @throws DurationException
     */
    public void setDuration(String duration) throws DurationException {

        if (duration.matches("(\\d.*):(\\d.*)")) {
            this.duration = duration;
        } else {
            throw new DurationException(duration);
        }
    }

    /**
     * @return Returns value of genre in a Song.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre Sets Song's genre to argument genre.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return Returns value of coverpage in a Song.
     */
    public String getCoverPage() {
        return coverPage;
    }

    /**
     * @param coverPage Sets Song's coverPage to argument coverPage.
     */
    public void setCoverPage(String coverPage) {
        this.coverPage = coverPage;
    }

    /**
     * @return Returns value of description in a Song.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description Sets Song's description to argument description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Returns Song's data.
     */
    @Override
    public String toString() {
        return "Id: " + id + " Titulo: " + title + " Fecha: " + date + " Duración: " + duration + " Genero: " + genre
                + " Carátula: " + coverPage + " Descripción: " + description;
    }
}
