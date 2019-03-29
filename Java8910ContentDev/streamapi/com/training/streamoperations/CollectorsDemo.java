package com.training.streamoperations;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * 
 * @author Naveen
 * @see Program to show working of collectors, with user defined object Product. 
 */

public class CollectorsDemo {
	public static void main(String[] args) {
		List<Product> list   = Arrays.asList(
				new Product("laptop", 33, new BigDecimal("65000.00")),
				new Product("laptop", 11, new BigDecimal("23000.67")), 
				new Product("marker", 133, new BigDecimal("12.50")), 
				new Product("marker", 21, new BigDecimal("19.99")), 
				new Product("tag", 30, new BigDecimal("3.67")),
				new Product("paper", 32, new BigDecimal("3.67")),
				new Product("paper", 32, new BigDecimal("3.67"))
			);
		
		
		///////////////////////////////////////////////////////////////////////////////////////////		
		// gives the product name and sum of items of each project name 
		Map<String, Integer> sum = list.stream().collect(
				Collectors.groupingBy(Product ::getName, Collectors.summingInt(Product::getQty))
				);
		
		System.out.println("sum based on product : \n " +sum);
		///////////////////////////////////////////////////////////////////////////////////////////
		
		
		System.out.println("--------------------------------------");
		///////////////////////////////////////////////////////////////////////////////////////////
		// Group the products based on the price 
		Map<BigDecimal, List<Product>> groupByPriceMap = 
				list.stream()
				.collect(Collectors.groupingBy(Product::getPrice)); 
				
		
		System.out.println("groupByPriceMap:\n" +groupByPriceMap);
		///////////////////////////////////////////////////////////////////////////////////////////
		
		// To be tried by Participants
//		Stream.of(groupByPriceMap.values()).
//		flatMap(x -> x.stream()).collect(Collectors.toList()).
//		forEach(System.out :: println);
		
		///////////////////////////////////////////////////////////////////////////////////////////		
		// override equals and hashCode method in product class to have values as unique 
		// Group the products based on the price 
		System.out.println("--------------------------------------");
		
		Map<BigDecimal, Set<Product>> groupByPriceMap1 = 
				list.stream()
				.collect(Collectors.groupingBy(Product::getPrice, Collectors.toSet()));
		System.out.println("groupByPriceMap1 (toSet) : \n" + groupByPriceMap1);

		///////////////////////////////////////////////////////////////////////////////////////////
		// group by price and for each price, collate the product name 
		System.out.println("--------------------------------------");
		
		Map<BigDecimal, Set<String>> groupByPriceMap2 = 
				list.stream()
				.collect(Collectors.groupingBy(Product::getPrice, Collectors.mapping(Product::getName,
						Collectors.toSet())));

		System.out.println("groupByPriceMap2 :\n"  +  groupByPriceMap2);


		System.out.println("--------------------------------------");

		///////////////////////////////////////////////////////////////////////////////////////////
		// to get the products quantiy as a set, for each priced product 
		Map<BigDecimal, Set<Integer>> groupByPriceMap3 = 
				list.stream()
				.collect(Collectors.groupingBy(Product::getPrice, Collectors.mapping(Product::getQty, Collectors.toSet())));

		System.out.println("groupByPriceMap3 :\n" + groupByPriceMap3);
	}
}