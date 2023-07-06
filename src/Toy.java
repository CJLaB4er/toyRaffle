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
        StringBuilder stringBuilder = new StringBuilder("Вам выпала игрушка - \"");
        stringBuilder.append(name.toString());
        stringBuilder.append("\" с шансом выпадения ");
        stringBuilder.append(this.chance.toString()).append("%");
        return stringBuilder.toString();
    }

    @Override
    public void changeChance(Integer chance) {
        this.chance = chance;
    }
    public int compareTo(Toy toy){
        return toy.chance - this.chance;
    }
}
