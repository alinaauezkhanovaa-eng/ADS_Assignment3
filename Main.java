import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>(11);
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(random.nextInt(100000), "Name" + i);
            table.put(key, "Value" + i);
        }
        System.out.println("--- HashTable Distribution ---");
        table.printBucketSizes();

        System.out.println("\n--- BST Iteration Check ---");
        BST<Integer, String> tree = new BST<>();
        tree.put(50, "Root");
        tree.put(30, "Left");
        tree.put(70, "Right");
        tree.put(20, "Left-Left");
        tree.put(40, "Left-Right");

        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }
    }
}
