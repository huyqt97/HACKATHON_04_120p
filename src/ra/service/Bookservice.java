package ra.service;

import ra.model.Book;

public class Bookservice {
    public static Book[] bookList = new Book[50];
    private int size = 0;
    public  boolean  saveBook(Book book){
        if(book == null){
            return false;
        }
        for (int i = 0; i < bookList.length; i++) {
            if(bookList[i] == null || bookList[i].getId() == book.getId()){
                bookList[i] = book;
                size++;
                return true;
            }
        }
        return false;
    }
    public Book findById(int id){

        for (int i = 0; i < bookList.length; i++) {
            if(bookList[i] != null && bookList[i].getId() == id){
                return bookList[i];
            }
        }
        return null;
    }
    public void deleteId(int id){
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] == null) continue;
            if( bookList[i].getId() == id){
                bookList[i] = null;
                return;
            }
        }
    }
}
