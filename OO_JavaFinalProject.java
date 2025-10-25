import java.io.File;
import java.io.IOException;
import java.util.*;

class OO_finalProject_1 {
    public String filename;
    public List<String> lines;
    public List<String> words;

    public OO_finalProject_1() {
        this.filename = "";
        this.lines = new ArrayList<>();
        this.words = new ArrayList<>();
    }

    public OO_finalProject_1(String filename) throws IOException {
        this();
        this.filename = filename;
        loadFile();
    }

    private void loadFile() throws IOException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lines.add(line);

            String[] parts = line.split("\\s+");
            for (String word : parts) {
                word = word.replaceAll("[^a-zA-Z]", "");
                if (!word.isEmpty()) {
                    words.add(word.toLowerCase());
                }
            }
        }
        scanner.close();
    }

    public String getFilename() { return filename; }
    public List<String> getLines() { return lines; }
    public List<String> getWords() { return words; }
}
