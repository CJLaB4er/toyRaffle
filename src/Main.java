import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Toy toy = new Constructor(11);
        System.out.println(toy);
        toy.changeChance(50);
        System.out.println(toy);
    }
}