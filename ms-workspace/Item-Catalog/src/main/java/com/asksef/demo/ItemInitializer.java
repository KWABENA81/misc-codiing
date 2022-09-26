package com.asksef.demo;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.asksef.model.Item;
import com.asksef.repo.ItemRepository;

@Component
public class ItemInitializer implements CommandLineRunner {

	private final ItemRepository itemRepository;

	public ItemInitializer(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Lining", "PUMA", "BAD Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
				.forEach(item -> itemRepository.save(new Item(item)));
		itemRepository.findAll().forEach(System.out::println);
	}

}
