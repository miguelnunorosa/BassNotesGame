import java.util.Random;
import java.util.Scanner;

/**
 * This class covers everything related to the 4-string bass
 */

public class BassFiveString {

    private static final Note notes = new Note();
    private static final Random numRandom = new Random();

    private static int getFretPosition, getStringFromFourBassString, getStringFromFiveBassString;



    /**
     * Main method of the game regarding the 4-string bass.
     *
     * The CPU chooses a random number for the string (from 1 to 4) and the fret on the instrument's neck (1 to 12).
     * With the numbers selected, it asks player which note corresponds to that position. If the player enters the
     * corresponding note, it informs that they got it right, otherwise it informs them that they made a mistake
     * and indicates which is the correct note.
     */
    public static void mainActivity(){
        Scanner playerAnswer = new Scanner(System.in);

        int pickedBassString = getStringFromFiveStringBass(); //CPU select random string
        int pickedBassFret   = getFretFromBassFretboard();    //CPU select random fret
        String insertedAnswer;

        System.out.println("\nQual a nota: Corda (" + pickedBassString + ") | Traste (" + pickedBassFret + ")");
        System.out.print("Resposta: ");
        insertedAnswer = playerAnswer.nextLine();


        switch (pickedBassString) {
            case 0: //corda (B) Si
                guessNoteStringB(insertedAnswer, pickedBassFret);
                break;
            case 1: //corda (E) Mi
                guessNoteStringE(insertedAnswer, pickedBassFret);
                break;
            case 2: //corda (A) La
                guessNoteStringA(insertedAnswer, pickedBassFret);
                break;
            case 3: //corda (D) Re
                guessNoteStringD(insertedAnswer, pickedBassFret);
                break;
            case 4: //corda (G) Sol
                guessNoteStringG(insertedAnswer, pickedBassFret);
                break;
        }
    }


    /**
     * Method that checks whether the player hit the note indicated for the G string (in portuguese 'corda SOL')
     *
     * @param pickedBassFret Indicates the choice of position on the instrument neck
     * @param playerAnswer get the players answer
     */
    private static void guessNoteStringG(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringG(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringG(pickedBassFret));
        }
    }


    /**
     * Method that checks whether the player hit the note indicated for the D string (in portuguese 'corda RÉ')
     *
     * @param pickedBassFret Indicates the choice of position on the instrument neck
     * @param playerAnswer get the players answer
     */
    private static void guessNoteStringD(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringD(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringD(pickedBassFret));
        }
    }


    /**
     * Method that checks whether the player hit the note indicated for the D string (in portuguese 'corda LÁ')
     *
     * @param pickedBassFret Indicates the choice of position on the instrument neck
     * @param playerAnswer get the players answer
     */
    private static void guessNoteStringA(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringA(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringA(pickedBassFret));
        }
    }


    /**
     * Method that checks whether the player hit the note indicated for the E string (in portuguese 'corda MI')
     *
     * @param pickedBassFret Indicates the choice of position on the instrument neck
     * @param playerAnswer get the players answer
     */
    private static void guessNoteStringE(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringE(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringE(pickedBassFret));
        }
    }


    /**
     * Method that checks whether the player hit the note indicated for the B string (in portuguese 'corda SI')
     *
     * @param pickedBassFret Indicates the choice of position on the instrument neck
     * @param playerAnswer get the players answer
     */
    private static void guessNoteStringB(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringB(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringB(pickedBassFret));
        }
    }


    /**
     * Method for randomly choosing (between 1 and 12) the position on the instrument neck
     */
    private static int getFretFromBassFretboard(){
        return getFretPosition = numRandom.nextInt(11);
    }


    /**
     * Method to randomly choose (between 1 and 5) one of the instrument's 5 strings
     */
    private static int getStringFromFiveStringBass(){
        int positionString = numRandom.nextInt(4);

        //if (positionString == 0) positionString++;

        return getStringFromFiveBassString = positionString+1;
    }

}