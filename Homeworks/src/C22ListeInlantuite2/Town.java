package C22ListeInlantuite2;

public class Town implements Comparable<Town> {
    private String name;
    private int distance;

    public Town(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    @Override
    public int compareTo(Town o) {
        if(this.equals(o)){
            return 0;
        } else if (this.distance < o.distance){
            return -1;
        } else{
            return 1;
        }
    }

    public boolean equals(Town o) {
        return (this.distance == o.distance);
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
