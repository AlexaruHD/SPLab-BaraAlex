package ro.uvt.info.proiectsp;

public interface Visitor {
    void visitParagraph(Paragraph p);
    void visitSection(Section s);
    void visitImage(Image i);
    void visitTable(Table t);
    void visitBook(Book b);
}