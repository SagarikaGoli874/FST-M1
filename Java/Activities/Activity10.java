package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("S");
        hs.add("A");
        hs.add("G");
        hs.add("A");
        hs.add("R");
        hs.add("I");
        hs.add("K");
        hs.add("A");

        System.out.println("Size of HashSet is" + hs.size());
        System.out.println("Removing Y from HashSet: " + hs.remove("Y"));
        if(hs.remove("P")) {
        	System.out.println("P is removed ");
        } else {
        	System.out.println("P is not existing");
        }
        System.out.println("Checking if S is present: " + hs.contains("S"));
        System.out.println("Updated HashSet: " + hs);
    }
}
