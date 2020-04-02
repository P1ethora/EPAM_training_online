package pl.content.forCatalog;

public class Book {

    private String name;
    private String author;
    private String description;
    private String bookType;

    public Book(String name, String author,String bookType) {

        this.name = name;
        this.author = author;
        this.bookType=bookType;

    }

    public Book(String name, String author,String bookType, String description) {

        this.name = name;
        this.author = author;
        this.bookType= bookType;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        if(description!=null){
        return  name + "\n" +
                author +"\n" +
                bookType +"\n"+
                description;}
        else {
            return  name + "\n" +
                    author +"\n" +
                    bookType;
        }
    }
}