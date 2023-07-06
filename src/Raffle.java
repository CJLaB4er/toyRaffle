import java.util.ArrayList;

public class Raffle {


    public static Toy raffle(ArrayList<Toy> list) {
        /*метод проходит по списку игрушек и в зависимости от удачи возвращает выпавшую игрушку,
        если ни одна игрушка не выпала, начинается повторный проход при помощи рекурсии.
        */
        list.sort(Toy::compareTo);
        for (Toy toy : list) {
            if (Math.random() * 100 < toy.chance) {
                return toy;
            }
        }
        return raffle(list);
    }

    public static void printInfo(ArrayList<Toy> list) {
        for (Toy toy : list) {
            toy.getInfo();
        }
    }
}
