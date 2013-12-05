package fr.ticket.reader.internal.services;

import java.util.List;

import fr.ticket.reader.dao.ItemTypeDao;
import fr.ticket.reader.internal.dao.ItemTypeInMemoryDaoImpl;
import fr.ticket.reader.model.ItemType;
import fr.ticket.reader.services.ItemTypeService;

public class ItemTypeServiceImpl implements ItemTypeService {

	private ItemTypeDao itemTypeDao = new ItemTypeInMemoryDaoImpl();

	@Override
	public ItemType getItemType(Long id) {
		return itemTypeDao.read(id);
	}

	@Override
	public List<ItemType> getItemTypes() {
		return itemTypeDao.readAll();
	}

	@Override
	public ItemType add(ItemType itemType) {
		return itemTypeDao.create(itemType);
	}
}
