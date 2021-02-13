package C11CompunereAgregare;

public class Pixel {
    private String color;

    public Pixel() {
        this("#FFFFFF");
    }

    public Pixel(String color) {
        this.color = color;
    }

    public void setPixel(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Pixel other = (Pixel) obj;
        if (this.color.equals(other.color) ){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.color == null ? 0 : color.hashCode());
        return result;
    }
}
