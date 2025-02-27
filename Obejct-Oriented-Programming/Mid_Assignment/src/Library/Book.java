package Library;

   public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;
    private static final int max_books=100;




     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }


     public String getAuthor() {
         return author;
     }

     public void setAuthor(String author) {
         this.author = author;
     }


       public boolean isBorrowed() {
           return isBorrowed;
       }

       public void setBorrowed(boolean isBorrowed) {
           this.isBorrowed = isBorrowed;
       }

       public static int getMaxBooks() {
           return max_books;
       }

       public Book(String title, String author) {
           this.title = title;
           this.author = author;
           this.isBorrowed = false;
       }


     public void displayInfo() {
       //  System.out.println("Title: " + title);
       //  System.out.println("Author: " + author);
         System.out.println("Title: " + title + ", Author: " + author);
     }

     public void displayInfo(boolean showStatus) {


         if (showStatus) {
            // System.out.println("Is Borrowed: " + isBorrowed);
             System.out.println("Title: " + title + ", Author: " + author + ", Borrowed: " + isBorrowed);
         }
         else{
             displayInfo();
         }
     }
     public void borrow(){
           if (!isBorrowed) {
               System.out.println("You can borrow the book.");
               isBorrowed = true;
           } else {
               System.out.println("You cannot borrow the book.");
           }
       }

       public void returnBook() {
           if (isBorrowed) {
               System.out.println("Returned the book.");
               isBorrowed = false;
           } else {
               System.out.println("Book is not borrowed.");
           }
       }
  }