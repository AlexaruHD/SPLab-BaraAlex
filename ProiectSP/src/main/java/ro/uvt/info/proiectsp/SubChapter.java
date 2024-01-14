package ro.uvt.info.proiectsp;
import java.util.ArrayList;
import java.util.List;
public class SubChapter {
    private String name;
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<Image> images = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String text) {
        paragraphs.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        images.add(new Image(imageName));
    }

    public void createNewTable(String tableTitle) {
        tables.add(new Table(tableTitle));
    }

    public void print() {
        System.out.println("Subchapter: " + name);

        for (Paragraph paragraph : paragraphs) {
            paragraph.print();
        }

        for (Image image : images) {
            image.print();
        }

        for (Table table : tables) {
            table.print();
        }
    }
}