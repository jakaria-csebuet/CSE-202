/**
 * Created by MD on 18/09/2015.
 */
public class Book {
    private String name ;
    private Author author ;
    private double price ;
    private int stock ;

    public Book(String name,Author author,double price,int stock){
        this.name = name ;
        this.author = author ;
        this.price = price ;
        this.stock = stock ;
    }

    public Book(String name,Author author){
        this.name = name ;
        this.author = author ;
    }

    public String getName(){
        return this.name ;
    }

    public Author getAuthor(){
        return author ;
    }

    public double getPrice(){
        return this.price ;
    }

    public void setPrice(double price){
        this.price = price ;
    }

    public int getStock(){
        return this.stock ;
    }

    public void setStock(int stock){
        this.stock = stock ;
    }

    public void returnBook(int stock){
        this.stock += stock ;
    }

    public void borrowBook(int stock){
        if(this.stock >= stock)
            this.stock -= stock ;
        else
            System.out.println("Borrowing amount exceeds the current stock!");
    }

    public String getAuthorName(){
        return author.getName() ;
    }

    public void print(){
        System.out.println("Author: " + getAuthorName() + " Name: " + this.name + " Price : " + this.price + " Stock: " + this.stock + '\n') ;
    }

}
