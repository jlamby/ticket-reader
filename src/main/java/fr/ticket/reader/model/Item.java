package fr.ticket.reader.model;

import lombok.Getter;
import lombok.Setter;

public class Item {

	@Getter
	@Setter
	private Long id;

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private ItemType type;

	@Getter
	@Setter
	private float price;

	public Item() {
	}

}
