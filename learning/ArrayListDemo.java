import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
//Made this change from main bramch
//adding comments demo of files modified after commit.  
public class ArrayListDemoFromFeatureSchedule {

    //This line was added in main branch
    public static void main(String[] args) {

        // Create an ArrayList of Strings
        ArrayList<String> classmates = new ArrayList<>();

        int p,q,r
 
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


