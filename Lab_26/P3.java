package Lab_26;

import java.util.Scanner;

class Book{
    private String authorName;

    Book(String authorName){
        this.authorName=authorName;
    }

    String getAuthorName(){
        return authorName;
    }

    void display(){
        System.out.println("Author: "+authorName);
    }
}

class BookPublication extends Book{
    private String title;

    BookPublication(String authorName, String title){
        super(authorName);
        this.title=title;
    }

    @Override
    void display(){
        System.out.println("Book Publication");
        System.out.println("Title: "+title);
        System.out.println("Author: "+getAuthorName());
    }
}

class PaperPublication extends Book{
    private String title;

    PaperPublication(String authorName, String title){
        super(authorName);
        this.title=title;
    }

    @Override
    void display(){
        System.out.println("Paper Publication");
        System.out.println("Title: "+title);
        System.out.println("Author: "+getAuthorName());
    }
}

public class P3 {
    public static void main(String[] args) {
        String author1=args[0];
        String title1=args[1];
        String author2=args[2];
        String title2=args[3];

        Book b1=new BookPublication(author1, title1);
        Book b2=new PaperPublication(author2, title2);

        b1.display();
        System.out.println();
        b2.display();
    }
}


//class Book {
//    private String author_name;
//
//    void getAuthor(String name) {
//        author_name = name;
//    }
//
//    void display() {
//        System.out.println("Author: " + author_name);
//    }
//}
//
//class BookPublication extends Book {
//    private String title;
//
//    void getTitle(String t) {
//        title = t;
//    }
//
//    void display() {
//        System.out.println("Book Publication");
//        System.out.println("Author: " + author_name);
//        System.out.println("Title: " + title);
//    }
//}
//
//class PaperPublication extends Book {
//    private String title;
//
//    void getTitle(String t) {
//        title = t;
//    }
//
//    void display() {
//        System.out.println("Paper Publication");
//        System.out.println("Author: " + author_name);
//        System.out.println("Title: " + title);
//    }
//}
//
//public class    P3 {
//    public static void main(String[] args) {
//
//        if (args.length < 3) {
//            System.out.println("Please provide AuthorName BookTitle PaperTitle");
//            return;
//        }
//
//        String author = args[0];
//        String bookTitle = args[1];
//        String paperTitle = args[2];
//
//        Book b;
//
//        // Book Publication
//        b = new BookPublication();
//        b.getAuthor(author);
//        ((BookPublication)b).getTitle(bookTitle);
//        b.display();
//
//        // Paper Publication
//        b = new PaperPublication();
//        b.getAuthor(author);
//        ((PaperPublication)b).getTitle(paperTitle);
//        b.display();
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Author Name: ");
//        String author = sc.nextLine();
//
//        System.out.print("Enter Book Title: ");
//        String bookTitle = sc.nextLine();
//
//        System.out.print("Enter Paper Title: ");
//        String paperTitle = sc.nextLine();
//
//        Book b;
//
//        b = new BookPublication();
//        b.getAuthor(author);
//        ((BookPublication)b).getTitle(bookTitle);
//        b.display();
//
//        b = new PaperPublication();
//        b.getAuthor(author);
//        ((PaperPublication)b).getTitle(paperTitle);
//        b.display();
//    }
//}
