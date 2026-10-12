
package library;

import java.util.*;

public class LibraryWaitlist {

    public static void main(String[] args) {

        // 1. ArrayList - Book catalogue
        ArrayList<String> catalogue = new ArrayList<>();
        catalogue.add("Java Basics");
        catalogue.add("Python Programming");
        catalogue.add("Data Structures");
        catalogue.add("Java Basics");

        System.out.println("=== BOOK CATALOGUE ===");
        System.out.println(catalogue);

        // 2. LinkedHashSet - Remove duplicates, preserve insertion order
        LinkedHashSet<String> uniqueBooks =
                new LinkedHashSet<>(catalogue);

        System.out.println("\n=== UNIQUE BOOKS ===");
        System.out.println(uniqueBooks);

        // 3. ArrayDeque - Normal waitlist
        ArrayDeque<String> waitlist = new ArrayDeque<>();
        waitlist.offer("Arun");
        waitlist.offer("Bala");
        waitlist.offer("Chitra");

        System.out.println("\n=== NORMAL WAITLIST ===");
        System.out.println(waitlist);

        System.out.println("Next person: " + waitlist.poll());

        // 4. PriorityQueue - Faculty requests first
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(
            Comparator.comparingInt(
                request -> request.startsWith("Faculty:") ? 0 : 1
            )
        );

        priorityQueue.offer("Student: Arun");
        priorityQueue.offer("Faculty: Kumar");
        priorityQueue.offer("Student: Bala");
        priorityQueue.offer("Faculty: Priya");

        System.out.println("\n=== PRIORITY REQUESTS ===");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        // 5. Iterator.remove - Remove overdue entries
        ArrayList<String> borrowedBooks = new ArrayList<>();
        borrowedBooks.add("Java Basics");
        borrowedBooks.add("Overdue: Python");
        borrowedBooks.add("Data Structures");
        borrowedBooks.add("Overdue: SQL");

        Iterator<String> iterator = borrowedBooks.iterator();

        while (iterator.hasNext()) {
            String book = iterator.next();

            if (book.startsWith("Overdue:")) {
                iterator.remove();
            }
        }

        System.out.println("\n=== AFTER REMOVING OVERDUE ===");
        System.out.println(borrowedBooks);

        // 6. ArrayList vs LinkedList performance
        int size = 20000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.nanoTime();
        arrayList.add(0, -1);
        long arrayInsertTime = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.add(0, -1);
        long linkedInsertTime = System.nanoTime() - start;

        start = System.nanoTime();
        long arrayGetSum = 0;
        for (int i = 0; i < size; i++) {
            arrayGetSum += arrayList.get(i);
        }
        long arrayGetTime = System.nanoTime() - start;

        start = System.nanoTime();
        long linkedGetSum = 0;
        for (int i = 0; i < size; i++) {
            linkedGetSum += linkedList.get(i);
        }
        long linkedGetTime = System.nanoTime() - start;

        System.out.println("\n=== PERFORMANCE COMPARISON ===");
        System.out.println("ArrayList front insertion: "
                + arrayInsertTime + " ns");
        System.out.println("LinkedList front insertion: "
                + linkedInsertTime + " ns");
        System.out.println("ArrayList get(i) loop: "
                + arrayGetTime + " ns");
        System.out.println("LinkedList get(i) loop: "
                + linkedGetTime + " ns");

        // Use sums to ensure both access loops perform useful work
        System.out.println("ArrayList sum: " + arrayGetSum);
        System.out.println("LinkedList sum: " + linkedGetSum);
    }
}
