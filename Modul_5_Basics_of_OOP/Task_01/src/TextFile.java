import java.nio.file.Files;
import java.nio.file.Path;

public class TextFile implements FileControl {
    private Files files;
    private Path path;

    public TextFile() {

    }

    public TextFile(Path path, Files files) {
        this.path = path;
        this.files = files;
    }

    public Files getFiles() {
        return files;
    }

    public Path getPath() {
        return path;
    }

    public void setFiles(Files files) {
        this.files = files;
    }

    public void setPath(Path path) {
        this.path = path;
    }
}