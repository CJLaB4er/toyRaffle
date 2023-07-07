import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Raffle {

    static int countRaffle = 5;

    public static Toy raffle(ArrayList<Toy> list) {
        /*метод проходит по списку игрушек и в зависимости от удачи возвращает выпавшую игрушку,
        если ни одна игрушка не выпала, начинаетс€ повторный проход при помощи рекурсии.
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
        ћедот дл€ выведени€ информации обо всех игрушках
         */
        for (Toy toy : list) {
            toy.getInfo();
        }
    }

    public static ArrayList<Toy> getRaffle(ArrayList<Toy> list) {
        /*
        ћетод формирует и возвращает список выпавших игрушек, при помощи метода raffle.
         оличество выпавших игрушек задаетс€ в меню (по умолчанию 5)
         */
        List<Toy> winnerList = new ArrayList<>();
        for (int i = 0; i < countRaffle; i++) {
            winnerList.add(raffle(list));
        }
        return (ArrayList<Toy>) winnerList;
    }

    public static void changeCountRaffle() {
        /*
        ƒанный метод измен€ет количество розыгрываемых игрушек, проверки на корректность ввода нет.
         */
        System.out.println("¬ведите количество необходимых игрушек...\n");
        int count = Integer.parseInt(Menu.scanner.nextLine());
        countRaffle = count;
        System.out.println(" оличество розыгрышей игрушек изменено на " + Integer.toString(countRaffle) + "\n");

    }

    public static void changeChanceToy(List<Toy> list) {
        System.out.println("¬ведите id необходимой игрушки...\n");
        int toyId = Integer.parseInt(Menu.scanner.nextLine());
        System.out.println("¬ведите новое значение шанса выпадени€ от 1 до 100\n");
        int newChance = Integer.parseInt(Menu.scanner.nextLine());

        for (Toy toy : list) {
            if (toy.id == toyId) {
                toy.changeChance(newChance);
                break;
            }
        }
    }
}
