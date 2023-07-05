public abstract class Toy {
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
        stringBuilder.append(" ").append((String) name);
        stringBuilder.append(" шанс выпадениия = ").append(this.chance.toString());
        return stringBuilder.toString();
    }

}
