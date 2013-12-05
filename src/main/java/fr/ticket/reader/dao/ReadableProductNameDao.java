package fr.ticket.reader.dao;

import java.util.List;

import fr.ticket.reader.model.ReadableProductName;

public interface ReadableProductNameDao {

	public ReadableProductName read(Long id);

	public List<ReadableProductName> readAll();

	public ReadableProductName create(ReadableProductName readableProductName);

}
