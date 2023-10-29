import java.util.Random;
import java.util.Scanner;

public class Game {

    private static Graphics graphics = new Graphics();
    private static Note notes = new Note();
    private static Utils utils = new Utils();
    private static Random numRandom = new Random();
    private static int manyStrings, getFretPosition, getStringFromFourBassString, getStringFromFiveBassString, counterCorrect;



    public void mainGame(){
        Scanner playerAnswer = new Scanner(System.in);
        int optionFromMenu;

        graphics.mainMenu();
        optionFromMenu = playerAnswer.nextInt();



        //TODO refactor game workflow
        askHowManyStrings();


        gameWithSelectBass(manyStrings);
    }




    private static void askHowManyStrings(){
        Scanner playerAnswer = new Scanner(System.in);
        utils.clearScreen();

        do{
            System.out.println("Quantas cordas tem o baixo (4 ou 5)? ");
            manyStrings = playerAnswer.nextInt();

            if(manyStrings < 4 || manyStrings > 5) System.out.println("Opção errada. Tente de novo. ");

        }while( manyStrings < 4 || manyStrings > 5);

    }



    private static void gameWithSelectBass(int manyStrings){
        utils.clearScreen();
        graphics.bass(manyStrings);

        if(manyStrings == 4){ //TODO check workflow
            do {
                selectedFourStringsBass();
                //System.out.println("Corretas: " + counterCorrect);
            }while(true);
        }else{
            selectedFiveStringsBass();
        }

    }



    private static void selectedFourStringsBass(){
        Scanner playerAnswer = new Scanner(System.in);

        int pickedBassString = getStringFromFourStringBass(); //CPU select random string
        int pickedBassFret   = getFretFromBassFretboard();    //CPU select random fret
        String guessAnswer;



        System.out.println("\nQual a nota: Corda (" + pickedBassString + ") | Traste (" + pickedBassFret + ")");
        System.out.print("Resposta: ");
        guessAnswer = playerAnswer.nextLine();


        switch(pickedBassString){
            case 1: //corda (E) Mi
                guessNoteStringE(guessAnswer, pickedBassFret);
                break;
            case 2: //corda (A) La
                guessNoteStringA(guessAnswer, pickedBassFret);
                break;
            case 3: //corda (D) Re
                guessNoteStringD(guessAnswer, pickedBassFret);
                break;
            case 4: //corda (G) Sol
                guessNoteStringG(guessAnswer, pickedBassFret);
                break;
        }

    }



    private static void guessNoteStringG(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringG(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
            counterCorrect++;
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringG(pickedBassFret));
        }
    }

    private static void guessNoteStringD(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringD(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
            counterCorrect++;
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringD(pickedBassFret));
        }
    }

    private static void guessNoteStringA(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringA(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
            counterCorrect++;
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringA(pickedBassFret));
        }
    }

    private static void guessNoteStringE(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getStringE(pickedBassFret) ) ) {
            System.out.println("ACERTOU");
            counterCorrect++;
        }else{
            System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringE(pickedBassFret));
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








    private static int getFretFromBassFretboard(){
        return getFretPosition = numRandom.nextInt(11);
    }


    private static int getStringFromFourStringBass(){
        return getStringFromFourBassString = numRandom.nextInt(1, notes.getStringsLenght());
    }



















    private static int getStringFromFiveStringBass(){
        int positionString = numRandom.nextInt(4);

        if (positionString == 0) positionString++;

        return getStringFromFiveBassString = positionString;
    }

    private static void selectedFiveStringsBass(){
        //TODO
    }


}
