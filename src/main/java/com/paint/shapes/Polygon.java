/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint.shapes;

/**
 *
 * @author HP
 */
public class Polygon implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Polygon");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Polygon");
    }

    public void move(int x, int y) {
        System.out.println("Moving Polygon");
    }

    @Override
    public void resize(double factor) {
        System.out.println("Resizing Polygon");
    }
    
}
