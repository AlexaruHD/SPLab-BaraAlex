package ro.uvt.info.proiectsp;
import java.util.ArrayList;
import java.util.List;
public class Chapter {
    private String name;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String subChapterName) {
        SubChapter subChapter = new SubChapter(subChapterName);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index) {
        return subChapters.get(index);
    }

    public void print() {
        System.out.println("Chapter: " + name);
        System.out.println("SubChapters:");
        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }
}
