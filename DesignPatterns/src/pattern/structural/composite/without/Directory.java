package pattern.structural.composite.without;

import java.util.List;
import java.util.ArrayList;

public class Directory {
    String directoryName;
    List<Object> list;
    Directory(String directoryName) {
        this.directoryName = directoryName;
        list = new ArrayList<>();
    }
    void add(Object o) {
        list.add(o);
    }
    void ls() {
        System.out.println("listing contents of directory: " + this.directoryName);
        for(Object o: list) {
            if (o instanceof File) {
                ((File)o).ls();
            }
            if (o instanceof Directory) {
                ((Directory)o).ls();
            }
        }
    }
}
