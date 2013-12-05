package fr.ticket.reader.dao;

import java.util.List;

import fr.ticket.reader.model.ItemType;

public interface ItemTypeDao {

	public ItemType read(Long id);
	public List<ItemType> readAll();

	public ItemType create(ItemType itemType);

}
