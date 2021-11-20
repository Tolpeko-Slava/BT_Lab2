package com.company;

public class Main {
    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
            StuctXml ListProduct = new StuctXml();

            String Path = "appliances_db.xml";

            ListProduct.Read(Path,"Teapot");

    }
}
