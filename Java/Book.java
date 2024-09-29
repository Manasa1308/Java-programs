public class Book {
    String bookName;
    String isbn;
    String author;
    String publisher;

    public Book(String bookName, String isbn, String author, String publisher) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }

    public String getBookInfo() {
        return bookName + ", " + isbn + ", " + author + ", " + publisher;
    }

    public static void main(String[] args) {
        Book book = new Book("Java Programming", "123456789", "John Doe", "Tech Books");
        System.out.println(book.getBookInfo());
    }
}