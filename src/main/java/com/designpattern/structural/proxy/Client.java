package com.designpattern.structural.proxy;

import javafx.geometry.Point2D;

public class Client {

    public static void main(String[] args) {
        Image image = ImageFactory.getImage("A1.bmp");

        image.setLocation(new Point2D(10.0,10.0));
        System.out.println("Image location: "+image.getLocation());
        System.out.println("Rendering image now");
        image.render();
    }
}
