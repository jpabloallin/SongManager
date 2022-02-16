package sofka_taller3;
/**
 * Represents Class DurationException that extends Exception
 * @author Juan Pablo Allin Cañas
 * @author Juan Esteban Patiño
 * @version 1.0
 */
public class DurationException extends Exception{

    private String durationSent;
    /**
     * Creates an InvalidLengthException that takes in the invalid String.
     * @param inString
     */
    public DurationException(String inString) {
        this.durationSent = inString;
    }

    /**
     * @return Returns the inString of an InvalidLengthException.
     */
    public String getLengthSet() {
        return this.durationSent;
    }

    /**
     * @return Returns InvalidLengthException as a String.
     */
    @Override
    public String toString() {
        String returnString;
        returnString = this.durationSent + "Es un formato de duración invalido!\n";
        return returnString;
    }
}
