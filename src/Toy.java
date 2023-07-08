import java.io.FileWriter;
import java.io.IOException;

public abstract class Toy implements ToyInterface {
    protected String name;
    protected Integer id, chance;

    public Toy(String name, Integer id, Integer chance) {
        this.name = name;
        this.id = id;
        this.chance = chance;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("¬ам выпала игрушка - \"");
        stringBuilder.append(name.toString());
        stringBuilder.append("\" с шансом выпадени€ ");
        stringBuilder.append(this.chance.toString()).append("%");
        return stringBuilder.toString();
    }

    @Override
    public void changeChance(Integer chance) {

        this.chance = chance;
        System.out.println("“еперь шанс выпадени€ у " + this.name + " равен " + this.chance + "%\n");
    }

    public int compareTo(Toy toy) {
        return toy.chance - this.chance;
    }

    @Override
    public void getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id=").append(id.toString()).append(", \"").append(name.toString()).append("\"");
        stringBuilder.append(", шанс выпадени€ - \"").append(chance.toString()).append("%\"");
        System.out.println(stringBuilder);
    }

    @Override
    public void writeToFile(String filename) {
        try {
            FileWriter file = new FileWriter(filename, true);
            file.write(this.toString());
            file.write("\n");
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
