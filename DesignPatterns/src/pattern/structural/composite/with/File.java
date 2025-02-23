package pattern.structural.composite.with;

public class File implements FileSystem {
    String fileName;
    File(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void ls() {
        System.out.println("listing contents of file: " + this.fileName);
    }
}
