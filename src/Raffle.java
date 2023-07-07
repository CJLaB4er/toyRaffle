import java.util.ArrayList;
import java.util.List;

public class Raffle {

    static int countRaffle = 5;
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
        /*
        Медот для выведения информации обо всех игрушках
         */
        for (Toy toy : list) {
            toy.getInfo();
        }
    }
    public static ArrayList<Toy> getRaffle(ArrayList<Toy> list){
        /*
        Метод формирует и возвращает список выпавших игрушек, при помощи метода raffle.
        Количество выпавших игрушек задается в меню (по умолчанию 5)
         */
        List<Toy> winnerList = new ArrayList<>();
        for (int i = 0; i < countRaffle; i++) {
            winnerList.add(raffle(list));
        }
        return (ArrayList<Toy>) winnerList;
    }
}
