package C6;

public class Main {
    public static void main(String[] args) {
        MyIntArrayList value = new MyIntArrayList();
        value.add(10);
        value.add(23);
        value.add(35);
        System.out.println(value.contains(24));
        System.out.println(value.size());
        System.out.println(value.get(1));
        System.out.println(value.indexOf(10));
        System.out.println(value.lastIndexOf(35));
        System.out.println(value.remove(23));
        value.add(2, 45);
        System.out.println(value.removeElementAtIndex(2));
        System.out.println(value.set(3,56));
        value.ensureCapacity(20);
        value.trimToSize();




    }
}
