package LibraryB;

import Library.Book;

public class NonFictionBook extends Book {


    private String subject;

    public NonFictionBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }

    @Override
    public void displayInfo(boolean showStatus) {

        super.displayInfo(showStatus);
        System.out.println("Subject:  "+subject);
    }
}
