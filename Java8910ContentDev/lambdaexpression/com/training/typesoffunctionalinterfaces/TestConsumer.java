package com.training.typesoffunctionalinterfaces;

import java.util.function.Consumer;

public class TestConsumer {
	public static void main(String[] args) {
		Consumer<String> c1 = (temp) -> {
			System.out.println(temp + " Hello Consumer");
		};
		c1.accept("Kafka");

		Consumer<String> c2 = (x) -> {
			System.out.println(x + " Second Queue");
		};
		Consumer<String> c3 = (x) -> {
			System.out.println(x + " Third Queue");
		};

		c1.andThen(c2).andThen(c3).accept("Rabbit MQ");
	}
}
