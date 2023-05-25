package ExercicioExtra2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
	private int id;
	private static int nextId = 1;
	private ArrayList<Item> itens;
	private String storeId;
	private String clientId;
	private LocalDateTime orderDateTime;
	private boolean expresso;

	public Order(ArrayList<Item> itens, String storeId, String clientId, LocalDateTime orderDateTime, boolean expresso) {
		this.id = nextId++;
		this.itens = itens;
		this.storeId = storeId;
		this.clientId = clientId;
		this.orderDateTime = orderDateTime;
		this.expresso = expresso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public boolean isExpresso() {
		return expresso;
	}

	public void setExpresso(boolean expresso) {
		this.expresso = expresso;
	}

	public double valorTotal() {
		double total = 0;
		for (Item item : this.itens) {
			total += item.getPrice();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Order id=" + id + ", itens=" + itens + ", storeId=" + storeId + ", clientId=" + clientId
				+ ", orderDateTime=" + orderDateTime + ", expresso=" + expresso + "";
	}
  
	public double getPrice() {
		return 0;
	}

}