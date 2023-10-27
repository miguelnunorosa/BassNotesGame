




public class Notes {

    private int[] numberOfStrings = {4, 5};
    private String[] noteNames = {"Dó", "Ré", "Mi", "Fá", "Sol", "Lá", "Si"};
    private String[] stringNames = {"Si", "Mi", "Lá", "Ré", "Sol"};
    


    public Notes(){}





    public int getNotesLenght(){ return noteNames.length; }
    public int getStringsLenght(){ return stringNames.length; }

    public int getNumberOfStrings(int numberStrings){ return numberStrings; }

    public String pickNoteName(int notePosition){ return noteNames[notePosition]; }
    public String pickStringName(int stringPosition){ return stringNames[stringPosition]; }

}
