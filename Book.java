import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.FileWriter;

 

public class Book {

   private String book = "";
   private int count = 0;


   public Book(String url)
   {
      readBook(url);
   }

   private void readBook(String link)
   {
      try
      {
         URL url = new URL(link);
         Scanner s = new Scanner(url.openStream());
         try {
            while(s.hasNext())
            {
               String text = translateSentence(s.nextLine());
               System.out.println(text);
               book += text + "\n";
            }
         } finally {
            s.close();
         }
      }
      catch (IOException ex)
      {
         System.out.println("Error reading book");
         ex.printStackTrace();
      }
   }












   


   public String pigLatin(String word) {
      count++;
      String vowel = "aeiouy";
      String numbers = "1234567890";
      String punctuation = "!?.:;";
      String allPunc = "";
      String lowerCaseWord = "";
      if (word.length() == 0) {
         return word;
      }

      if (punctuation.indexOf(word.substring(word.length() - 1)) >= 0) {
         for (int j = word.length() - 1; j >= 0; j--) {
            if (!(punctuation.indexOf(word.charAt(j)) >= 0)) {
               allPunc = word.substring(j + 1);
               word = word.substring(0, j + 1);
               break;

            }
         }

      }

      char firstLetter = word.charAt(0);

      boolean isUpper = false;

      if (Character.isUpperCase(firstLetter)) {
         isUpper = true;
      }

      lowerCaseWord = word.toLowerCase();

      boolean startsWithVowel = false;

      if (vowel.indexOf(lowerCaseWord.substring(0, 1)) >= 0) {
         startsWithVowel = true;

      }

      boolean numbersBool = false;

      if (numbers.indexOf(lowerCaseWord.substring(0, 1)) >= 0) {
         numbersBool = true;
      }

      boolean lenIs1 = false;

      if (lowerCaseWord.length() == 1) {
         lenIs1 = true;
      }

      if (lenIs1) {
         lowerCaseWord = word + "ay";
      }

      else if (numbersBool) {
         lowerCaseWord = word + "ay";
      }

      else if (startsWithVowel) {
         lowerCaseWord = word + "yay";
      }

      else {
         for (int i = 0; i < lowerCaseWord.length(); i++) {
            if (vowel.indexOf(lowerCaseWord.substring(i, i + 1)) >= 0 && startsWithVowel == false) {
               String left = lowerCaseWord.substring(0, i);
               String right = lowerCaseWord.substring(i);

               lowerCaseWord = right + left + "ay";

               break;
            }
         }
      }

      if (isUpper) {
         String firstLetter1 = lowerCaseWord.substring(0, 1).toUpperCase();
         String restOfWord = lowerCaseWord.substring(1);
         lowerCaseWord = firstLetter1 + restOfWord;
      }
      lowerCaseWord += allPunc;
      return lowerCaseWord;
      
   }

   public int endPunctuation(String word) {

      return -1;
   }

   public String translateWord(String word) {
      String convertedWord = "";

      return convertedWord;
   }

   // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
   public String translateSentence(String sentence) {
      String word = "";
      String retSentence = "";
      int spaceIndex = sentence.indexOf(" ");
      while (spaceIndex >= 0) {
         word = sentence.substring(0, spaceIndex);
         retSentence += (pigLatin(word) + " ");

         sentence = sentence.substring(spaceIndex + 1);
         spaceIndex = sentence.indexOf(" ");
      }
      if(sentence.length() > 0)
      {
         retSentence += pigLatin(sentence);
      }

      return retSentence;
   }
   public int getCount(){
   return count;
}

public void saveToFile(String filename) {
    try (FileWriter writer = new FileWriter(filename)) {
        writer.write(book);
    } catch (IOException e) {
        System.out.println("Error saving book to file");
        e.printStackTrace();
    }
}
}

// for (int i = 0; i < word.length(); i++){
// if (vowel.indexOf(word.substring(i, i+1))>=0){
// String left = word.substring ( 0,i);
// String right = word.substring (i,word.length());

// char firstLetter = word.charAt(0);

// if (Character.isUpperCase(firstLetter)){
// String first = right.substring(0,1).toUpperCase();
// String remain = right.substring(1,right.length());
// String left2 = left.toLowerCase();
// return first+remain+left2+"ay";

