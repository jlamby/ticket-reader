package fr.ticket.reader.services;

import java.util.List;

import fr.ticket.reader.model.ItemType;

public interface ItemTypeService {

	public ItemType getItemType(Long id);

	public List<ItemType> getItemTypes();

	public ItemType add(ItemType itemType);

}
