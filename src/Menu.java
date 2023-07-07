import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static boolean flag = true;
    static public List<Toy> winnerList;

    public static void menu(ArrayList<Toy> list) {


        Scanner scanner = new Scanner(System.in);


        while (flag) {
            System.out.println("�������� ���� �� ������� ����:\n" +
                    "1. ������� ���������� �� ��������� ��������\n" +
                    "2. �������� ���� ��������� �������.\n" +
                    "3. ������ ���������� ���������� ������� (�� ��������� 5)\n" +
                    "4. �������� ��������� (���������� � ���������� ���������� ����� ��������)\n" +
                    "5. �������� ���������� ��������� � ���� (��������� ���� ����� �����������)\n" +
                    "6. ����� �� ���������.\n");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("\n������ ����� 1\n");
                    Raffle.printInfo(list);
                    System.out.println();
                    break;
                case "2":
                    System.out.println("\n������ ����� 2\n");
                    break;
                case "3":
                    System.out.println("\n������ ����� 3\n");
                    break;
                case "4":
                    System.out.println("\n��������� ��������� �������.\n");
                    winnerList = Raffle.getRaffle(list);
                    break;
                case "5":
                    System.out.println("\n������ ����� 5\n");
                    break;
                case "6":
                    System.out.println("\n����� �� ���������");
                    flag = false;
                    break;
                default:
                    System.out.println("\n��� ����� �� ���������, ��������� ������.\n");
            }
        }

    }

}
