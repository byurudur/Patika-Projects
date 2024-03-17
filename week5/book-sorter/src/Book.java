import java.util.Comparator;

public class Book implements Comparable<Book> {

    private int pageNumber;
    private String name;
    private String authorName;


    public Book(int pageNumber, String name, String authorSurname) {
        this.pageNumber = pageNumber;
        this.name = name;
        this.authorName = authorSurname;

    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }



    public int getPageNumber() {
        return pageNumber;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public int compareTo(Book o) {
        if (this.pageNumber < o.getPageNumber()){
            return -1;
        }else if (this.pageNumber > o.getPageNumber()){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return " || Book name : " + name + " || Book page number: " + pageNumber + " || Author name: " + authorName;
    }



}
