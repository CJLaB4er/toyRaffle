import java.util.Scanner;

public class Menu {
    static boolean flag = true;

    public static void menu() {


        Scanner scanner = new Scanner(System.in);


        while (flag) {
            System.out.println("Выберите один из пунктов меню:\n" +
                    "1. Вывести информацию об имеющихся игрушках\n" +
                    "2. Изменить шанс выпадения игрушки.\n" +
                    "3. Задать количество розыгрышей игрушек (по умолчанию 5)\n" +
                    "4. Провести розыгрышь (информация о предыдущих розыгрышах будет потеряна)\n" +
                    "5. Записать результаты розыгрыша в файл (имеющийся файл будет перезаписан)\n" +
                    "6. Выйти из программы.\n");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("\nВыбран пункт 1\n");
                    break;
                case "2":
                    System.out.println("\nВыбран пункт 2\n");
                    break;
                case "3":
                    System.out.println("\nВыбран пункт 3\n");
                    break;
                case "4":
                    System.out.println("\nВыбран пункт 4\n");
                    break;
                case "5":
                    System.out.println("\nВыбран пункт 5\n");
                    break;
                case "6":
                    System.out.println("\nВыход из программы");
                    flag = false;
                    break;
                default:
                    System.out.println("\nВаш выбор не распознан, повторите запрос.\n");
            }
        }

    }

}
