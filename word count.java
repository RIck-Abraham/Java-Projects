import java.util.Scanner;
import java.util.ArrayList;

public class LabProgram {
   
   public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord){
      int occurance = 0;
      
      for (int i = 0; i < listSize; i++){
         if (wordsList[i].contains(currWord)){
            occurance = occurance + 1;
         }
      }
      
      return occurance;
   }

   public static void main(String[] args) {
      //Create objects
      Scanner scnr = new Scanner(System.in);
      String Str = new String(scnr.nextLine());
      ArrayList<String> words = new ArrayList<String>(20);
      
      //Adds the list of words to string ArrayList
      for (String retval: Str.split(" ")) {
         words.add(retval);
      }
      
      //Gets the number of words
      final int NUM_WORDS = Integer.parseInt(words.get(0));
      
      //Removes Integer from string ArrayList
      words.remove(0);
      //Convert ArrayList to Array
      String[] wordList = new String[NUM_WORDS];
      for (int i = 0; i < NUM_WORDS; i++){
         wordList[i] = words.get(i);
      }
      
      //Checks occurance of each word
      final int NUM_OCCUR = NUM_WORDS;
      int[] occur = new int[NUM_OCCUR];
      String checkWord = new String("ABC");
      
      for (int i = 0; i < NUM_WORDS; i++){
         checkWord = wordList[i];
         System.out.print(checkWord);
         occur[i] = getFrequencyOfWord(wordList, NUM_WORDS, checkWord);  
         System.out.print(" ");
         System.out.print(occur[i]);
         System.out.println();
      }       
   }
}
