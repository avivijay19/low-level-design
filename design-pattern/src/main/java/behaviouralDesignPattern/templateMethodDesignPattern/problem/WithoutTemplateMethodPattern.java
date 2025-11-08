package behaviouralDesignPattern.templateMethodDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class WithoutTemplateMethodPattern {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        csvParser.parse();

        JSONParser jsonParser = new JSONParser();
        jsonParser.parse();
    }
}
