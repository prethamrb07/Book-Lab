public class Book {
   public String pigLatin(String word) {
      String newWord = "";
      String vowel = "aeiouy";
      String numbers = "1234567890";
      String punctuation = "!?.:;";
      String allPunc = "";
      String lowerCaseWord = "";
      if (word.length() == 0) 
      {
         word = word;
      }

      if (punctuation.indexOf(word.substring(0, 1)) >= 0) 
      {
         for (int j = 0; j < word.length(); j++) {
            if (punctuation.indexOf(word.charAt(j)) >= 0) {
               lowerCaseWord = word.substring(0, j);
               allPunc = word.substring(j, word.length());
               
            }
         }



      }

      char firstLetter = word.charAt(0);

      boolean isUpper = false;

      

      if (Character.isUpperCase(firstLetter)) {
            lowerCaseWord = word.toLowerCase();
            isUpper = true;

         }

         boolean startsWithVowel = false;

       if (vowel.indexOf(word.substring(0, 1)) >= 0) {
         startsWithVowel = true;
         
      } 

      boolean numbersBool=false;

      if (numbers.indexOf(word.substring(0, 1)) >= 0) {
         numbersBool=true;
       }

      boolean lenIs1 = false;

      if (word.length() == 1) {
         lenIs1=true;
      }

      if(lenIs1)
      {
         lowerCaseWord = word+"ay";
      }

      else if(numbersBool)
      {
         lowerCaseWord = word + "ay";
      }

      else if(startsWithVowel)
      {
         lowerCaseWord = word + "yay";
      }

      else
      {
      for (int i = 0; i < word.length(); i++) {
         if (vowel.indexOf(word.substring(i, i + 1)) >= 0 && startsWithVowel == false) {
            String left = lowerCaseWord.substring(0, i);
            String right = lowerCaseWord.substring(i, word.length());
            
            lowerCaseWord = right+left+"ay";

            break;
         }
      }
   }
      
      if(isUpper)
      {
         String firstLetter1 =  lowerCaseWord.substring(0,1).toUpperCase();
         String restOfWord = lowerCaseWord.substring(1);
         lowerCaseWord = firstLetter1+restOfWord;
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
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
   public String translateSentence(String sentence) {
      String word = "";
      String retSentence = "";
      int spaceIndex = sentence.indexOf(" ");
      for (int i = 0; i < sentence.length(); i++){
         while (spaceIndex >= 0){
            word = work.substring(0,i);
            retSentence += pigLatin(word) + "";
            sentence = sentence.substring(i,sentence.length());
            spaceIndex = sentence.indexOf(" ");
         }
      }
      return retSentence;
   }
}

      // for (int i = 0; i < word.length(); i++){
      //    if (vowel.indexOf(word.substring(i, i+1))>=0){
      //       String left = word.substring ( 0,i);
      //       String right = word.substring (i,word.length());
            
           

      //       char firstLetter = word.charAt(0);

      //       if (Character.isUpperCase(firstLetter)){
      //          String first = right.substring(0,1).toUpperCase();
      //          String remain = right.substring(1,right.length());
      //          String left2 = left.toLowerCase();
      //          return first+remain+left2+"ay";
