package attendence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class Register {
	public static void main(String args[]) throws IOException {
		ArrayList<Student> AllStudent = new ArrayList<Student>();

		/*
		 * Student student1 = new Student("Ram", 5, 1); Student student2 = new
		 * Student("Ramu", 6, 2); Student student3 = new Student("Rami", 6, 3);
		 * Student student4 = new Student("Rabi", 5, 4); Student student5 = new
		 * Student("Rinu", 5, 5); Student student6 = new Student("Ratu", 6, 6);
		 * 
		 * AllStudent.add(student1); AllStudent.add(student2);
		 * AllStudent.add(student3); AllStudent.add(student4);
		 * AllStudent.add(student5); AllStudent.add(student6);
		 * student1.setPresent(2);
		 * 
		 * 
		 * try {
		 * 
		 * PrintWriter writer; writer = new PrintWriter("file.txt", "UTF-8");
		 * for(int i = 0; i < AllStudent.size(); i++){
		 * writer.println(AllStudent.get(i)); } writer.close(); } catch
		 * (FileNotFoundException e) {
		 * 
		 * } catch (UnsupportedEncodingException e) {
		 * 
		 * }
		 */
		File file = new File(
				"C:\\Users\\TD\\Desktop\\foothill-esl-249\\SJSU\\Java-project\\Attendecesheet\\file.txt"
						+ "");
		FileReader m = new FileReader(file);
		BufferedReader br = new BufferedReader(m);

		String st;
		while ((st = br.readLine()) != null) {
			// System.out.println(st);
			String[] split = st.split(",");
			Student student = new Student(split[0], split[1], split[2]);
			System.out.print(student);
			for (int i = 3; i < split.length; i++) {
				String res = split[i];
				if (res.equals("absent")) {
					// day starts from 0 but in the toString function day comes
					// in the third position in the string so to start day from
					// 0
					// we did i-3
					student.setAbsent(i - 3);
				} else if (res.equals("present")) {
					student.setPresent(i - 3);
				}
			}
		}

	}
}
