package ro.uvt.info.proiectsp;

import java.util.ArrayList;
import java.util.List;
public class TableOfContents implements TextElement {
    private List<TextElement> entries = new ArrayList<>();

    public void add(int index, TextElement element) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public TextElement get(int index) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public void remove(TextElement element) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public void print() {
        System.out.println("Table of Contents:");
        for (TextElement entry : entries) {
            entry.print();
        }
    }
}