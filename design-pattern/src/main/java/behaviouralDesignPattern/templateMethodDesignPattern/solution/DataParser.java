package behaviouralDesignPattern.templateMethodDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 08/11/25, Saturday
 **/

abstract class DataParser {
    //    Template Method
    public final void parse() {
        readData();
        processData();
        closeFile();
    }

    protected void readData() {
        System.out.println("Reading data...");
    }

    protected void closeFile() {
        System.out.println("Closing file...");
    }

    protected abstract void processData();
}
