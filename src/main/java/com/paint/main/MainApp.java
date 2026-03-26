/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.paint.main;

import com.paint.shapes.Circle;
import com.paint.shapes.Rectangle;
import com.paint.shapes.Shape;
import com.paint.utils.Point;
import com.paint.window.ConsoleWindow;
import com.paint.window.Window;

/**
 *
 * @author HP
 */
public class MainApp {

    public static void main(String[] args) {
        System.out.println("DevOps Project Running");

        Point p = new Point(10, 20);

        Shape circle = (Shape) new Circle(5, p);
        circle.draw();

        Shape rect = (Shape) new Rectangle(new Point(0, 0), 10, 20);
        rect.draw();

        Window window = new ConsoleWindow();
        window.open();
        window.display();
    }
    
}
