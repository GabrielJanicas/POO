package aula11.Ex2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;


public class Gradebook{

	private Map<String, Student> students = new HashMap<String,Student>();

	public void load (String filesname){
		try{
			Scanner input = new Scanner(new FileReader(filesname));
			while (input.hasNextLine()) {

				String line = input.nextLine();
				String[] parts = line.split("|");
				String name = parts[0];
				
				List<Double> grades = new ArrayList<Double>();
				for (int i = 1; i < parts.length; i++) {
					grades.add(Double.parseDouble(parts[i]));
				}

				Student student = new Student(name, grades);
				students.put(name, student);

			}
		}catch(IOException e){
			System.out.println("Erro ao ler o ficheiro");
		}
	}

		public void addStudent(Student student){
			students.put(student.getName(), student);
		}

		public void removeStudent(String name){
			students.remove(name);
		}

		public Student getStudent(String name){
			return students.get(name);
		}

		public double calculateAverageGrade(String name){
			Student student = students.get(name);
			double sum = 0;
			for (double grade : student.getGrades()) {
				sum += grade;
			}
			double average = sum / student.getGrades().size();
			return average;
		}

		public void printAllStudents(){
			for (Student student : students.values()) {
				System.out.println(student.getName());
			}
		}

}
