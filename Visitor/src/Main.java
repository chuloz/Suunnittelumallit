public class Main {
    public static void main(String[] args) {
        // Luodaan hakemistorakenne
        Directory root = new Directory("root");
        Directory subDir1 = new Directory("subDir1");
        Directory subDir2 = new Directory("subDir2");

        File file1 = new File("file1.txt", 2.5);
        File file2 = new File("file2.doc", 3.0);
        File file3 = new File("file3.txt", 1.5);
        File file4 = new File("file4.pdf", 4.0);

        root.addElement(file1);
        root.addElement(file2);
        root.addElement(subDir1);
        subDir1.addElement(file3);
        subDir1.addElement(subDir2);
        subDir2.addElement(file4);

        // Käytetään SizeCalculatorVisitoria
        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        root.accept(sizeCalculator);
        System.out.println("Total size of all files: " + sizeCalculator.getTotalSize() + " MB");

        // Käytetään SearchVisitoria
        SearchVisitor searchVisitor = new SearchVisitor("file");
        root.accept(searchVisitor);
        System.out.println("Found files:");
        for (File file : searchVisitor.getFoundFiles()) {
            System.out.println(file.getName());
        }
    }
}
