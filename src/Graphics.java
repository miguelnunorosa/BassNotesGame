
/**
 * Graphics.
 */
public class Graphics {



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


    public void bass(int strings){
        System.out.println("# =================== #");
        System.out.println("#                     #");
        System.out.println("#   BAIXO " + strings + " CORDAS    #");
        System.out.println("# =================== #\n\n");
    }


    public void help(){
        System.out.println("# ================================= #");
        System.out.println("#          Bass Notes Memory        #");
        System.out.println("#                                   #");
        System.out.println("# Utilizar:                         #");
        System.out.println("#    # (sustenido)                  #");
        System.out.println("#    b (bemol)                      #");
        System.out.println("#                                   #");
        System.out.println("# | exemplo: Dó sustenido  Dó#  |   #");
        System.out.println("#                                   #");
        System.out.println("# ================================= #");
    }


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