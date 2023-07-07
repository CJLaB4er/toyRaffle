import java.util.ArrayList;
import java.util.List;

public class Raffle {

    static int countRaffle = 5;
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
        /*
        ����� ��� ��������� ���������� ��� ���� ��������
         */
        for (Toy toy : list) {
            toy.getInfo();
        }
    }
    public static ArrayList<Toy> getRaffle(ArrayList<Toy> list){
        /*
        ����� ��������� � ���������� ������ �������� �������, ��� ������ ������ raffle.
        ���������� �������� ������� �������� � ���� (�� ��������� 5)
         */
        List<Toy> winnerList = new ArrayList<>();
        for (int i = 0; i < countRaffle; i++) {
            winnerList.add(raffle(list));
        }
        return (ArrayList<Toy>) winnerList;
    }
}
