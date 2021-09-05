package com.learn.java.puzzles;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExample {
	public static void main(String[] args) {

		List<Product> productsList = addProducts();

		List<Float> priceGreaterThan3k = productsList.stream().filter(p -> p.price > 30000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(priceGreaterThan3k);

		// Start the number from 1 and it keeps on increasing but we only print which is
		// divisible by 2
		Stream.iterate(1, element -> element + 1).filter(element -> element % 2 == 0).limit(5)
				.forEach(System.out::println);

		// Print prodcut wit price more than 3000
		productsList.stream().filter(product -> product.price == 30000)
				.forEach(product -> System.out.println("Product with price greater than 3000: " + product.name));

		Float totalPrice = productsList.stream().map(product -> product.price).reduce(0.0f,
				(sum, price) -> sum + price); // accumulating price
		System.out.println(totalPrice);
		// More precise code
		float totalPriceInFLoat = productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum); // accumulating
		System.out.println(totalPriceInFLoat);

		// Using Collectors's method to sum the prices.
		double totalPriceInDouble = productsList.stream().collect(Collectors.summingDouble(product -> product.price));
		System.out.println(totalPriceInDouble);

		// max() method to get max Product price
		Product maxPriceProduct = productsList.stream()
				.max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
		System.out.println(maxPriceProduct.price);
		// min() method to get min Product price
		Product minPriceProduct = productsList.stream()
				.min((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
		System.out.println(minPriceProduct.price);

		// count number of products based on the price greater than 300
		long prodcutWithPriceGreaterThan3K = productsList.stream().filter(product -> product.price < 30000).count();
		System.out.println(prodcutWithPriceGreaterThan3K);

		Set<Float> productPriceSetLessThan3k = productsList.stream().filter(product -> product.price < 30000) // filter
																												// product
																												// on
																												// the
																												// base
																												// of
																												// price
				.map(Product::getPrice) // fetching price by referring getPrice method
				.collect(Collectors.toSet()); // collect it as Set(remove duplicate elements)
		System.out.println(productPriceSetLessThan3k);

		// Converting Product List into a Map
		Map<Integer, String> productPriceMap = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println(productPriceMap);

		/*
		 * we are creating a stream from generated elements. This will produce a stream
		 * of 20 random numbers. We have restricted the elements count using limit()
		 * function.
		 */
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(20).forEach(System.out::println);

		List<String> memberNames = getMemberNames();

		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

		// In the given example, we are reducing all the strings by concatenating them
		// using a separator #.
		Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2);
		reduced.ifPresent(System.out::println);

		/*
		 * //FlatMap Example
		 * 
		 * flatMap() is two step process i.e. map() + Flattening. It helps in converting
		 * Collection<Collection<T>> to Collection<T>.
		 * 
		 * We can use map() operation when we have a stream of objects, and we need to
		 * get some unique value for each element in the stream. There is one-to-one
		 * mapping between input and output element. For example, we can write a program
		 * to find the date of birth of all employees in a stream of employees.
		 * 
		 * In case of flatMap(), a one-to-many mapping is created where for each input
		 * element/stream, we first get a multiple values and then we flatten the values
		 * from all such input streams into a single output stream. For example, we may
		 * write program to find all district words from all lines in a text file.
		 */

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);

		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

		List<Integer> listOfAllIntegers = listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

		System.out.println(listOfAllIntegers);

	}

	private static List<String> getMemberNames() {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Ancil");
		memberNames.add("Vijay");
		memberNames.add("Aniket");
		memberNames.add("Abhishek");
		memberNames.add("Shivam");
		memberNames.add("Kuku");
		memberNames.add("1Sample");
		memberNames.add("Arpit");
		return memberNames;
	}

	private static List<Product> addProducts() {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		return productsList;
	}
}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

}