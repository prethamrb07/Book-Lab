class app {
   public static void main(String[] args){
      //Book aBook = new Book("https://www.gutenberg.org/cache/epub/6130/pg6130.txt");
      Book aBook = new Book("https://www.gutenberg.org/cache/epub/77236/pg77236.txt");
      System.out.println("Total words: " + aBook.getCount());
      aBook.saveToFile("translated_book.txt");
      System.out.println("Book saved to translated_book.txt");
   }
}
