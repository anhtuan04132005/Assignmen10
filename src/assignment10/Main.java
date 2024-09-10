
package assignment10;

import java.util.Date;
import java.text.SimpleDateFormat;

class Author {
    private String name;
    private Date dateOfBirth;

    public Author() {
        this.name = "";
        this.dateOfBirth = new Date();
    }

    public Author(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Author{name='" + name + "', dateOfBirth=" + sdf.format(dateOfBirth) + "}";
    }
}

class Book {
    private String title;
    private Author author;

    public Book() {
        this.title = "";
        this.author = new Author();
    }

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author=" + author + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Huy", new Date());
        Book book = new Book("Java ", author);
        System.out.println(book);
    }
}

