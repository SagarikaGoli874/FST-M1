package activities;
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        //Adding objects to Array List at default index
        al.add("name1");
        al.add("name2");
        al.add("name3");
        al.add("name4");
        al.add("name5");
   
        for(int i=0;i<al.size()-1;i++)
        {
            System.out.println("The element at "+i+"th location is "+al.get(i));
        }
        
        System.out.println("3rd element is" + al.get(2));
        System.out.println("Is name1 exists " + al.contains("name1"));
        System.out.println("Size of ArrayList is " + al.size());
        
        al.remove("name5");
        
        System.out.println("New Size of ArrayList: " + al.size());
    }
}