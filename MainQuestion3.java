package com.practice.mtt1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/*3) Collect no’s frm list1 which is not present in list2
& Collect no’s frm list2 which is not present in list1w
and store it in output1[].
ex: input1={1,2,3,4}; input2={1,2,3,5}; output1={4,5};
*/


class Main3{
	
	ArrayList<Integer> subList(ArrayList<Integer> l1,ArrayList<Integer> l2)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(l1.stream().filter(i-> !l2.contains(i)).collect(Collectors.toList()));
		al.addAll(l2.stream().filter(i-> !l1.contains(i)).collect(Collectors.toList()));
		return al;
	}
	
}

public class MainQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<Integer>(List.of(1,2,3,4));
		ArrayList<Integer> l2 = new ArrayList<Integer>(List.of(1,2,3,5));
		Main3 m = new Main3();
		System.out.println(m.subList(l1, l2));
		
	}

}
