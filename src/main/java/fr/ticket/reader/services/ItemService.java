package fr.ticket.reader.services;

import java.util.List;

import fr.ticket.reader.model.Item;

public interface ItemService {

	public List<Item> getItems(String name);

}
