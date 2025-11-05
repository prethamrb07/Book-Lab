public class Book {
   public String pigLatin(String word){
      String newWord = "";
      String vowel = "aeiouy";
      String numbers = "1234567890";
      String punctuation = "!?.:;";
      boolean a=false;
       if(word.length()==0){
         return word;
      }
      for (int i = 0; i < word.length(); i++){
         if (word.substring(i,i+1)=="-"){
            a=true;
         }
      }
      
      
      if(a){
         return word+"yay";
      }
      else if (vowel.indexOf(word.substring(0,1))>=0){
         return word + "yay";
      }else if(numbers.indexOf(word.substring(0,1))>=0){
         return word + "ay";
      }else if (word.length()==1){
         return word+"ay";
      }else{
      

      for (int i = 0; i < word.length(); i++){
         if (vowel.indexOf(word.substring(i, i+1))>=0){
            String left = word.substring ( 0,i);
            String right = word.substring (i,word.length());
            
           

            char firstLetter = word.charAt(0);

            if (Character.isUpperCase(firstLetter)){
               String first = right.substring(0,1).toUpperCase();
               String remain = right.substring(1,right.length());
               String left2 = left.toLowerCase();
               return first+remain+left2+"ay";

            }else{
               return right+left+"ay";
            }
         }
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
