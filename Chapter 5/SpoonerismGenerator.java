import java.util.Scanner;

public class SpoonerismGenerator {
    
    
    public static String getWord(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    
    
    public static int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return i;
            }
        }
        return 0; 
    }
    
    
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        
        
        String word1 = getWord(scanner, "Word 1: ");
        String word2 = getWord(scanner, "Word 2: ");
        
        
        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);
        
        
        if (index1 > 0 && index2 > 0) {
            
            String spoonerizedWord1 = word2.substring(0, index2) + word1.substring(index1);
            String spoonerizedWord2 = word1.substring(0, index1) + word2.substring(index2);
            
            
            System.out.println("Output:");
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        } else {
            
            System.out.println("Output:");
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        }
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        run();
    }
}