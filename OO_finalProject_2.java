import java.io.IOException;
import java.util.*;

public class OO_finalProject_2 extends OO_finalProject_1 {

    public OO_finalProject_2() { super(); }
    public OO_finalProject_2(String filename) throws IOException { super(filename); }

    // 1. Total words
    public int getTotalWordCount() {
        return getWords().size();
    }

    // 2. Unique words
    public int getUniqueWordCount() {
        List<String> unique = new ArrayList<>();
        for (String w : getWords()) {
            if (!unique.contains(w)) unique.add(w);
        }
        return unique.size();
    }

    // 3. Most common word (ignoring stopwords)
    public String getMostCommonWord(List<String> stopWords) {
        String mostCommon = "";
        int maxCount = 0;

        for (String w : getWords()) {
            if (stopWords.contains(w)) continue;

            int count = 0;
            for (String x : getWords()) {
                if (x.equals(w)) count++;
            }

            if (count > maxCount) {
                maxCount = count;
                mostCommon = w;
            }
        }
        if (mostCommon.isEmpty()) return "No words found";
        return mostCommon + " appears " + maxCount + " times";
    }

    // 4. Words of length >= n
    public List<String> getWordsOfLengthAtLeast(int minLength) {
        List<String> result = new ArrayList<>();
        for (String w : getWords()) {
            if (w.length() >= minLength) result.add(w);
        }
        return result;
    }

    // 5. Average word length
    public double getAverageWordLength() {
        if (getWords().isEmpty()) return 0.0;
        int total = 0;
        for (String w : getWords()) total += w.length();
        return (double) total / getWords().size();
    }

    // 6. Sentence count
    public int getSentenceCount() {
        int count = 0;
        for (String line : getLines()) {
            for (char c : line.toCharArray()) {
                if (c == '.' || c == '!' || c == '?') count++;
            }
        }
        return count;
    }

    // 7. Punctuation counts
    public String getPunctuationCounts() {
        int commas = 0, periods = 0, excls = 0, ques = 0, colons = 0, semis = 0;
        for (String line : getLines()) {
            for (char c : line.toCharArray()) {
                if (c == ',') commas++;
                else if (c == '.') periods++;
                else if (c == '!') excls++;
                else if (c == '?') ques++;
                else if (c == ':') colons++;
                else if (c == ';') semis++;
            }
        }
        return "Commas: " + commas + ", Periods: " + periods +
               ", Exclamations: " + excls + ", Questions: " + ques +
               ", Colons: " + colons + ", Semicolons: " + semis;
    }

    // 8. Words starting with a letter
    public int countWordsStartingWith(char letter) {
        int count = 0;
        char lower = Character.toLowerCase(letter);
        for (String w : getWords()) {
            if (!w.isEmpty() && w.charAt(0) == lower) count++;
        }
        return count;
    }

    // 9. Palindromes
    public List<String> findPalindromes() {
        List<String> pals = new ArrayList<>();
        for (String w : getWords()) {
            String rev = new StringBuilder(w).reverse().toString();
            if (w.equals(rev) && !pals.contains(w)) pals.add(w);
        }
        return pals;
    }

    // 10. Word length frequencies
    public List<String> getWordLengthFrequencies() {
        List<String> result = new ArrayList<>();
        for (int len = 1; len <= 20; len++) {
            int count = 0;
            for (String w : getWords()) {
                if (w.length() == len) count++;
            }
            if (count > 0) result.add(len + "-letter words: " + count);
        }
        return result;
    }

    // 11. Longest words
    public List<String> getLongestWords() {
        int max = 0;
        for (String w : getWords()) {
            if (w.length() > max) max = w.length();
        }
        List<String> result = new ArrayList<>();
        for (String w : getWords()) {
            if (w.length() == max && !result.contains(w)) result.add(w);
        }
        Collections.sort(result);
        return result;
    }

    // 12. Letter frequencies
    public List<String> getLetterFrequencies() {
        int[] freq = new int[26];
        for (String line : getLines()) {
            line = line.toLowerCase();
            for (char c : line.toCharArray()) {
                if (c >= 'a' && c <= 'z') freq[c - 'a']++;
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            result.add((char)('a' + i) + ": " + freq[i]);
        }
        return result;
    }

    // 13. Top N words 
    public List<String> getTopNWords(int n) {
        List<String> result = new ArrayList<>();
        List<String> used = new ArrayList<>();

        for (int k = 0; k < n; k++) {
            String best = "";
            int max = 0;
            for (String w : getWords()) {
                if (used.contains(w)) continue;
                int count = 0;
                for (String x : getWords()) {
                    if (x.equals(w)) count++;
                }
                if (count > max) {
                    max = count;
                    best = w;
                }
            }
            if (!best.isEmpty()) {
                result.add(best + " (" + max + " times)");
                used.add(best);
            }
        }
        return result;
    }

    // 14. Chapters/Sections
    public int countChapters() {
        int count = 0;
        for (String line : getLines()) {
            String lower = line.trim().toLowerCase();
            if (lower.startsWith("chapter") || lower.startsWith("section")) count++;
        }
        return count;
    }

    // 15. Anagram pairs
    public boolean hasAnagramPairs() {
        for (int i = 0; i < getWords().size(); i++) {
            for (int j = i + 1; j < getWords().size(); j++) {
                if (areAnagrams(getWords().get(i), getWords().get(j))) return true;
            }
        }
        return false;
    }
    private boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // 16. Phrase occurrences
    public int countPhraseOccurrences(String phrase) {
        String target = phrase.toLowerCase();
        int count = 0;
        for (String line : getLines()) {
            String lower = line.toLowerCase();
            int idx = 0;
            while ((idx = lower.indexOf(target, idx)) != -1) {
                count++;
                idx += target.length();
            }
        }
        return count;
    }

 
    String result = "";

    @Override
    public String toString() {
        String result = "";

        List<String> stopWords = Arrays.asList("the", "and", "a", "to", "of", "in", "is", "it");

        result += "1. Total words: " + getTotalWordCount();
        result += "\n2. Unique words: " + getUniqueWordCount();
        result += "\n3. Most common word: " + getMostCommonWord(stopWords);
        result += "\n4. Words with length >= 5: " + getWordsOfLengthAtLeast(5);
        result += String.format("\n5. Average word length: %.2f", getAverageWordLength());
        result += "\n6. Sentence count: " + getSentenceCount();
        result += "\n7. Punctuation counts: " + getPunctuationCounts();
        result += "\n8. Words starting with 'a': " + countWordsStartingWith('a');
        result += "\n9. Palindromes: " + findPalindromes();
        result += "\n10. Word length frequencies: " + getWordLengthFrequencies();
        result += "\n11. Longest words: " + getLongestWords();
        result += "\n12. Letter frequencies: " + getLetterFrequencies();
        result += "\n13. Top 5 words: " + getTopNWords(5);
        result += "\n14. Chapters/Sections: " + countChapters();
        result += "\n15. Any anagram pairs? " + hasAnagramPairs();
        result += "\n16. Occurrences of 'I am': " + countPhraseOccurrences("I am");

        return result;
    }


    public static void main(String[] args) {
        try {
            final String FILENAME = "dummy.txt";
            OO_finalProject_2 object = new OO_finalProject_2(FILENAME);
            
            System.out.println(object);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
