package ro.uvt.info.proiectsp;

public class Table implements TextElement {
    private String title;

    public Table(String title) {
        this.title = title;
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

    public void print() {
        System.out.println("Table:" + title);
    }
}