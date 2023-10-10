import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String chapterTitle) {
        Chapter chapter = new Chapter(chapterTitle);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }
}