package structuralDesignPattern.compositeDesignPattern.solution;


/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class FileSystem {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("Resume.pdf");
        FileSystemComponent file2 = new File("CoverLetter.docx");
        Folder folder = new Folder("My Documents");

        folder.addFile(file1);
        folder.addFile(file2);

//        Sub folder with files
        Folder subFolder = new Folder("Projects");
        FileSystemComponent file3 = new File("Project1.docx");

        subFolder.addFile(file3);
        folder.addFile(subFolder);

        folder.showDetails();
    }
}
