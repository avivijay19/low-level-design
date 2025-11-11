package structuralDesignPattern.compositeDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class FileSystem {
    public static void main(String[] args) {
        File file1 = new File("Resume.pdf");
        File file2 = new File("CoverLetter.docx");
        Folder folder = new Folder("My Documents");

        folder.addFile(file1);
        folder.addFile(file2);

        System.out.println("Files in " + folder.getName() + ":");
        folder.showFiles();
    }
}
