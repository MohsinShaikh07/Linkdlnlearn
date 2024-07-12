import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

  public static void main(String[] args) {
    // Create a HashSet to store unique numbers
    Set<Integer> numbers = new HashSet<>();

    // Add some numbers to the set
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(20); // Duplicates are ignored

    System.out.println("Unique numbers: " + numbers);

    // Check if a number exists
    if (numbers.contains(40)) {
      System.out.println("40 is in the set");
    } else {
      System.out.println("40 is not in the set");
    }

    // Get the size of the set (number of unique elements)
    int setSize = numbers.size();
    System.out.println("Number of unique elements: " + setSize);
  }
}