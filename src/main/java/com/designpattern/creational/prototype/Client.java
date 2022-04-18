package com.designpattern.creational.prototype;

import javafx.geometry.Point3D;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman sm1 = new Swordsman();
        sm1.move(new Point3D(10,-5,3),20);
        sm1.attack();
        System.out.println(sm1);
        Swordsman sm2 = (Swordsman) sm1.clone();
        System.out.println(sm2);
    }
}
