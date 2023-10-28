import java.util.Random;
import java.util.Scanner;

public class Game {

    private static Graphics graphics = new Graphics();
    private static Notes notes = new Notes();
    private static Random numRandom = new Random();
    private static int manyStrings, getFretPosition, getStringFromFourBassString, getStringFromFiveBassString;



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

        do{
            System.out.println("Quantas cordas tem o baixo (4 ou 5)? ");
            manyStrings = playerAnswer.nextInt();

            if(manyStrings < 4 || manyStrings > 5) System.out.println("Opção errada. Tente de novo. ");

        }while( manyStrings < 4 || manyStrings > 5);

    }



    private static void gameWithSelectBass(int manyStrings){
        graphics.bass(manyStrings);

        if(manyStrings == 4){ //TODO check workflow
            do {
                selectedFourStringsBass();
            }while(true);
        }else{
            selectedFiveStringsBass();
        }

    }



    private static void selectedFourStringsBass(){
        Scanner playerAnswer = new Scanner(System.in);
        int pickedBassString, pickedBassFret;
        String guessAnswer;


        System.out.println("\nQual a nota: Traste (" + getFretFromBassFretboard() + ") | Corda (" + getStringFromFourStringBass() + ")");
        System.out.print("Resposta: ");
        guessAnswer = playerAnswer.nextLine();


        //ler/guardar qual o nº da corda seleccionada no metodo getStringFromFourStringBass()
        pickedBassString = getStringFromFourStringBass();

        //ler/guardar qual o nº do fret seleccionado no metodo getFretFromFourStringsBass()
        pickedBassFret = getFretFromBassFretboard();



        //comparar a nota que o utilizador digitou com a nota da posição do frete

        //se for igual, informa que acertou. Caso contrario, gera nova nota para adivinhar













        //System.out.println("string " + positionString + "STRING: " + notes.pickStringName(positionString));  //TODO remove this line after finish project
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
