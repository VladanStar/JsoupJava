package com.company;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://www.b92.net/sport/").get();
            Elements newsHeadlines = doc.select("#tabs-1 > ul > li > a");
            for (Element e : newsHeadlines) {
                System.out.println("http://b92.net" + e.attr("href"));
                System.out.println(e.html());
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
