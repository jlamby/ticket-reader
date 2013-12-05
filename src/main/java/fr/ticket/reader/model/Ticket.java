package fr.ticket.reader.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.joda.time.DateTime;

public class Ticket {

	@Getter
	@Setter
	private Long id;

	@Getter
	@Setter
	private DateTime date;

	@Getter
	@Setter
	private List<Item> items;

	public Ticket() {
	}

}
