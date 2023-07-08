import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static private boolean flag = true;
    static Scanner scanner = new Scanner(System.in);

    static private List<Toy> winnerList = new ArrayList<>();
    static String choice;

    public static void menu(ArrayList<Toy> list) {


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
                    Raffle.printInfo(list);
                    System.out.println();
                    break;
                case "2":
                    Raffle.changeChanceToy(list);
                    break;
                case "3":
                    Raffle.changeCountRaffle();
                    break;
                case "4":
                    System.out.println("Произведён розыгрышь игрушек.\n");
                    winnerList = Raffle.getRaffle(list);
                    break;
                case "5":
                    if (checkWinList((ArrayList<Toy>) winnerList)) {
                        System.out.println("\nВведите название для файла\n");
                        String fileName = scanner.nextLine();
                        clearWriteFile(fileName);
                        for (Toy toy : winnerList) {
                            toy.writeToFile(fileName);
                        }
                        System.out.println("Результаты розыгрыша записаны в файл: " + fileName + "\n");
                    } else {
                        System.out.println("Перед записью результатов в файл, необходимо провести розыгрышь п.4\n");
                    }


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

    public static void clearWriteFile(String filename) {
        try {
            FileWriter file = new FileWriter(filename);
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean checkWinList(ArrayList<Toy> list) {
        return list.isEmpty() ? false : true;
    }

}
