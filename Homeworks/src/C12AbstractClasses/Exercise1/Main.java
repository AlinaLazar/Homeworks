package C12AbstractClasses.Exercise1;

public class Main {
    public static void main(String[] args) {

        //Shape shape = new Shape("Math is easy", "plastic");
        Triangle triangle = new Triangle("I reflect light", "glass", 11, 23);
        Rectangle rectangle = new Rectangle("Yellow rectangle" ,"steel", 50,10);

        triangle.displayTriangleHeight();
        rectangle.displayRectangleHeight();

        Shape triangle1 = new Triangle("Box is green", "paper", 20,15);
        triangle1.hashCode();
        Shape triangle2 = new Triangle("Box is green", "paper", 20,15);
        System.out.println(triangle1.equals(triangle2));

        System.out.println(triangle1);

    }
}
