package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<String>();
		myList.add("ram");
		myList.add("Sham");
		myList.add("Diya");
		myList.add("Raju");
		myList.add("Bheem");
		System.out.println("Print All names:");

		for (String a : myList) {

			System.out.println(a);

		}
		System.out.println("3rd element: " + myList.get(3));
		System.out.println("do we have ram in our batch: " + myList.contains("ram"));
		System.out.println("size: " + myList.size());
		myList.remove(2);
		System.out.println("Print All names:");
		for (String a : myList) {

			System.out.println(a);

		}
	}

}
