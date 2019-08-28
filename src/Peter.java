public class Peter extends Persons implements Printable {
    double weight;

    public Peter(double weight) {
        this.weight = weight;
    }

    @Override
    public void print() {
        name = "Peter ";
        age = 18;
        weight = 67.5;
        height = 175.5;
        System.out.println(name + " " + age + " " + weight + " " + height);
    }
}
