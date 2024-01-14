package ro.uvt.info.proiectsp;
import java.util.ArrayList;
import java.util.List;
public class Image extends TextElement {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void print() {
        System.out.println("Image with name:" + imageName);
    }
}