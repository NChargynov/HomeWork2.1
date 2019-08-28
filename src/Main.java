import java.awt.event.PaintEvent;

public class Main {

    public static void main(String[] args){

        createObject("Jack").print();
        createObject("Peter").print();
        createObject("Logan").print();
    }

     public static Printable createObject(String namePersons) {

        Printable printable = null;
        switch (namePersons) {
            case "Jack":
                printable = new Jack("Pirate");
                break;
            case "Peter":
                printable = new Peter(67.5);
                break;
            case "Logan":
                printable = new Logan("Wolwerine");
                break;
        }
        return printable;

    }
}
