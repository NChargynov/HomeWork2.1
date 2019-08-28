public class Jack extends Persons implements Printable{
    String nation;

    public Jack(String nation) {
        this.nation = nation;
    }

    @Override
    public void print() {
        nation = "Pirate ";
        age = 45;
        name = "Jack ";
        height = 180.5;
        System.out.println(name + " " + age + " " + " " + nation + " " + height);

    }
}
