import java.util.Random;
import java.util.Scanner;

public class Game {

    private static final Graphics graphics = new Graphics();
    private static final Note notes = new Note();
    private static final Utils utils = new Utils();
    private static final BassFourString bassFourString = new BassFourString();
    private static final Random numRandom = new Random();
    private static int manyStrings, counterCorrect;



    /**
     * Main game method. Here the options that make up the game are shown and wait for the user to select an option.
     * Depending on the option selected, the game indicates the path to follow.
     * */
    public void mainGame(){

        Scanner playerAnswer = new Scanner(System.in);
        int optionFromMenu;


        utils.clearScreen();
        graphics.mainMenu();
        optionFromMenu = playerAnswer.nextInt();


        switch(optionFromMenu){
            case 1:
                askHowManyStrings();
                gameWithSelectBass(manyStrings);
                break;
            case 2:
                graphics.notes();
                break;
            case 3:
                graphics.help();
                break;
            case 9:
                graphics.about();
                break;
            case 0:
                System.exit(0);
        }

    }




    private static void askHowManyStrings(){
        Scanner playerAnswer = new Scanner(System.in);
        Utils.clearScreen();

        do{
            System.out.println("Quantas cordas tem o baixo (4 ou 5)? ");
            manyStrings = playerAnswer.nextInt();

            if(manyStrings < 4 || manyStrings > 5) System.out.println("Opção errada. Tente de novo. ");

        }while( manyStrings < 4 || manyStrings > 5);

    }



    private static void gameWithSelectBass(int manyStrings){
        Utils.clearScreen();
        graphics.bass(manyStrings);

        if(manyStrings == 4){ //TODO check workflow
            do {
                bassFourString.main();
                //System.out.println("Corretas: " + counterCorrect);
            }while(true);
        }else{
            //selectedFiveStringsBass();
        }

    }



    private static void guessNoteStringB(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringB(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
            counterCorrect++;
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringB(pickedBassFret));
        }
    }




























    /*private static int getStringFromFiveStringBass(){
        int positionString = numRandom.nextInt(4);

        if (positionString == 0) positionString++;

        return getStringFromFiveBassString = positionString;
    }

    private static void selectedFiveStringsBass(){
        //TODO
    }
*/

}
