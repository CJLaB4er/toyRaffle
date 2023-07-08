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
            System.out.println("�������� ���� �� ������� ����:\n" +
                    "1. ������� ���������� �� ��������� ��������\n" +
                    "2. �������� ���� ��������� �������.\n" +
                    "3. ������ ���������� ���������� ������� (�� ��������� 5)\n" +
                    "4. �������� ��������� (���������� � ���������� ���������� ����� ��������)\n" +
                    "5. �������� ���������� ��������� � ���� (��������� ���� ����� �����������)\n" +
                    "6. ����� �� ���������.\n");


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
                    System.out.println("��������� ��������� �������.\n");
                    winnerList = Raffle.getRaffle(list);
                    break;
                case "5":
                    if (checkWinList((ArrayList<Toy>) winnerList)) {
                        System.out.println("\n������� �������� ��� �����\n");
                        String fileName = scanner.nextLine();
                        clearWriteFile(fileName);
                        for (Toy toy : winnerList) {
                            toy.writeToFile(fileName);
                        }
                        System.out.println("���������� ��������� �������� � ����: " + fileName + "\n");
                    } else {
                        System.out.println("����� ������� ����������� � ����, ���������� �������� ��������� �.4\n");
                    }


                    break;
                case "6":
                    System.out.println("\n����� �� ���������");
                    scanner.close();
                    flag = false;
                    break;
                default:
                    System.out.println("\n��� ����� �� ���������, ��������� ������.\n");
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
