package Conditions;

public class Condition2 {

	public static void main(String[] args) {
		Condition2 m = new Condition2();
		// m.validation2(4, 19, "u");
		m.validation(1, 15, "u");
		//m.compare3(id, age, agent);
	}

	public void validation(int id, int age, String agent) {
		// approach1 using nested condition
		if (id < 0) {
			System.out.println("Id should be positive");
		} else {
			if (age < 18) {
				System.out.println("Age should be more than 18");
			} else {
				if (agent.equals("agent")) {
					System.out.println("valid data");
				} else
					System.out.println("Invalid usertype");

			}

		}
	}

	public void validation2(int id, int age, String agent) {
		// approach2 using nested condition
		// we use else if if we have dependency on first condition
		if (id < 0) {
			System.out.println("Id should be positive");
		} else if (age < 18) {
			System.out.println("Age should be more than 18");
		} else if (agent.equals("agent")) {
			System.out.println("valid data");
		} else
			System.out.println("Invalid usertype");

	}

	public void bankService1(String bank) {
		// using approach1
		switch (bank) {
		case "ICICI":
			System.out.println("ROI is 10%");
			break;
		case "SBI":
			System.out.println("ROI is 11%");
			break;
		case "CITI":
			System.out.println("ROI is 12%");
			break;
		case "HDFC":
			System.out.println("ROI is 13%");
		default:
			System.out.println("Invalid bank");
		}
	}

	public void bankService(String bank) {
		// approach2
		// if icici gets executed others would not be
		if (bank.equals("ICICI")) {
			System.out.println("ROI is 10%");
		} else if (bank.equals("SBI")) {
			System.out.println("ROI is 11%");
		} else if (bank.equals("CITI")) {
			System.out.println("ROI is 12%");
		} else if (bank.equals("HDFC")) {
			System.out.println("ROI is 13%");
		} else
			System.out.println("Invalid bank");
	}

	// take username password as input if username and password is admin print login
	// success
	// or print login failure
	public void admin(String username, String password) {
		if (username.equals("admin") && password.equals("admin")) {
			System.out.println("login success");
		} else
			System.out.println("login failure");
	}

	public void admin1(String username, String password) {
		// approach2
		if (!username.equals("admin") || !password.equals("admin")) {
			System.out.println("login failure");
		} else {
			System.out.println("login success");
		}
	}

	public void compare3(int id, int age, String Usertype) {
		if (id < 0 || age < 18 || !Usertype.equals("agent")) {
			System.out.println("Invalid data");
		} else
			System.out.println("valid data)");
	}

	public void compare(int id, int age, String Usertype) {
		// approach2
		if (id > 0 && age > 18 && Usertype.equals("agent")) {
			System.out.println("valid data");
		} else {
			System.out.println("invalid data");
		}
	}

	public void compare4(int id, int age, String Usertype) {
		if (id > 0 && age > 18 && Usertype.equals("admin")) {
			System.out.println("valid data");
		} else {
			System.out.println("invalid data");
		}
		if (id > 0) {
			if (age > 18) {
				if (Usertype.equals("admin")) {
					System.out.println("valid data");
				} else {
					System.out.println("invalid data");
				}
			} else {
				System.out.println("invalid data");
			}
		} else {
			System.out.println("invalid data");
		}
	}
	
	public void compare5(int id, int age, String Usertype) {
		// approach2
		if (!(id > 0 && age > 18 && Usertype.equals("agent"))) {
			System.out.println("invalid data");
		} else {
			System.out.println("valid data");
		}
	}
	
	
}
