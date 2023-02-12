package L3_Enum;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class L3_Singleton_Pattern {
    /*
    Singleton so tr object twy a myt g build lod loh ma ya ag lod
    constructor ko private pay p
    getMethod nk constructor ko build p pay
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //*****
        BookAdder adder = new BookAdder(scanner);
        BookViewer viewer = new BookViewer();

        System.out.print("Add Book ");
        adder.add();

        System.out.println("All Book");
        viewer.show();
    }
}


class BookAdder{
    private BookStore store;
    private Scanner scanner;

    public BookAdder(Scanner scanner){
        this.store = BookStore.getInstance();
        this.scanner = scanner;
    }
    public void add(){
        System.out.println("Book Name: ");
        String book = scanner.nextLine();
        store.add(book);
    }
}


class BookViewer{
    private BookStore store;
    public BookViewer(){
        this.store = BookStore.getInstance(); //*****
    }

    public void show(){
        for (String book : store.getAll()){
            System.out.println(book);
        }
    }
}


class BookStore{
    private String [] books = {};

    private static BookStore store ; //= new BookStore() di lo ll yay call egle singleton********

    private BookStore(){

    } //****

    //******
    public static BookStore getInstance(){
        //lazy singleton
        if (null == store){
            store = new BookStore();
        }
        return store;
    }
    public void add(String str){
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1]= str;

    }
    public String [] getAll(){
        return books;
    }
}
