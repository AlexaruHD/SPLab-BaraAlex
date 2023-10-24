package ro.uvt.info.sabloanedeproiectare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SabloaneDeProiectareApplication {

    public static void main(String[] args) {
        Section chapter1 = new Section("Chapter 1");

        Section section1_1 = new Section("Section 1.1");
        section1_1.add(new Paragraph("This is a paragraph in Section 1.1."));
        section1_1.add(new Image("image1.jpg"));

        Section section1_2 = new Section("Section 1.2");
        section1_2.add(new Paragraph("This is a paragraph in Section 1.2."));

        chapter1.add(section1_1);
        chapter1.add(section1_2);
        chapter1.print();

        Long startTime = System.currentTimeMillis();
        Image img1 = new Image("Pamela Anderson");
        Image img2 = new Image("Kim Kardashian");
        Image img3 = new Image("Kirby Griffin");
        Section playboyS1 = new Section ("Front Cover");
        playboyS1.add(img1);
        Section playboyS2 = new Section ("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);
        Book playboy = new Book( "Playboy");
        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1. print ();
        endTime = System. currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1. print ();
        endTime = System. currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System. currentTimeMillis();
        ImageProxy img11 = new ImageProxy ("Pamela Anderson");
        ImageProxy img22 = new ImageProxy("Kim Kardashian");
        ImageProxy img33 = new ImageProxy("Kirby Griffin");
        Section playboyS11 = new Section("Front Cover");
        playboyS1. add (img11);
        Section playboyS22 = new Section("Summer Girls");
        playboyS2. add (img22);
        playboyS2. add (img33);
        Book playboy1 = new Book("Playboy");
        playboy. addContent (playboyS1);
        playboy. addContent (playboyS2);
        endTime = System. currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System. currentTimeMillis();
        playboyS1. print();
        endTime = System. currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1. print();
        endTime = System. currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");
    }
    }


}