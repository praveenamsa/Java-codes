package newpackage;
import java.util.*;
class Book{
    int id, quality;
    String name, author, publisher;
    public Book(int id, String name, String author, String publisher, int quality){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quality = quality;
    }
}
public class MyArrayList {
    public static void main(String[] args) {  
        //creating list of books
        ArrayList<Book> list = new ArrayList<Book>();
        //Creating Books
        Book b1 = new Book(101,"C Language","Praveenk","PD75",10);
        Book b2 = new Book(102,"JAVA Language","PraveenkPd75","PD7575",9);
        Book b3 = new Book(103,"PYTHON Language","Praveenk75","PD757575757",23);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quality);
        }
    }   
}
