package aula11.Ex3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EnergyUsageReport {

	private Map<Integer, Customer> customers = new HashMap<Integer,Customer>();

	public void load (String filesname){
		try{
			Scanner input = new Scanner(new FileReader(filesname));
			while (input.hasNextLine()) {

				String line = input.nextLine();
				String[] parts = line.split("|");
				int ID = Integer.valueOf(parts[0]);
				
				List<Double> leituras = new ArrayList<Double>();
				for (int i = 1; i < parts.length; i++) {
					leituras.add(Double.parseDouble(parts[i]));
				}
				Customer customer = new Customer(ID, leituras);
				customers.put(ID, customer);

			}
		}catch(IOException e){
			System.out.println("Erro ao ler o ficheiro");
		}
	}

		public void addCustomer(Customer customer){
			customers.put(customer.getCustomerId(), customer);
		}

		public void removeCustomer(int ID){
			customers.remove(ID);
		}

		public Customer getCustomer(int ID){
			return customers.get(ID);
		}

		public double calculateTotalUsage(int ID){
			Customer customer = customers.get(ID);
			double sum = 0;
			for (double grade : customer.getMeterReadings()) {
				sum += grade;
			}
			double average = sum / customer.getMeterReadings().size();
			return average;
		}

		public  void generateReport(String filesname){
			try {
				File myObj = new File(filesname);
				if (myObj.createNewFile()) {
				  System.out.println("File created: " + myObj.getName());
				} else {
				  System.out.println("File already exists.");
				}
			  } catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			  }
		}
	
}
