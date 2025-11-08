package behaviouralDesignPattern.templateMethodDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 08/11/25, Saturday
 **/

public class CSVParser extends DataParser{
    @Override
    protected void processData() {
        System.out.println("Parsing CSV data...");
    }
}
