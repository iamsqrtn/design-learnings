package pattern.structural.composite.with;

public class Client {
    public static void main(String[] args) {
        File f1 = new File("f1.txt");
        File f2 = new File("f2.pdf");
        Directory d1 = new Directory("d1");
        Directory d2 = new Directory("d2");
        d1.add(f1);
        d2.add(f2);
        d1.add(d2);
        System.out.println("listing contents of directory");
        d1.ls();
        System.out.println("listing contents of directory");
        d2.ls();
    }
}
