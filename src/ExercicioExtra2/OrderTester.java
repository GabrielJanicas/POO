package ExercicioExtra2;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderTester {

	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

	public static void main(String[] args) {
		OrderManager manager = new OrderManager();

		readOrdersFromFile(manager, "./src/ExercicioExtra2/pedidos.txt");

		Order order3 = manager.searchOrder(3);
		System.out.println("Pedido 3: " + order3);

		manager.printAllOrders();

		System.out.println("Custo do Pedido 3: " + manager.calculateOrderCost(3));

		int mes = 5;
		System.out.println("Custo do Mês 5: " + manager.calculateMonthCost(mes));

		printOrdersToFile(manager, "./src/ExercicioExtra2/pedidos2.txt");
	}

	public static void readOrdersFromFile(OrderManager manager, String filename) {
		Scanner sc;
		try {
			sc = new Scanner(new FileReader(filename, StandardCharsets.UTF_8));
		} catch (Exception e) {
			return;
		}
		
		sc.nextLine();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			line = line.strip();

			String[] parts = line.split(";");
			int clientId = Integer.parseInt(parts[0]);
			int storeId = Integer.parseInt(parts[1]);
			String itensString = parts[2];
			LocalDateTime dateTime = LocalDateTime.parse(parts[3], formatter);
			boolean isExpresso = parts[4] == "expresso";

			ArrayList<Item> itensList = new ArrayList<Item>();
			String[] itens = itensString.split("\\|");
			for (String item : itens) {
				String[] itemPart = item.split(":");
				itensList.add(new Item(itemPart[0], Double.parseDouble(itemPart[1])));
			}
			Order ord = new Order(itensList, Integer.toString(storeId), Integer.toString(clientId), dateTime, isExpresso);
			manager.addOrder(ord);
		}
	}

	public static void printOrdersToFile(OrderManager manager, String filename) {
		try (FileWriter fw = new FileWriter(filename)) {
            for (Order order : manager.getOrders()) {
                fw.write(order.getClientId() + ";");
                fw.write(order.getStoreId() + ";");
                for (Item item : order.getItens()) {
                    fw.write(item.toString());
					if (order.getItens().indexOf(item) != order.getItens().size() - 1) {
						fw.write("|");
					}
                }
                fw.write(";");
                fw.write(order.getOrderDateTime().format(formatter) + ";");
                fw.write(order.isExpresso() ? "expresso" : "normal");
                fw.write("\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
	}
	
}

