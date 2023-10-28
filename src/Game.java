import java.util.Random;
import java.util.Scanner;

public class Game {

    private static Graphics graphics = new Graphics();
    private static Notes notes = new Notes();
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
                System.out.println("Corretas: " + counterCorrect);
            }while(true);
        }else{
            selectedFiveStringsBass();
        }

    }



    private static void selectedFourStringsBass(){
        Scanner playerAnswer = new Scanner(System.in);
        int pickedBassString, pickedBassFret;
        String guessAnswer;



        pickedBassString = getStringFromFourStringBass(); //CPU select random string
        pickedBassFret   = getFretFromBassFretboard();    //CPU select random fret
        int parada = 0;


        System.out.println("\nQual a nota: Traste (" + pickedBassFret + ") | Corda (" + pickedBassString + ")");
        System.out.print("Resposta: ");
        guessAnswer = playerAnswer.nextLine();


        //TODO algoritmo
        //ler/guardar qual o nº da corda seleccionada no metodo getStringFromFourStringBass()
        //ler/guardar qual o nº do fret seleccionado no metodo getFretFromFourStringsBass()
        //comparar a nota que o utilizador digitou com a nota da posição do frete
             //se for igual, informa que acertou. Caso contrario, gera nova nota para adivinhar



        /*if( pickedBassString == 1 ){
            if( guessAnswer.equals( notes.getStringE(pickedBassFret) ) ) {
                System.out.println("ACERTOU");
                counterCorrect++;
            }else{
                System.out.println("ERROU!!");
            }
        }*/



        switch(pickedBassString){
            case 1: //corda E Mi
                //System.out.println("demo selected string (1) 1 - A Lá");
                if( guessAnswer.equals( notes.getStringE(pickedBassFret) ) ) {
                    System.out.println("ACERTOU");
                    counterCorrect++;
                }else{
                    System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringE(pickedBassFret));
                }
                break;
            case 2: //corda A La
                //System.out.println("demo selected string (2) 2 - A Lá");
                if( guessAnswer.equals( notes.getStringA(pickedBassFret) ) ) {
                    System.out.println("ACERTOU");
                    counterCorrect++;
                }else{
                    System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringA(pickedBassFret));
                }
                break;
            case 3: //corda D Re
                //System.out.println("demo selected string (3) 3 - A Ré");
                if( guessAnswer.equals( notes.getStringD(pickedBassFret) ) ) {
                    System.out.println("ACERTOU");
                    counterCorrect++;
                }else{
                    System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringD(pickedBassFret));
                }
                break;
            case 4: //corda G Sol
                //System.out.println("demo selected string (4) 4 - A Sol");
                if( guessAnswer.equals( notes.getStringG(pickedBassFret) ) ) {
                    System.out.println("ACERTOU");
                    counterCorrect++;
                }else{
                    System.out.println("Nota incorreta! \nA nota correta seria: " + notes.getStringG(pickedBassFret));
                }
                break;
        }
















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
