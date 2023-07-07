import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static private boolean flag = true;

    static private List<Toy> winnerList;
    static String choice;

    public static void menu(ArrayList<Toy> list) {


        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("Выберите один из пунктов меню:\n" +
                    "1. Вывести информацию об имеющихся игрушках\n" +
                    "2. Изменить шанс выпадения игрушки.\n" +
                    "3. Задать количество розыгрышей игрушек (по умолчанию 5)\n" +
                    "4. Провести розыгрышь (информация о предыдущих розыгрышах будет потеряна)\n" +
                    "5. Записать результаты розыгрыша в файл (имеющийся файл будет перезаписан)\n" +
                    "6. Выйти из программы.\n");


            choice = scanner.nextLine();


            switch (choice) {
                case "1":
                    System.out.println("\nВыбран пункт 1\n");
                    Raffle.printInfo(list);
                    System.out.println();
                    break;
                case "2":
                    System.out.println("\nВыбран пункт 2\n");
                    break;
                case "3":
                    Raffle.changeCountRaffle();
                    break;
                case "4":
                    System.out.println("\nПроизведён розыгрышь игрушек.\n");
                    winnerList = Raffle.getRaffle(list);
                    break;
                case "5":
                    System.out.println("\nВыбран пункт 5\n");
                    break;
                case "6":
                    System.out.println("\nВыход из программы");
                    scanner.close();
                    flag = false;
                    break;
                default:
                    System.out.println("\nВаш выбор не распознан, повторите запрос.\n");
            }
        }

    }

}
