package L3_Enum;

import java.util.Arrays;
import java.util.Scanner;

public class L4_SingletonWithEnum {
}


class bookAdder{
    private bookStore store;
    private Scanner scanner;

    public bookAdder(Scanner scanner){
        this.store = bookStore.STORE;
        this.scanner = scanner;
    }
    public void add(){
        System.out.println("Book Name: ");
        String book = scanner.nextLine();
        store.add(book);
    }
}


class bookViewer{
    private bookStore store;
    public bookViewer(){
        this.store = bookStore.STORE; //*****
    }

    public void show(){
        for (String book : store.getAll()){
            System.out.println(book);
        }
    }
}


enum bookStore{

    STORE;     //*****

    private String [] books = {};

    public void add(String str){
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1]= str;

    }
    public String [] getAll(){
        return books;
    }
}
