import java.util.Scanner;

/**
 * This class is responsible for the mechanics of the game itself. It is through this that connections are
 * made between the remaining classes.
 */
public class Game {

    private static final Graphics graphics = new Graphics();
    private static final Utils utils = new Utils();
    private static final BassFourString bassFourString = new BassFourString();
    private static final BassFiveString bassFiveString = new BassFiveString();
    private static int manyStrings;



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




    /**
     * This method asks the user how many strings the bass has. A check has been implemented
     * that does not allow the user to enter an option other than those allowed.
     */
    private static void askHowManyStrings(){
        Scanner playerAnswer = new Scanner(System.in);
        Utils.clearScreen();

        do{
            System.out.println("Quantas cordas tem o baixo (4 ou 5)? ");
            manyStrings = playerAnswer.nextInt();

            if(manyStrings < 4 || manyStrings > 5) System.out.println("Opção errada. Tente de novo. ");

        }while( manyStrings < 4 || manyStrings > 5);

    }



    /**
     * This method receives the answer to the question of how many strings the bass has and,
     * depending on the option entered, starts the respective game.
     *
     * @param manyStrings stores the information about how many strings the bass have
     */
    private static void gameWithSelectBass(int manyStrings){
        Utils.clearScreen();
        graphics.bass(manyStrings);

        do{
            utils.clearScreen();
            if(manyStrings == 4){
                bassFourString.mainActivity();
            }else{
                bassFiveString.mainActivity();
            }
        }while(true);

    }



}