package fr.ticket.reader.model;

import lombok.Getter;
import lombok.Setter;

public class ReadableProductName implements PrimaryKey {

	@Getter
	@Setter
	private Long id;

	@Getter
	@Setter
	private String name;

	public ReadableProductName() {
	}
}
