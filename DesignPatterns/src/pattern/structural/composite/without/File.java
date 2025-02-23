package pattern.structural.composite.without;

public class File {
    String fileName;
    File(String fileName) {
        this.fileName = fileName;
    }
    void ls() {
        System.out.println("listing contents of file: " + this.fileName);
    }
}
