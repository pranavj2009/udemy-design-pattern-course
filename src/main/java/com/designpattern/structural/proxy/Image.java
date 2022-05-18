package com.designpattern.structural.proxy;

import javafx.geometry.Point2D;

public interface Image {
    Point2D getLocation();

    void setLocation(Point2D point2D);

    void render();
}
