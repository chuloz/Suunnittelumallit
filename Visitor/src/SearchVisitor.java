import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String searchCriteria;
    private List<File> foundFiles = new ArrayList<>();

    public SearchVisitor(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchCriteria)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        // Do nothing specific here, just traversing
    }

    public List<File> getFoundFiles() {
        return foundFiles;
    }
}
