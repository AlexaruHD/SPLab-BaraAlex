package ro.uvt.info.proiectsp;
import java.util.ArrayList;
import java.util.List;
public class Section implements TextElement, Visitee {
    private String title;
    private List<TextElement> content = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public List<TextElement> getContent(){
        return content;
    }

    public int add(TextElement element) {
        content.add(element);
        return content.indexOf(element);
    }

    public TextElement get(int index) {
        return content.get(index);
    }

    public void remove(TextElement element) {
        content.remove(element);
    }

    public void accept(Visitor v) {
        v.visitSection(this);
    }

}