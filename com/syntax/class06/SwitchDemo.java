package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

	    //rules: values in case MUTS be same datatype as a VARIABLE in switch
		//rules: we can't have duplicate cases
		
		
		String description;
		char gender= 'h';
		
		switch(gender) {
		
		case 'm':
		description="Male";
		break;
		case 'M':
		description="Male";
		break;
		case 'F':
		description="Female";
		break;
		case 'f':
		description="Female";
		break;
		default:
		description="Unknown";
			
		}
		
		System.out.println(gender + " means "+description);
		
		//limitation
		// we cant use logical operators
		//we cant use relational operators
		//limitation of data types
		// 1. cannot use boolean
		
		double d=1.98;
		
		switch(d) {
		
		}
		
		
		
		
		
		
		
	}

}
