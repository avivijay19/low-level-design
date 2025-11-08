package behaviouralDesignPattern.templateMethodDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 08/11/25, Saturday
 **/

public class JSONParser {
//    repetitive logic for open and close file in each parser class
    public void parse() {
        openFile();
        // JSON parsing logic would go here
        System.out.println("Parsing JSON file...");
        closeFile();
    }

    private void openFile() {
        System.out.println("Opening JSON file...");
    }

    private void closeFile() {
        System.out.println("Closing JSON file...");
    }
}
