package Lab_26;

import java.util.Scanner;

class Book {
    String author_name;

    void getAuthor(String name) {
        author_name = name;
    }

    void display() {
        System.out.println("Author: " + author_name);
    }
}

class BookPublication extends Book {
    String title;

    void getTitle(String t) {
        title = t;
    }

    void display() {
        System.out.println("Book Publication");
        System.out.println("Author: " + author_name);
        System.out.println("Title: " + title);
    }
}

class PaperPublication extends Book {
    String title;

    void getTitle(String t) {
        title = t;
    }

    void display() {
        System.out.println("Paper Publication");
        System.out.println("Author: " + author_name);
        System.out.println("Title: " + title);
    }
}

public class P3 {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Please provide AuthorName BookTitle PaperTitle");
            return;
        }

        String author = args[0];
        String bookTitle = args[1];
        String paperTitle = args[2];

        Book b;

        // Book Publication
        b = new BookPublication();
        b.getAuthor(author);
        ((BookPublication)b).getTitle(bookTitle);
        b.display();

        // Paper Publication
        b = new PaperPublication();
        b.getAuthor(author);
        ((PaperPublication)b).getTitle(paperTitle);
        b.display();
    }
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
}
