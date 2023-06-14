package ra.model;

public class Book {
    private int id; //id
    private String bookName; // tên sách
    private String author; // tác giả
    private String descriptions; // mô tả về sách
    private double importPrice; // giá nhập
    private double exportPrice; //giá xuất
    private float interest; // lợi nhuận
    private boolean bookStatus; //trạng thái

    public Book(int i, String đắcNhânTâm, String daleCarnegie) {
    }

    public Book(int id, String bookName, String author, String descriptions, double importPrice, double exportPrice, float interest, boolean bookStatus) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
    }
    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id +
                ", bookName='" + bookName +
                '\'' + ", author='" + author +
                '\'' + ", descriptions='" + descriptions +
                '\'' + ", importPrice=" + importPrice + "đ" +
                ", exportPrice=" + exportPrice + "đ" +
                ", interest=" + interest + "đ" +
                ", bookStatus= " + (bookStatus ? "Còn hàng" : "Hết hàng")  +
                '}';
    }
}
