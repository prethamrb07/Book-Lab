public class Book {
   public String pigLatin(String word){
      String newWord = "";
      String vowel = "aeiouy";
      String numbers = "1234567890";
      if(word.length()==0){
         return word;
      }
      else if (vowel.indexOf(word.substring(0,1))>=0){
         return word + "yay";
      }else if(numbers.indexOf(word.substring(0,1))>=0){
         return word + "ay";
      }else if (word.length()==1){
         return word+"ay";
      }
      for (int i = 0; i < word.length(); i++){
         if (vowel.indexOf(word.substring(i, i+1))>=0){
            String left = word.substring ( 0,i);
            String right = word.substring (i,word.length());
            return right+left+"ay";
            
         }
      }
      return word;
   }
   public int endPunctuation(String word){


      return -1;
   }
   public String translateWord(String word){
      String convertedWord="";

      return convertedWord;
   }
   public String translateSentence(String word){
      String retSentence = "";


      return retSentence;
   }
}
