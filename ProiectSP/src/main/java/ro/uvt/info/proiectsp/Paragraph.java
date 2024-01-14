package ro.uvt.info.proiectsp;

public class Paragraph implements TextElement {
    private String text;
    private AlignStrategy alignStrategy;
    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = new AlignLeft();
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.alignStrategy = strategy;
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
        System.out.println("Paragraph: " + text);
    }
    public void print(int lineLength) {
        String alignedText = alignStrategy.render("Paragraph: " + text, lineLength);
        System.out.println(alignedText);
    }
}