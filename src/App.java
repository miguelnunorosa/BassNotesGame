import java.util.Random;
import java.util.Scanner;

public class App {

    private static Graphics graphics = new Graphics();
    private static Notes notes = new Notes();
    private static Random numRandom = new Random();
    private static int manyStrings;


    public static void main(String[] args) throws Exception {

        graphics.header();

        checkBassManyStrings();
        

        //System.out.println("NOTE: " + notes.pickNoteName(numRandom.nextInt(notes.getNotesLenght())) );
        //System.out.println("STRING: " +  notes.pickStringName(numRandom.nextInt(notes.getNotesLenght())) );




    }




    private static void checkBassManyStrings(){
        Scanner playerAnswer = new Scanner(System.in);

        do{
            System.out.println("Quantas cordas tem o baixo (4 ou 5)? ");
            manyStrings = playerAnswer.nextInt();

            if(manyStrings < 4 || manyStrings > 5) System.out.println("Opção errada. Tente de novo. ");

        }while( manyStrings < 4 || manyStrings > 5);

    }











   /* private static void guessTheNote(int strings){
        int bassStrings, stringPosition;
        String noteName, StringName;


        System.out.println("NOTE: " + notes.pickNoteName(numRandom.nextInt(notes.getNotesLenght())) );

        //check the number of bass strings
        if(strings == 4){
            bassStrings = 4;
            stringPosition = numRandom.nextInt( notes.getStringsLenght() );
            if (stringPosition == 0) stringPosition++;



            System.out.println("STRING: " +  notes.pickStringName(stringPosition) );
        }else{
            bassStrings = 5;
            System.out.println("STRING: " +  notes.pickStringName(numRandom.nextInt(notes.getNotesLenght())) );
        }


    }*/


}
