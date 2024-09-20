//************************************************************
// BBBookshelf.java            Author: Brandon Bocanegra 
//
// BookShelf Programming Assignment Chapter 4
// Due 10/15/23
// Creates a driver class that whose main method instantiates 
// and updates several Book objects
//************************************************************

public class BBBookshelf

{

   public static void main (String[] args){
     
      BBBook book1, book2, book3;
   
      book1 = new BBBook("Moby Dick", "Herman Mellville", "Harper and Row", 1851);
      book2 = new BBBook("The Maze Runner", "James Dashner", "Delacorte Press", 2009);
      book3 = new BBBook("To Kill A Mocking Bird", "Harper Lee", "HarperCollins Publishers", 1960);
   
      System.out.println(book1);
      System.out.println();
      System.out.println(book2);
      System.out.println();
      System.out.println(book3);
   
   }
}
