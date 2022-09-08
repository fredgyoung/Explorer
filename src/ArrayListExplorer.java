
import java.util.ArrayList;

public class ArrayListExplorer {

    private static void printList(ArrayList<Integer> list) {
        list.forEach(item -> {
            System.out.print(item);
            System.out.print(" ");
        });
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * 100 + 1);
            list.add(rand);
        }

        printList(list);
    }
}
