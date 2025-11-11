package structuralDesignPattern.compositeDesignPattern.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class Folder {
    private final String name;

    private final List<File> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void showFiles() {
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
