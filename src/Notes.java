




public class Notes {

    int[] numberOfStrings = {4, 5};
    String[] noteNames = {"Dó", "Ré", "Mi", "Fá", "Sol", "Lá", "Si"};
    String[] stringNames = {"Si", "Mi", "Lá", "Ré", "Sol"};
    String noteName;
    int numberOfFrets = 12;
    


    public Notes(){}





    public int getNotesLenght(){ return noteNames.length; }
    public int getStringsLenght(){ return stringNames.length; }

    public int getNumberOfStrings(int numberStrings){ return numberStrings; }

    public String pickNoteName(int notePosition){ return noteNames[notePosition]; }
    public String pickStringName(int stringPosition){ return stringNames[stringPosition]; }

}
