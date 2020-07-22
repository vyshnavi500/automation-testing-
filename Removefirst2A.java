package com.qwerty.tester;

public class RemoveFirst2A {
	
	public String remove(String str) {
		
		String new_str = "";
		
		for(int i=0;i<str.length();i++) {
			if(i<2)
				if(str.charAt(i)!= 'A' )
					new_str+=str.charAt(i);
			if(i>=2)
				new_str+=str.charAt(i);
		}

		return new_str;
	}
	
}