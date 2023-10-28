import java.util.Random;
import java.util.Scanner;

public class App {

    private static Graphics graphics = new Graphics();
    private static Notes notes = new Notes();
    private static Random numRandom = new Random();
    private static int manyStrings, getFretPosition, getBassString;


    public static void main(String[] args) throws Exception {
        Scanner playerAnswer = new Scanner(System.in);
        int optionFromMenu;

        graphics.mainMenu();
        optionFromMenu = playerAnswer.nextInt();





        //TODO refactor game workflow
        do {
            askHowManyStrings();
            mainGame(manyStrings);
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
    private static void mainGame(int manyStrings){
        graphics.bass(manyStrings);

        if(manyStrings == 4){
            fourStringGuessNote();
        }else{
            fiveStringGuessNote();
        }

    }



    private static void fourStringGuessNote(){
        Scanner playerAnswer = new Scanner(System.in);
        int pickedBassString, pickedBassFret;
        String guessAnswer;


        System.out.println("Qual a nota: Traste (" + getFretFromFourStringsBass() + ") | Corda (" + getStringFromFourStringBass() + ")\n");
        System.out.print("Resposta: ");
        guessAnswer = playerAnswer.nextLine();


        //ler/guardar qual o nº da corda seleccionada no metodo getStringFromFourStringBass()
        pickedBassString = getStringFromFourStringBass();

        //ler/guardar qual o nº do fret seleccionado no metodo getFretFromFourStringsBass()
        pickedBassFret = getFretFromFourStringsBass();



        //comparar a nota que o utilizador digitou com a nota da posição do frete

            //se for igual, informa que acertou. Caso contrario, gera nova nota para adivinhar













        //System.out.println("string " + positionString + "STRING: " + notes.pickStringName(positionString));  //TODO remove this line after finish project
    }

    private static int getFretFromFourStringsBass(){
        return getFretPosition = numRandom.nextInt(11);
    }

    private static int getStringFromFourStringBass(){
         return getBassString = numRandom.nextInt(1, notes.getStringsLenght());
    }


















    private static void fiveStringGuessNote(){
        int positionString = numRandom.nextInt(4);
        if (positionString == 0) positionString++;
        //TODO
    }

}
