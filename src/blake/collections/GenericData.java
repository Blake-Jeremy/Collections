package blake.collections;

public class GenericData {
    private String title;
    private String author;
    private String releaseDate;

    /*******************************************************************
     *  GenericData Method
     *  Part of the GenericData Class, this method takes in 3 strings
     *  and sets them to the local variables in the class
     *******************************************************************/

    public GenericData(String title, String author, String releaseDate) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String toString() {
        return "Title: " + title + " Author: " + author + " Release Date: " + releaseDate;
    }
}
