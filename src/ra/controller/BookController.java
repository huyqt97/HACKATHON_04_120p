package ra.controller;

import ra.model.Book;
import ra.service.Bookservice;

public class BookController {
    private Bookservice service = new Bookservice();
    public boolean createBook (Book book){
        return service.saveBook((book));
    }
    public Book findById(int id){
        return service.findById(id);
    }
    public void deleteId(int id){
        service.deleteId(id);
    }
}
