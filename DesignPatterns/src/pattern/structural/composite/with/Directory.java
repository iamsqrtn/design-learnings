package pattern.structural.composite.with;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> list;
    Directory(String directoryName) {
        this.directoryName = directoryName;
        list = new ArrayList<>();
    }
    void add(FileSystem f) {
        list.add(f);
    }
    @Override
    public void ls() {
        System.out.println("listing contents of directory: " + this.directoryName);
        for(FileSystem fs: list) {
            fs.ls();
        }
    }
}
