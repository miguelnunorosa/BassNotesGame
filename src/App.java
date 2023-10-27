import java.util.Random;
import java.util.Scanner;

public class App {

    static Graphics graphics = new Graphics();
    static Notes notes = new Notes();
    static Random numRandom = new Random();



    public static void main(String[] args) throws Exception {

        Scanner strings = new Scanner(System.in);
        int manyStrings;
        
        graphics.header();
        

        //System.out.println("NOTE: " + notes.pickNoteName(numRandom.nextInt(notes.getNotesLenght())) );
        //System.out.println("STRING: " +  notes.pickStringName(numRandom.nextInt(notes.getNotesLenght())) );

        do{
            System.out.println("Quantas cordas tem o baixo (4 ou 5)? ");
            manyStrings = strings.nextInt();

            if(manyStrings < 4 || manyStrings > 5) System.out.println("Opção errada. Tente de novo. ");
        }while( manyStrings < 4 || manyStrings > 5);
        
        //ja temos o numero de cordas

        guessTheNote(manyStrings);

    }


    private static void guessTheNote(int strings){
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


    }


}
