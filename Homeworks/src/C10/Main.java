package C10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape ("Math is easy", "plastic");
        Triangle triangle = new Triangle("I reflect light", "glass", 11, 23);
        Rectangle rectangle = new Rectangle("Yellow rectangle" ,"steel", 50,10);

        System.out.println(shape.getSize());
        System.out.println(triangle.getSize());
        System.out.println(rectangle.getSize());

        System.out.println(shape);
        System.out.println(triangle);
        System.out.println(rectangle);

        Shape shape1 = new Shape ("BrainBox", "paper");
        Triangle triangle1 = new Triangle("I reflect light", "glass" ,11,23);
        Rectangle rectangle1 = new Rectangle("Yellow rectangle", "steel", 50,20);
        Shape shape2 = shape1;

        System.out.println(shape.equals(shape1));
        System.out.println(triangle.equals(triangle1));
        System.out.println(rectangle.equals(rectangle1));
        System.out.println(shape.equals(triangle));
        System.out.println(shape2.equals(shape1));

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(shape);
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(triangle);
        shapes.add(triangle1);
        shapes.add(rectangle);
        shapes.add(rectangle1);

        for(Shape iterator : shapes){
            System.out.println(iterator.hashCode());
        }

        for (Shape iterator : shapes){
            System.out.println(iterator);
        }

        for(Shape iterator : shapes){
            System.out.println(iterator.getSize());
        }

        for (Shape iterator : shapes){
            if (iterator instanceof Triangle){
                ((Triangle) iterator).displayTriangleHeight();
            } else if (iterator instanceof Rectangle){
                ((Rectangle) iterator).displayRectangleHeight();
            }else if (iterator instanceof Shape){
                continue;
            }
        }


    }
}
