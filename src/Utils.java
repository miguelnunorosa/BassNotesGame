/**
 * Class that handles auxiliary functions throughout the project
 */


public class Utils {


    /**
     * Method to clear the console/terminal to show one window at a time
     */
    public static void clearScreen(){
        try{
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
            }else{
                Runtime.getRuntime().exec("clear");
            }
        }catch (final Exception e) {
            e.printStackTrace();
        }
    }




}