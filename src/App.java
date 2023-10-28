import java.util.Random;
import java.util.Scanner;

public class App {

    private static Graphics graphics = new Graphics();
    private static Notes notes = new Notes();
    private static Random numRandom = new Random();
    private static int manyStrings;






    public static void main(String[] args) throws Exception {
        Scanner playerAnswer = new Scanner(System.in);
        int optionFromMenu;

        graphics.mainMenu();
        optionFromMenu = playerAnswer.nextInt();





        //TODO refactor game workflow
        do {
            askHowManyStrings();
            computerGetNote(manyStrings);
        }while(true);

    }




    private static void askHowManyStrings(){
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

        if(manyStrings == 4){
            noteFromBassFourStrings();
        }else{
            noteFromBassFiveStrings();
        }

    }


    private static int getFretFromFourStringsBass(){
        int getFretPosition  = numRandom.nextInt(11);

        return getFretPosition;
    }

    private static int getStringFromFourStringBass(){
        int getBassString    = numRandom.nextInt(1, notes.getStringsLenght());

        return getBassString;
    }



    private static void noteFromBassFourStrings(){
        Scanner playerAnswer = new Scanner(System.in);
        String guessAnswer, pickedBassString, pickedBassFret;


        System.out.println("Posicao Final: Traste (" + getFretFromFourStringsBass() + ") | Corda (" + getStringFromFourStringBass() + ")\n"); //TODO remove this line after finish project
        System.out.print("Qual é a nota: ");
        guessAnswer = playerAnswer.nextLine();


        //ler/guardar qual a corda seleccionada no metodo getStringFromFourStringBass()



        //ler/guardar qual o fret seleccionado no metodo getFretFromFourStringsBass()



        //comparar a nota que o utilizador digitou com a nota da posição do frete

            //se for igual, informa que acertou. Caso contrario, gera nova nota para adivinhar






        //System.out.println("string " + positionString + "STRING: " + notes.pickStringName(positionString));  //TODO remove this line after finish project
    }






    private static void noteFromBassFiveStrings(){
        int positionString = numRandom.nextInt(4);
        if (positionString == 0) positionString++;
        //TODO
    }

}
