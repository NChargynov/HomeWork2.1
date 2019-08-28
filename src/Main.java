public class Main {

    public static void main(String[] args) {
        createObject("Jack");
        createObject("Peter");
        createObject("Logan");

    }

    public static String createObject(String className) {

        switch (className) {
            case "Jack":
                Jack jack = new Jack("Pirate");
                jack.print();
                break;
            case "Peter":
                Peter peter = new Peter(67.5);
                peter.print();
                break;
            case "Logan":
                Logan logan = new Logan("Wolwerine");
                logan.print();
                break;
        }
        return className;
    }

}
