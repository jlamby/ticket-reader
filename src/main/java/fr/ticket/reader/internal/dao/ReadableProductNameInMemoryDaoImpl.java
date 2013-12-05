package fr.ticket.reader.internal.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.ticket.reader.dao.ReadableProductNameDao;
import fr.ticket.reader.model.ReadableProductName;

public class ReadableProductNameInMemoryDaoImpl extends AbstractInMemoryDao<ReadableProductName> implements
        ReadableProductNameDao {

	private static Logger logger = LoggerFactory.getLogger(ReadableProductNameInMemoryDaoImpl.class);

	private Map<Long, ReadableProductName> items = new HashMap<Long, ReadableProductName>();

	@Override
	public ReadableProductName read(Long id) {
		return items.get(id);
	}

	@Override
	public List<ReadableProductName> readAll() {
		return new ArrayList<ReadableProductName>(items.values());
	}

	@Override
	public ReadableProductName create(ReadableProductName readableProductName) {
		ReadableProductName newItem = new ReadableProductName();
		newItem.setId(newId());
		newItem.setName(readableProductName.getName());

		items.put(newItem.getId(), newItem);

		logger.debug("Creating new object : {}", newItem);

		return newItem;
	}

	@Override
	protected Map<Long, ReadableProductName> getItems() {
		return items;
	}



}
