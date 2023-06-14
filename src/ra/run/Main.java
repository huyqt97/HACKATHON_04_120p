package ra.run;

import ra.config.Config;
import ra.controller.BookController;
import ra.model.Book;
import ra.service.Bookservice;

public class Main {
    static Book[] bookList = Bookservice.bookList;
    static BookController controller = new BookController();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.\tHiển thị ra tất cả sách\n" +
                    "2.\tThêm sách mới\n" +
                    "3.\tTìm kiếm sách\n" +
                    "4.\tThay đổi thông tin sách\n" +
                    "5.\tXóa sách\n" +
                    "6.\tThoát");
            System.out.println("nhập lựa chọn của bạn: ");
            int choice = Config.getScanner().nextInt();
            switch (choice) {
                case 1:
                    showAllBook();
                    break;
                case 2:
                    createBook();
                    break;
                case 3:
                case 4:
                case 5: deleteBook();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    static void showAllBook() { // in ra danh sách book
        System.out.println("------danh sách book------");
        if (bookList != null) {
            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] != null) {
                    System.out.println(bookList[i]);
                }
            }
        } else System.err.println("kho sách trống!");

    }

    public static void createBook() {
        Book book = new Book();
        int id = idAutoIncrement();
        book.setId(id);
        System.out.println("Nhập tên sách mới: ");
        String bookName = Config.getScanner().nextLine();
        System.out.println("Tác giả: ");
        String author = Config.getScanner().nextLine();
        System.out.println("Mô tả về sách: ");
        String descriptions = Config.getScanner().nextLine();
        System.out.println("Giá nhập sách: ");
        double importPrice = Config.getScanner().nextDouble();
        System.out.println("Giá bán: ");
        double exportPrice = Config.getScanner().nextDouble();
        boolean bookStatus = getStatus();
        Book bookf = new Book(id, bookName, author, descriptions, importPrice, exportPrice, (float) (exportPrice - importPrice), bookStatus);
        boolean checkBook = controller.createBook(bookf);
        if (checkBook) {
            System.out.println("thêm sách thành công!");
        } else System.out.println("Sách đx có sẵn!");

    }

    static boolean getStatus() {
        System.out.println("Trạng thái: ");
        System.out.println("1. Còn hàng");
        System.out.println("2. Hết hàng");
        int choice = Config.getScanner().nextInt();
        return choice == 1 ? true : false;
    }

    static int idAutoIncrement() {
        int maxId = 0;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null && maxId < bookList[i].getId()) {
                maxId = bookList[i].getId();
            }
        }
        return maxId + 1;
    }

    static void deleteBook() {
        System.out.println("chọn id sách muốn xóa: ");
        int id = Config.getScanner().nextInt();
        Book book = controller.findById(id);
        if (book != null) {
            controller.deleteId(id);
            System.out.println("xóa thành công");
        } else {
            System.err.println("không tìm sách muốn xóa");
        }
    }
}
