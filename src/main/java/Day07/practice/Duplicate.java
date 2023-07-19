package Day07.practice;

import java.util.*;

public class Duplicate {
public static void main(String[] args) {
	 ArrayList<Integer> arrList = new ArrayList<>();
	 arrList.add(15);
	 arrList.add(21);
	 arrList.add(12);
	 arrList.add(14);
	 arrList.add(12);
	 arrList.add(15);
	 System.out.println("Elements of ArrayList are :");
     System.out.println(arrList);
     
     HashSet<Integer> arrSet = new HashSet<>(arrList);
     System.out.println("Elements of HashSet are :");
     System.out.println(arrSet);
}
}
