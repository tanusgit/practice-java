static void matches(String s){
		//to split a string on . we need to put \\ because it
		//is an escape character
		String[] tokens = s.split("\\.");
		for (String t : tokens){
		  System.out.println(t);
		}
