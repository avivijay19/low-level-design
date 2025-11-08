package behaviouralDesignPattern.templateMethodDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class CSVParser {
    public void parse() {
        openFile();
        // CSV parsing logic would go here
        System.out.println("Parsing CSV file...");
        closeFile();
    }
    private void openFile() {
        System.out.println("Opening CSV file...");
    }
    private void closeFile() {
        System.out.println("Closing CSV file...");
    }
}
