package hackerrank.days30ofCode;

public class d13_Inheritance_abstractClasses {
    abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    // Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
    class MyBook extends Book{
        int price;

        /**
         *   Class Constructor
         *
         *   @param title The book's title.
         *   @param author The book's author.
         *   @param price The book's price.
         **/
        MyBook(String title, String author, int price){
            super(title, author);
            this.price = price;
        }

        /**
         *   Method Name: display
         *
         *   Print the title, author, and price in the specified format.
         **/
        void display(){
            System.out.println("Title: "+title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }

}
