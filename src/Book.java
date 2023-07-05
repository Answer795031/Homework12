public class Book {
    // класс для описания книги

    private String bookName; // название книги
    Author author;                                              // -------------
    private int year; // год публикации

    public Book(String bookName, Author author, int year){
        this.bookName = bookName;
        this.year = year;
        this.author = author;                                   // как сделать!!!
    }

    public String getBookName(){
        // геттер для названия книги
        return this.bookName;
    }

    public void setBookName(String bookName){
        // сеттер для названия книги
        this.bookName = bookName;
    }

    public int getYear(){
        // геттер для года публикации книги
        return this.year;
    }

    public void setYear(int year){
        // сеттер для года публикации книги
        this.year = year;
    }


}
