package LibraryB;

import Library.Book;
import LibraryA.FictionBook;

public class LibraryTest {
    public static void main(String[] args) {
        Book[] myBooks =new Book[3];

        myBooks[0] =new FictionBook("Station","Humayun Ahmed","Reality");
        myBooks[1] =new FictionBook("Nirbashon","Sadat Hossain","Fantasy");
        myBooks[2] =new NonFictionBook("Aroj Ali Somipe","Arif Azad","History");

for (Book book: myBooks){
    book.displayInfo();
    book.displayInfo(true);
    System.out.println();
}

    myBooks[0].borrow();
    myBooks[0].returnBook();
        
    }
}
