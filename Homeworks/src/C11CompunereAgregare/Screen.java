package C11CompunereAgregare;

import java.util.ArrayList;
import java.util.Objects;

public class Screen {
    private ArrayList<Pixel> pixels = new ArrayList<Pixel>();
    private Dimensions dimensions;

    public Screen(int pixelsNo, int width, int length, int depth) {

        for (int i = 0; i < pixelsNo; i++) {  //(Pixel iterator : pixels)?
            Pixel addedPixel = new Pixel();
            this.pixels.add(addedPixel);
        }
        this.dimensions = new Dimensions(width, length, depth);
    }

    public void setPixel(int indexPixel, String color) {
        System.out.println("class Screen: delegate to Pixel ->");
        this.pixels.get(indexPixel).setPixel(color);
    }

    public void colorScreen(String color) {
        for (int i = 0; i < pixels.size(); i++) {
            this.pixels.get(i).setPixel(color);
        }
    }

    @Override
    public String toString() {
        return "Screen{" + "pixels=" + pixels + ", dimensions=" + dimensions + '}';
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null ){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Screen screen = (Screen) obj;
        return Objects.equals(pixels, screen.pixels) && Objects.equals(dimensions, screen.dimensions);
        // sau ( this.pixels.equals(screen.pixels) && (this.dimensions.equals(screen.dimensions));
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + (pixels == null ? 0 : pixels.hashCode());
        result = prime * result + (dimensions == null ? 0 : dimensions.hashCode());
        return result;
    }


}
