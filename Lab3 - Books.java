import java.util.Scanner;

class Book{
    String name;
    String author;
    double price;
    int num_pages;

    Book(String name, String author, double price, int num_pages){
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }


    void setName(String name) {this.name = name; }
    void setAuthor(String author) {this.author = author; }
    void setPrice(double price) {this.price = price; }
    void setNumPages(int num_pages) {this.num_pages = num_pages; }


    String getName() {return name; }
    String getAuthor() {return author; }
    double getPrice() {return price; }
    int getNumPages() {return num_pages; }


    public String toString(){
        return "\n Book Name : " + name + "\n Author : " + author + "\n Price : " + price + "\n Pages : " + num_pages;
    }
}

public class Lab3{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number of Books : ");
        int n = inp.nextInt();
        inp.nextLine();

        Book[] books = new Book[n];

        for(int i=0 ; i<n ; i++){
            System.out.println("Enter Details for book " + (i+1) + ": ");

            System.out.print("Name : ");
            String name = inp.nextLine();

            System.out.print("Author : ");
            String author = inp.nextLine();

            System.out.print("Price : ");
            double price = inp.nextDouble();

            System.out.print("Pages : ");
            int num_pages = inp.nextInt();
            inp.nextLine();

            books[i] = new Book(name, author, price, num_pages);
        }
        System.out.println("--------------Book details--------------");

        for(int i=0 ; i<n ; i++){
            System.out.println(books[i].toString());
        }
        inp.close();
    }
}