import java.util.ArrayList;

public class Raffle {


    public static Toy raffle(ArrayList<Toy> list) {
        /*����� �������� �� ������ ������� � � ����������� �� ����� ���������� �������� �������,
        ���� �� ���� ������� �� ������, ���������� ��������� ������ ��� ������ ��������.
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
