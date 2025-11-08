package behaviouralDesignPattern.templateMethodDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 08/11/25, Saturday
 **/

public class TemplateMethodPattern {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        csvParser.parse();

        DataParser jsonParser = new JsonParser();
        jsonParser.parse();
    }
}
