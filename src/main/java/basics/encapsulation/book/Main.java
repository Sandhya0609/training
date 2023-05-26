package basics.encapsulation.book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the price");
        int price=s.nextInt();

        Book book=new Book();
        book.setTitle("hghjjjhghh");
        book.setAuthor("Hhjjhjhj");
        book.setIsbn("78yuhg5");
        System.out.println("BookTitle: "+book.getTitle());
        System.out.println("Author: "+book.getAuthor());
        System.out.println("Isbn: "+book.getIsbn());

       if(price>0){
           book.setPrice(price);
           System.out.println("The price of the book is: "+book.getPrice());
       }else{
           System.out.println("Wrong Entry....");
       }

    }
}
