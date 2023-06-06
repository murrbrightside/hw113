package dz;

public class Book {
    private String author;
    private int year;

    public Book(String author, int year) {
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString (Book book){
        return "Автор книги " + book.getAuthor() + " год выпуска " + book.getYear();
    }
    public  boolean equals(Object other){
        if(getClass()!= other.getClass()) return false;
        Book b = (Book) other;
        return getAuthor().equals(b.getAuthor()) && getYear() == b.getYear();
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(getAuthor(), getYear());
    }
}


