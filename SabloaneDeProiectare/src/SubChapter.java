import java.util.ArrayList;
import java.util.List;

class SubChapter {
    private String title;
    private List<String> content = new ArrayList<>();

    public SubChapter(String title) {
        this.title = title;
    }

    public void createNewParagraph(String paragraph) {
        content.add("Paragraph: " + paragraph);
    }

    public void createNewImage(String image) {
        content.add("Image: " + image);
    }

    public void createNewTable(String table) {
        content.add("Table: " + table);
    }

    public void print() {
        System.out.println("SubChapter: " + title);
        for (String item : content) {
            System.out.println(item);
        }
    }
}