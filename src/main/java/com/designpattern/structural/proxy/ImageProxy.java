package com.designpattern.structural.proxy;

import javafx.geometry.Point2D;

public class ImageProxy implements Image {
    private final String fileName;
    private BitmapImage image;
    private Point2D location;

    public ImageProxy(String name) {
        this.fileName = name;
    }

    @Override
    public Point2D getLocation() {
        if (image != null) {
            return image.getLocation();
        }
        return this.location;
    }

    @Override
    public void setLocation(Point2D point2D) {
        if (image != null) {
            image.setLocation(point2D);
        } else {
            this.location = point2D;
        }

    }

    @Override
    public void render() {
        if (image == null) {
            image = new BitmapImage(fileName);
            if (location != null) {
                image.setLocation(location);
            }
        }
        image.render();
    }
}
