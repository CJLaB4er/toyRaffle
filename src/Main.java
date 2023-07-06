import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Main {
    static List<Toy> toysList = new ArrayList<>();
    public static void main(String[] args) {
        Toy toy1 = new Car(1);
        Toy toy2 = new Constructor(2);
        Toy toy3 = new Doll(3);
        Toy toy4 = new Puzzle(4);
        Toy toy5 = new Robot(5);
        Toy toy6 = new VideoGame(6);
        toysList.add(toy1);
        toysList.add(toy2);
        toysList.add(toy3);
        toysList.add(toy4);
        toysList.add(toy5);
        toysList.add(toy6);

        for (Toy toy: toysList) {
            System.out.println(toy);
        }
        toy6.changeChance(5);
        for (Toy toy: toysList) {
            System.out.println(toy);
        }
        toysList.sort(Toy::compareTo);
        for (Toy toy: toysList) {
            System.out.println(toy);
        }
    }
}