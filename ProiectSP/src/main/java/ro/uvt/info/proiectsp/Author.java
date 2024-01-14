package ro.uvt.info.proiectsp;
import com.fasterxml.jackson.annotation.JsonCreator;

public class Author {private String name;
    @JsonCreator
    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Author: " + name);
    }
}