package ro.uvt.info.sabloanedeproiectare;
public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int nr);
}