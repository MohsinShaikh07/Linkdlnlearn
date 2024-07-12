import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

//adding comments demo of files modified after commit.  
public class ArrayListDemo {

    public static void main(String[] args) {

        // Create an ArrayList of Strings
        ArrayList<String> classmates = new ArrayList<>();

        // Add elements to the ArrayList
        classmates.add("Sabiha");
        classmates.add("Annam");
        classmates.add("Mohsin");
        classmates.add("Sabiha");
        classmates.add("Annam");
        classmates.add("Sidra");
        System.out.println("classmates: " + classmates);

        Set<String> uniqueclassmates = new LinkedHashSet<>(classmates);
        classmates.clear();
        
        classmates.addAll(uniqueclassmates);
        
        System.out.println("List after removing duplicates: " + classmates);
    
    }
            }


