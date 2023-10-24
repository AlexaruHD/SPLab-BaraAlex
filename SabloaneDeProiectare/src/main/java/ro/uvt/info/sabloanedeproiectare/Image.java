package ro.uvt.info.sabloanedeproiectare;

import java.util.concurrent.TimeUnit;

public class Image implements Element{
    String imageName;
    public Image(String imageName) {
        this.imageName = imageName;
    }

    public ImageProxy(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit TimeUnit = null;
            TimeUnit.SECONDS.sleep(5);
    }catch (InterruptedException e)
            {
                e. printStackTrace();
            }
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Image: " + imageName);
    }

    @Override
    public void add(Element element) {
        System.out.println("Images cannot contain other elements.");
    }

    @Override
    public void remove(Element element) {
        System.out.println("Images cannot contain other elements.");
    }

    @Override
    public Element get(int nr) {
        System.out.println("Images cannot contain other elements.");
        return null;
    }
}