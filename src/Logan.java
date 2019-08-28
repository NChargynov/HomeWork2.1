public class Logan extends Persons implements Printable{
    String profession;

    public Logan(String profession) {
        this.profession = profession;
    }

    @Override
    public void print() {
        name = "Logan ";
        age = 124;
        height = 185.5;
        profession = "Wolwerine ";
        System.out.println(name + " " + age + " " + height + " " + profession);

    }
}
