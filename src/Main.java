import java.awt.event.PaintEvent;

public class Main {

    public static void main(String[] args) {

    }

     public static Persons createObject(String namePersons) {

        switch (namePersons) {
            case "Jack":
                Persons jack = new Jack("Pirate");
                break;
            case "Peter":
                Persons peter = new Peter(67.5);
                break;
            case "Logan":
                Persons logan = new Logan("Wolwerine");
                break;
        }
        return Persons;
        Persons = namePersons;
    }

}
