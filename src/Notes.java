/**
 * PT:
 * Esta classe trata das notas musicais. Define a posição das mesmas no braço do instrumento, bem como
 * permite obter o nome das notas numa posição específica.
 *
 * EN:
 * This class deals with musical notes. Defines their position on the instrument's fretboard,
 * and allowing you to obtain the name of the notes in a specific position.
 */

public class Notes {

                                   //  C    D     E      F     G     A     B
    private String[] noteNames    = {"Dó", "Ré", "Mi", "Fá", "Sol", "Lá", "Si"};
    private String[] stringNames = {"Si", "Mi", "Lá", "Ré", "Sol"};

    private String[] stringG = {"Sol", "Sol#", "Lá", "Lá#", "si", "Dó", "Dó#", "Ré", "Ré#", "Mi", "Fá", "Fá#", "Sol"}; //Corda Sol (G)
    private String[] stringD = {"Ré", "Ré#", "Mi", "Fá", "Fá#", "Sol", "Sol#", "Lá", "Lá#", "si", "Dó", "Dó#", "Ré"}; //Corda Ré (D)
    private String[] stringA = {"Lá", "Lá#", "si", "Dó", "Dó#", "Ré", "Ré#", "Mi", "Fá", "Fá#", "Sol", "Sol#", "Lá"}; //Corda Lá (A)
    private String[] stringE = {"Mi", "Fá", "Fá#", "Sol", "Sol#", "Lá", "Lá#", "si", "Dó", "Dó#", "Ré", "Ré#", "Mi"}; //Corda Mi (E)
    private String[] stringB = {"si", "Dó", "Dó#", "Ré", "Ré#", "Mi", "Fá", "Fá#", "Sol", "Sol#", "Lá", "Lá#", "si"}; //Corda Si (B)


    


    public Notes(){}


    /**
     * This method obtain total array notes (total of musical notes)
     * @return notes length total of musical notes
     */
    public int getNotesLenght(){ return noteNames.length; }


    /**
     * This method obtain total array bass strings (total of bass strings)
     * @return strings number of string on bass
     */
    public int getStringsLenght(){ return stringNames.length; }


    /**
     * Method to get how many frets/notes B string have
     * @return total string B frets/notes
     */
    public int getBStringLenght(){ return stringB.length; }


    /**
     * Method to get how many frets/notes E string have
     * @return total string E frets/notes
     */
    public int getEStringLenght(){ return stringE.length; }


    /**
     * Method to get how many frets/notes A string have
     * @return total string A frets/notes
     */
    public int getAStringLenght(){ return stringA.length; }


    /**
     * Method to get how many frets/notes D string have
     * @return total string D frets/notes
     */
    public int getDStringLenght(){ return stringD.length; }


    /**
     * Method to get how many frets/notes G string have
     * @return total string D frets/notes
     */
    public int getGStringLenght(){ return stringG.length; }


    /**
     * Method to get the note name
     * @return note name
     */
    public String[] getNoteNames() { return noteNames; }


    /**
     * Method to get the string G notes position and name
     * @return note position/name
     */
    public String[] getStringG() { return stringG; }


    /**
     * Method to get the string D notes position and name
     * @return note position/name
     */
    public String[] getStringD() { return stringD; }


    /**
     * Method to get the string A notes position and name
     * @return note position/name
     */
    public String[] getStringA() { return stringA; }


    /**
     * Method to get the string E notes position and name
     * @return note position/name
     */
    public String[] getStringE() { return stringE; }


    /**
     * Method to get the string B notes position and name
     * @return note position/name
     */
    public String[] getStringB() { return stringB; }


    /**
     * Method to get the string name
     * @return string name
     */
    public String[] getStringNames() { return stringNames; }


}