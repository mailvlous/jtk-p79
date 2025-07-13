import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ===== List =====
        // ArrayList dengan Generics
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // LinkedList dengan Generics
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Fox");

        // Iterasi dengan for-each loop
        System.out.println("ArrayList contents:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("\nLinkedList contents:");
        // Iterasi dengan iterator
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal);
        }

        // ===== Set =====
        // HashSet memastikan elemen unik
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10); // Tidak akan ditambahkan karena duplikat

        System.out.println("\nHashSet contents:");
        for (Integer num : hashSet) {
            System.out.println(num);
        }

        // ===== Map =====
        // HashMap dengan Generics
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // TreeMap otomatis mengurutkan key
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Tiga");
        treeMap.put(1, "Satu");
        treeMap.put(2, "Dua");

        System.out.println("\nHashMap contents:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\nTreeMap contents (sorted):");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
