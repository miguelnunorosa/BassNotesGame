




public class Notes {

    private String[] noteNames    = {"Dó", "Ré", "Mi", "Fá", "Sol", "Lá", "Si"};
    private String[] noteAccidentUp = {"Dó#", "Ré#", "Fá#", "Sol#", "Lá#"};
    private String[] noteAccidentDown = {"Dób", "Réb", "Fáb", "Solb", "Láb"};
    private String[] stringNames = {"Si", "Mi", "Lá", "Ré", "Sol"};
    


    public Notes(){}





    public int getNotesLenght(){ return noteNames.length; }
    public int getStringsLenght(){ return stringNames.length; }

    public String[] getNoteNames() { return noteNames; }

    public void setNoteNames(String[] noteNames) { this.noteNames = noteNames; }

    public String[] getNoteAccidentUp() { return noteAccidentUp; }

    public void setNoteAccidentUp(String[] noteAccidentUp) { this.noteAccidentUp = noteAccidentUp; }

    public String[] getNoteAccidentDown() { return noteAccidentDown; }

    public void setNoteAccidentDown(String[] noteAccidentDown) { this.noteAccidentDown = noteAccidentDown; }

    public String[] getStringNames() { return stringNames; }

    public void setStringNames(String[] stringNames) { this.stringNames = stringNames; }


}
