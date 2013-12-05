package fr.ticket.reader.internal.dao;

import java.util.Map;
import java.util.Set;

import fr.ticket.reader.model.PrimaryKey;

public abstract class AbstractInMemoryDao<U extends PrimaryKey> {

	protected abstract Map<Long, U> getItems();

	protected Long newId() {
		Long start = retrieveHighestId();

		if (start == null) {
			start = 0L;
		} else {
			start += 1;
		}

		return start;
	}

	protected Long retrieveHighestId() {
		Set<Long> ids = getItems().keySet();

		Long highestId = -1L;

		for (Long id : ids) {
			if (id.compareTo(highestId) > 0) {
				highestId = id;
			}
		}

		return highestId;
	}

}
