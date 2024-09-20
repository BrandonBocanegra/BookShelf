//************************************************************
// BBBook.java               Author:Brandon Bocanegra
// 
// Book Programming Assignment Chapter 4
// Due 10/15/23
// Write a class called Book that contains instance data for
// the title, author, publisher, and copyright date.
//************************************************************

public class BBBook
{
   private String title, author, publisher;
   private int copyright;
 //-----------------------------------------------------------------
 // Sets up this Book object with the specified data.
 //-----------------------------------------------------------------
   public BBBook(String titleInit, String authorInit, String publisherInit,
   int copyrightInit)
   {
      title = titleInit;
      author= authorInit;
      publisher= publisherInit;
      copyright= copyrightInit;
   }
 
 //-----------------------------------------------------------------
 // Accessors.
 //-----------------------------------------------------------------
   public String gettitle()
   {
      return title;
   }
 
   public String getauthor()
   {
      return author;
   }
 
   public String getpublisher()
   {
      return publisher;
   }
 
   public int getcopyright()
   {
      return copyright;
   }
 
 //-----------------------------------------------------------------
 // Mutators.
 //-----------------------------------------------------------------
   public void settitle(String titleUpdate)
   {
      title = titleUpdate;
   }
 
   public void setauthor(String authorUpdate)
   {
      author = authorUpdate;
   }
 
   public void setpublisher(String publisherUpdate)
   {
      publisher = publisherUpdate;
   }
 
   public void setcopyright(int copyrightUpdate)
   {
      copyright = copyrightUpdate;
   }
 
   public String toString()
   {
      return ("title:" + title + "\n" + "author:" + author + "\n" + "publisher:" + publisher + "\n" + "copyright:" + copyright + "\n");
   }
}

 
