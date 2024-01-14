package ro.uvt.info.proiectsp;
import java.util.ArrayList;
import java.util.List;
public class Image implements TextElement {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    public void add(int index, TextElement element) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public TextElement get(int index) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public void remove(TextElement element) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + name);
    }
}