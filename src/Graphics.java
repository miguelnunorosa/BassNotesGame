
/**
 * Class that deals with the game's graphical interface
 */
public class Graphics {


    /**
     * Class constructor
     */
    public Graphics(){}


    /**
     * Method to draw main menu
     */
    public void mainMenu(){
        System.out.println("# ============================ #");
        System.out.println("#       Bass Notes Memory      #");
        System.out.println("#                              #");
        System.out.println("# 1) Iniciar treino            #");
        System.out.println("# 2) Ver Notas Musicais        #");
        System.out.println("# 3) Ver Ajuda                 #");
        System.out.println("#                              #");
        System.out.println("# 9) Sobre o jogo              #");
        System.out.println("# 0) Sair                      #");
        System.out.println("# ============================ #\n");
        System.out.print("Insira uma opção: ");
    }


    /**
     * Method to draw graphics to show the selected bass (4 or 5 strings)
     */
    public void bass(int strings){
        System.out.println("# =================== #");
        System.out.println("#                     #");
        System.out.println("#   BAIXO " + strings + " CORDAS    #");
        System.out.println("# =================== #\n\n");
    }


    /**
     * Method to draw help menu (explains how to play)
     */
    public void help(){
        System.out.println("# ========================================= #");
        System.out.println("#             Bass Notes Memory             #");
        System.out.println("#                                           #");
        System.out.println("# Utilizar:                                 #");
        System.out.println("#    # (sustenido)                          #");
        System.out.println("#    b (bemol)                              #");
        System.out.println("#                                           #");
        System.out.println("# | exemplo de resposta (Dó sustenido):  |  #");
        System.out.println("# |       Dó#                            |  #");
        System.out.println("# |  para as restantes notas, basta      |  #");
        System.out.println("# |  digitar o nome (ex: Dó)             |  #");
        System.out.println("#                                           #");
        System.out.println("# ========================================= #");
    }


    /**
     * Method to draw musical notes menu
     */
    public void notes(){
        System.out.println("# ================================= #");
        System.out.println("#           Bass Notes              #");
        System.out.println("#                                   #");
        System.out.println("#   Notas            Acidentes      #");
        System.out.println("#  A => Lá          Lá#  /  Láb     #");
        System.out.println("#  B => Si                          #");
        System.out.println("#  C => Dó          Dó#  /  Dób     #");
        System.out.println("#  D => Ré          Ré#  /  Réb     #");
        System.out.println("#  E => Mi                          #");
        System.out.println("#  F => Fá          Fá#  /  Fáb     #");
        System.out.println("#  G => Sol         Sol#  /  Solb   #");
        System.out.println("#                                   #");
        System.out.println("# ================================= #");
    }


    /**
     * Method to draw about menu
     */
    public void about(){
        System.out.println("# ========================================= #");
        System.out.println("#              Bass Notes Memory            #");
        System.out.println("#                                           #");
        System.out.println("# Projeto Desenvolvido por:                 #");
        System.out.println("#   Miguel Rosa                             #");
        System.out.println("#   Outubro 29, 2023                        #");
        System.out.println("#                                           #");
        System.out.println("# github.com/miguelnunorosa/BassNotesGame   #");
        System.out.println("#                                           #");
        System.out.println("# 'Projeto realizado para consolidar        #");
        System.out.println("#  conhecimentos. Qualquer feedback é       #");
        System.out.println("#  bem vindo afim de melhorar. Obrigado.'   #");
        System.out.println("#                                           #");
        System.out.println("# ========================================= #");
    }

    
}