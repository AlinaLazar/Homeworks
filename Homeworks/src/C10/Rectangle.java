package C10;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String text, String material , int width, int height){
        super(text, material);
        this.width = width;
        this.height = height;
    }

    public void displayRectangleHeight(){
        System.out.println("Rectangle height is: " + this.height);
    }

    @Override
    public int getSize(){
        int aria = this.width * this.height;
        return aria;
    }

    @Override
    public String toString(){
        return "Rectangle: height is: " + this.height + ", and width is: " + this.width + ", " + super.toString();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Rectangle other = (Rectangle) obj;
        if(super.equals(other) && (this.height == other.height) && (this.width == other.width)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + height;
        result = prime * result + width;
        return result;
    }
}
