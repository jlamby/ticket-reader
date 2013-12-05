package fr.ticket.reader.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ItemType implements PrimaryKey {

	@Getter
	@Setter
	private Long id;

	@Getter
	@Setter
	private String name;

	public ItemType() {
	}


}
