package Print;

public class List {
    public static void main(String[] args) {
        System.out.println("Shopping List");
        System.out.println("\t-Milk");
        System.out.println("\t\t>Semi-Skimmed");
        System.out.println("\t\t>Medium");
        Eggs();
        Bread();
    }
    public static void Eggs(){
        System.out.println("\t-Eggs");
        System.out.println("\t\t>Free-range");
    }
    public static void Bread() {
        System.out.println("\t-Bread");
    }
}
