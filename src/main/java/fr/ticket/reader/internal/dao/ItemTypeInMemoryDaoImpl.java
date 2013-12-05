package fr.ticket.reader.internal.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.ticket.reader.dao.ItemTypeDao;
import fr.ticket.reader.model.ItemType;

public class ItemTypeInMemoryDaoImpl extends AbstractInMemoryDao<ItemType> implements ItemTypeDao {

	private static Logger logger = LoggerFactory.getLogger(ItemTypeInMemoryDaoImpl.class);

	private Map<Long, ItemType> items = new HashMap<Long, ItemType>();

	@Override
	public ItemType read(Long id) {
		return items.get(id);
	}

	@Override
	public List<ItemType> readAll() {
		return new ArrayList<ItemType>(items.values());
	}

	@Override
	public ItemType create(ItemType itemType) {
		ItemType newItemType = new ItemType();
		newItemType.setId(newId());
		newItemType.setName(itemType.getName());

		items.put(newItemType.getId(), newItemType);

		logger.debug("Creating new object : {}", newItemType);

		return newItemType;
	}

	@Override
	protected Map<Long, ItemType> getItems() {
		return items;
	}



}
