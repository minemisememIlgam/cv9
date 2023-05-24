import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Vytvoření a naplnění ArrayListu
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple");
        list.add("Grape");

        // Test metody indexOf pro nalezení prvku v ArrayListu
        String targetElement = "Apple";
        int index = list.indexOf(targetElement);

        System.out.println("Index prvku '" + targetElement + "': " + index);
    }
}