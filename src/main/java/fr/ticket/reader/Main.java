package fr.ticket.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.ticket.reader.internal.services.ItemTypeServiceImpl;
import fr.ticket.reader.model.ItemType;
import fr.ticket.reader.services.ItemTypeService;


public class Main
{
	private static Logger logger = LoggerFactory.getLogger(Main.class);

	private static ItemTypeService itemTypeService = new ItemTypeServiceImpl();

	public static void main(final String[] args) throws Exception
	{
		ItemType dessert = new ItemType();
		dessert.setName("Dessert");

		ItemType legume = new ItemType();
		legume.setName("Legume");

		itemTypeService.add(dessert);
		itemTypeService.add(legume);

		logger.debug("{}", itemTypeService.getItemTypes());
		logger.debug("{}", itemTypeService.getItemType(1L));

	}

}
