package Library.Modules;
public class Book{

    int ID;
    String title;
    String author;
    int isbn;
    boolean available;

    public Book(int ID, String title, String author, int isbn, boolean available){
        this.ID  = ID;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    public int getID(){
        return ID;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getIsbn(){
        return isbn;
    }

    public boolean getAvailable(){
        return available;
    }

    public void setAvailable(boolean i){
        this.available = i;
    }

    @Override
    public String toString(){
        return ID + " - " + title + " - " + author + " - " + isbn + " - " + available;
    }
}