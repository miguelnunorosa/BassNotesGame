import java.util.Random;
import java.util.Scanner;

public class App {

    private static Graphics graphics = new Graphics();
    private static Notes notes = new Notes();
    private static Random numRandom = new Random();
    private static int manyStrings;


    public static void main(String[] args) throws Exception {

        graphics.header();

        do {
            checkBassManyStrings();
            computerGetNote(manyStrings);
        }while(true);

    }




    private static void checkBassManyStrings(){
        Scanner playerAnswer = new Scanner(System.in);

        do{
            System.out.println("Quantas cordas tem o baixo (4 ou 5)? ");
            manyStrings = playerAnswer.nextInt();

            if(manyStrings < 4 || manyStrings > 5) System.out.println("Opção errada. Tente de novo. ");

        }while( manyStrings < 4 || manyStrings > 5);

    }



    /***
     * Computes get/pick (random) a note (string and fret)
     */
    private static void computerGetNote(int manyStrings){
        graphics.bass(manyStrings);

        if(manyStrings == 4) noteFromBassFourStrings();
        if(manyStrings == 5) noteFromBassFiveStrings();
    }


    private static void noteFromBassFourStrings(){
        int positionString = numRandom.nextInt(1, notes.getStringsLenght());
        int positionFret   = numRandom.nextInt(11);



        System.out.println("string " + positionString + "STRING: " + notes.pickStringName(positionString));  //TODO remove this line after finish project
        System.out.println("Posicao Final: Traste (" + positionFret + ") | Corda (" + positionString + ")"); //TODO remove this line after finish project
    }



    private static void noteFromBassFiveStrings(){
        int positionString = numRandom.nextInt(4);
        if (positionString == 0) positionString++;
        //TODO
    }


}
