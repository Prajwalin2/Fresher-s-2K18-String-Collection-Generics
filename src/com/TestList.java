package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
	
	public static void main(String[] args) {
		List strList = new ArrayList();
		for (int i = 0; i < 10; i++) {
			strList.add(""+i);
		}
		/*for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}*/
		Iterator itr = strList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
