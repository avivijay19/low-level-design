package structuralDesignPattern.compositeDesignPattern.solution;

import structuralDesignPattern.compositeDesignPattern.problem.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class Folder implements FileSystemComponent {
    private final String name;

    private final List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addFile(FileSystemComponent fileSystemComponent) {
        components.add(fileSystemComponent);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent file : components) {
            components.forEach(FileSystemComponent::showDetails);
        }
    }
}
