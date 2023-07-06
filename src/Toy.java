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
        StringBuilder stringBuilder = new StringBuilder("id = ");
        stringBuilder.append(id.toString());
        stringBuilder.append(", игрушка = \"").append((String) name);
        stringBuilder.append("\", шанс выпадениия = ").append(this.chance.toString()).append("%");
        return stringBuilder.toString();
    }

    @Override
    public void changeChance(Integer chance) {
        this.chance = chance;
    }
    public int compareTo(Toy toy){
        return this.chance - toy.chance;
    }
}
