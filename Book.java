public class Book {
   public String pigLatin(String word) {
      String newWord = "";
      String vowel = "aeiouy";
      String numbers = "1234567890";
      String punctuation = "!?.:;";
      String allPuncOut = "";
      if (word.length() == 0) {
         word =  word;
      }

      if (punctuation.indexOf(word.substring(0, 1)) >= 0) {
         for (int j = 0; j < word.length(); j++) {
            if (punctuation.indexOf(word.substring(j, j + 1)) >= 0) {
               word = word.substring(0, j);
               String allPunc = word.substring(j, word.length());
               allPuncOut = allPunc;
            }
         }



      } 
               char firstLetter = word.charAt(0);

         boolean isUpper = false;
         String lowerCaseWord = "";
      if (Character.isUpperCase(firstLetter)) {
             lowerCaseWord = word.toLowerCase();
            isUpper = true;

         }
       if (vowel.indexOf(word.substring(0, 1)) >= 0) {
         word =  word + "yay";
      } 
       if (numbers.indexOf(word.substring(0, 1)) >= 0) {
         word = word + "ay";
      } else if (word.length() == 1) {
         word = word + "ay";
      }

      for (int i = 0; i < word.length(); i++) {
         if (vowel.indexOf(word.substring(i, i + 1)) >= 0) {
            String left = word.substring(0, i);
            String right = word.substring(i, word.length());
            
            

            
         }
      }

      word += allPuncOut;
      if(isUpper)
      {
         word = lowerCaseWord.substring(0,1).toUpperCase();
      }

      return word;
   }

   public int endPunctuation(String word) {

      return -1;
   }

   public String translateWord(String word) {
      String convertedWord = "";

      return convertedWord;
   }

   public String translateSentence(String word) {
      String retSentence = "";

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