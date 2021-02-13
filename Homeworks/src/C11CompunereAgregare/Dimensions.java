package C11CompunereAgregare;

public class Dimensions {
    private int width;
    private int length;
    private int depth;

    public Dimensions(int width, int length, int depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Dimensions{" +
                "width=" + width +
                ", length=" + length +
                ", depth=" + depth +
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
        Dimensions other = (Dimensions) obj;
        if (this.width == other.width && this.length == other.length && this.depth == other.depth ){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + width;
        result = prime * result + length;
        result = prime * result + depth;
        return result;
    }
}
