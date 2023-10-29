import java.util.Random;
import java.util.Scanner;

/**
 * This class covers everything related to the 4-string bass
 */

public class BassFourString {

    private static final Random numRandom = new Random();
    private static final Note notes = new Note();

    private static int getFretPosition, getStringFromFourBassString, getStringFromFiveBassString;


    public static void main(){
        Scanner playerAnswer = new Scanner(System.in);

        int pickedBassString = getStringFromFourStringBass(); //CPU select random string
        int pickedBassFret   = getFretFromBassFretboard();    //CPU select random fret
        String insertedAnswer;

        System.out.println("\nQual a nota: Corda (" + pickedBassString + ") | Traste (" + pickedBassFret + ")");
        System.out.print("Resposta: ");
        insertedAnswer = playerAnswer.nextLine();


        switch (pickedBassString) {
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


    private static void guessNoteStringG(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringG(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringG(pickedBassFret));
        }
    }

    private static void guessNoteStringD(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringD(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringD(pickedBassFret));
        }
    }

    private static void guessNoteStringA(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringA(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringA(pickedBassFret));
        }
    }

    private static void guessNoteStringE(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringE(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringE(pickedBassFret));
        }
    }









    private static int getFretFromBassFretboard(){
        return getFretPosition = numRandom.nextInt(11);
    }


    private static int getStringFromFourStringBass(){
        return getStringFromFourBassString = numRandom.nextInt(1, notes.getStringsLenght());
    }

}