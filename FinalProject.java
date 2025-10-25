import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FinalProject {

    // Read all words from file
    public static ArrayList<String> readWords (String filename) throws IOException {
    	ArrayList<String> words= new ArrayList<>();
    	File file = new File(filename);
        Scanner input_file = new Scanner(file);

        // Read lines from the file until no more are left.
        while (input_file.hasNext())
        {
           // Read the next name.
           String sentence = input_file.nextLine();
           System.out.println(sentence);
           String[] splitWords = sentence.split("\\s+");
           for (String word : splitWords) {
               if (!word.isEmpty()) { 
                   words.add(word);
               }
               
           }
        }

        input_file.close();
        return words;
        
    }

    /** 
     * 1. Count total words
     * @param words
     * @return
     */
    public static int countTotalWords(ArrayList<String> words) {
        return words.size();
    }

    // 2. Count unique words
    public static int countUniqueWords(ArrayList<String> words) {
        ArrayList<String> unique = new ArrayList<>();
        for (String word : words) {
            if (!unique.contains(word)) {
                unique.add(word);
            }
        }
        return unique.size();
    }

    // 3. Most common word 
    public static String mostCommonWord(ArrayList<String> words, ArrayList<String> stopWords) {
        ArrayList<String> unique = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        for (String word : words) {
            if (stopWords != null && stopWords.contains(word)) {
                continue; // skip stop words
            }
            int index = unique.indexOf(word);
            if (index == -1) {
                unique.add(word);
                counts.add(1);
            } else {
                counts.set(index, counts.get(index) + 1);
            }
        }

        int maxCount = 0;
        String maxWord = "";
        for (int i = 0; i < counts.size(); i++) {
            if (counts.get(i) > maxCount) {
                maxCount = counts.get(i);
                maxWord = unique.get(i);
            }
        }
        return maxWord + " appears " + maxCount + " times";
    }

    // 4. Filter words by length
    public static ArrayList<String> filterWordsByLength(ArrayList<String> words, int minLength) {
        ArrayList<String> filtered = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= minLength) filtered.add(word);
        }
        return filtered;
    }

    // 5. Average word length
    public static double averageWordLength(ArrayList<String> words) {
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        if (words.size() == 0) return 0.0;
        return (double) totalLength / words.size();
    }

    // 6. Count sentences
    public static int countSentences(String filename) throws IOException {
    	Scanner scanner = new Scanner(filename);
    	int count = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch == '.' || ch == '!' || ch == '?') {
                    count++;
                }
            }
        }

        scanner.close();
        return count;
    }

    // 7. Count punctuation mark
    public static String punctuationCount(String filename) throws IOException {
    	Scanner scanner = new Scanner(filename);
        int comma = 0, period = 0, excl = 0, ques = 0, colon = 0, semicolon = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                switch (ch) {
                    case ',':
                        comma++;
                        break;
                    case '.':
                        period++;
                        break;
                    case '!':
                        excl++;
                        break;
                    case '?':
                        ques++;
                        break;
                    case ':':
                        colon++;
                        break;
                    case ';':
                        semicolon++;
                        break;
                }
            }
        }
        scanner.close();

        return "Commas: " + comma + "\n" +
               "Periods: " + period + "\n" +
               "Exclamations: " + excl + "\n" +
               "Questions: " + ques + "\n" +
               "Colons: " + colon + "\n" +
               "Semicolons: " + semicolon;
    }

    // 8. Count words starting with a letter (case insensitive)
    public static int countWordsStartingWith(ArrayList<String> words, char letter) {
        int count = 0;
        letter = Character.toLowerCase(letter);
        for (String word : words) {
            if (word.length() > 0 && Character.toLowerCase(word.charAt(0)) == letter) count++;
        }
        return count;
    }

    
    /** 
     * 9. Find unique palindromes
     */
    public static ArrayList<String> findPalindromes(ArrayList<String> words) {
        ArrayList<String> palindromes = new ArrayList<>();
        for (String word : words) {
            if (isPalindrome(word) && !palindromes.contains(word)) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // 10. Word length frequency dictionary
    public static ArrayList<String> wordLengthFrequency(ArrayList<String> words) {
        ArrayList<Integer> lengths = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        for (String word : words) {
            int len = word.length();
            int idx = lengths.indexOf(len);
            if (idx == -1) {
                lengths.add(len);
                counts.add(1);
            } else {
                counts.set(idx, counts.get(idx) + 1);
            }
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < lengths.size(); i++) {
            result.add(lengths.get(i) + "-letter words: " + counts.get(i));
        }
        return result;
    }

    // 11. Find longest word sorted alphabetically
    public static ArrayList<String> longestWords(ArrayList<String> words) {
        ArrayList<String> longest = new ArrayList<>();
        int maxLen = 0;

        for (String word : words) {
            if (word.length() > maxLen) {
                maxLen = word.length();
                longest.clear();
                longest.add(word);
            } else if (word.length() == maxLen && !longest.contains(word)) {
                longest.add(word);
            }
        }

        
        for (int i = 0; i < longest.size() - 1; i++) {
            for (int j = i + 1; j < longest.size(); j++) {
                if (longest.get(i).compareTo(longest.get(j)) > 0) {
                    String temp = longest.get(i);
                    longest.set(i, longest.get(j));
                    longest.set(j, temp);
                }
            }
        }
        return longest;
    }

    // 12. Letter frequency \
    public static ArrayList<String> letterFrequency(String filename) throws IOException {
    	 Scanner scanner = new Scanner(filename);

    	    int[] frequency = new int[26];

    	    while (scanner.hasNextLine()) {
    	        String line = scanner.nextLine();
    	        for (int i = 0; i < line.length(); i++) {
    	            char ch = Character.toLowerCase(line.charAt(i));
    	            if (ch >= 'a' && ch <= 'z') {
    	                frequency[ch - 'a']++;
    	            }
    	        }
    	    }

    	    scanner.close();

    	    ArrayList<String> result = new ArrayList<>();
    	    for (int i = 0; i < 26; i++) {
    	        result.add((char) ('a' + i) + ": " + frequency[i]);
    	    }
    	    return result;
    }

    // 13. Top 5 most frequent words
    public static ArrayList<String> top5Words(ArrayList<String> words) {
        ArrayList<String> unique = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        for (String word : words) {
            int index = unique.indexOf(word);
            if (index == -1) {
                unique.add(word);
                counts.add(1);
            } else {
                counts.set(index, counts.get(index) + 1);
            }
        }

        ArrayList<String> result = new ArrayList<>();
        for (int top = 0; top < 5; top++) {
            int maxCount = 0;
            int maxIndex = -1;
            for (int i = 0; i < counts.size(); i++) {
                if (counts.get(i) > maxCount) {
                    maxCount = counts.get(i);
                    maxIndex = i;
                }
            }
            if (maxIndex == -1) break;

            result.add(unique.get(maxIndex) + " (" + maxCount + " times)");
            counts.set(maxIndex, 0); 
        }
        return result;
    }
    
    // 14. chapters that start with "chapter" or "section"
    public static int countChapters(String filename) throws IOException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int count = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim().toLowerCase();
            if (line.startsWith("chapter") || line.startsWith("section")) {
                count++;
            }
        }

        scanner.close();
        return count;
    }
    
    
    //15
 
    public static boolean find_anagrams(ArrayList<String> words) {
    		
	    for (int i = 0; i < words.size(); i++) {
	        String word1 = words.get(i);
	        for (int j = i + 1; j < words.size(); j++) {
	            String word2 = words.get(j);
	
	            if (word1.length() != word2.length()) continue;
	
	            // Sort and compare
	            char[] arr1 = word1.toCharArray();
	            char[] arr2 = word2.toCharArray();
	            Arrays.sort(arr1);
	            Arrays.sort(arr2);
	
	            boolean isAnagram = true;
	            for (int k = 0; k < arr1.length; k++) {
	                if (arr1[k] != arr2[k]) {
	                    isAnagram = false;
	                    break;
	                }
	            }
	
	            if (isAnagram) {
	                return true; // Found at least one anagram pair
	            }
	        }
	    }
	
	    return false; // No anagram pairs found
	    
    }
    
   
    

    // 16. Count occurrences of a specific phrase
    public static int countPhrase(String filename, String phrase) throws IOException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        phrase = phrase.toLowerCase();
        int count = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().toLowerCase();
            int index = 0;
            while ((index = line.indexOf(phrase, index)) != -1) {
                count++;
                index += phrase.length();
            }
        }

        scanner.close();
        return count;
    }

    public static void main(String[] args) throws IOException {
        final String FILENAME = "humor_of_america.txt"; 

        // Read words from file
        ArrayList<String> words = readWords(FILENAME);

        // Stop words
        ArrayList<String> stop_words = new ArrayList<>();
        stop_words.add("the");
        stop_words.add("and");
        stop_words.add("a");
        stop_words.add("to");
        stop_words.add("of");
        stop_words.add("in");
        stop_words.add("is");
        stop_words.add("it");

        System.out.println("1. Total words: " + countTotalWords(words));
        System.out.println("2. Unique words: " + countUniqueWords(words));
        System.out.println("3. Most common word (excluding stop words): " + mostCommonWord(words, stop_words));
        System.out.println("4. Words with length >= 5: " + filterWordsByLength(words, 5));
        System.out.printf("5. Average word length: %.2f%n", averageWordLength(words));
        System.out.println("6. Number of sentences: " + countSentences(FILENAME));
        System.out.println("7. Punctuation counts: " + punctuationCount(FILENAME));
        System.out.println("8. Words starting with 'a': " + countWordsStartingWith(words, 'a'));
        System.out.println("9. Palindromes found: " + findPalindromes(words));
        System.out.println("10. Word length frequencies:");
        for (String s : wordLengthFrequency(words)) {
            System.out.println(s);
        }
        System.out.println("11. Longest words:");
        for (String w : longestWords(words)) {
            System.out.println(w);
        }
        System.out.println("12. Letter frequencies:");
        for (String s : letterFrequency(FILENAME)) {
            System.out.println(s);
        }
        System.out.println("13. Top 5 most frequent words:");
        for (String s : top5Words(words)) {
            System.out.println(s);
        }
        System.out.println("14. Chapter/Section count: " + countChapters(FILENAME));
        System.out.println("15. Any anagram pairs found? " + find_anagrams(words));
        System.out.println("16. Occurrences of phrase 'I am"+ countPhrase(FILENAME, "I am"));
    }

    
    
}
