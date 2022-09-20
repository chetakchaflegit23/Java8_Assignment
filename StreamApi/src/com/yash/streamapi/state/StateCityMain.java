package com.yash.streamapi.state;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StateCityMain {
	
	public static void main(String[] args) {
		
		List<City> c=Arrays.asList(
				new City(1, "nagpur", new StateStream(101, "maharashtra"), 7.8f, 800000, 963),
				new City(2, "warora", new StateStream(101, "maharashtra"), 9.7f, 40000, 593),
				new City(3, "hydrabad", new StateStream(102, "telangana"), 3.6f, 20000, 730),
				new City(4, "karimnagar", new StateStream(102, "telangana"), 8f, 650000, 350),
				new City(5, "patna", new StateStream(103, "bihar"), 6f, 450000, 500),
				new City(6, "gaya", new StateStream(103, "bihar"), 8.6f, 600000, 300)
				);
		
		System.out.println("find city with less area and highest population");
		List<City> value=c.stream().sorted(Comparator.comparing(City::getPopulation).thenComparing(City::getArea_of_city).reversed()).limit(1).collect(Collectors.toList());
		System.out.println(value);
		
		System.out.println("find city with high population index and high city area");
		List<City> value1=c.stream().sorted(Comparator.comparing(City::getPollutionIndex).thenComparing(City::getArea_of_city).reversed()).limit(1).collect(Collectors.toList());
		System.out.println(value1);
		
		System.out.println("print city with less population index first");
		List<City> value2=c.stream().sorted(Comparator.comparing(City::getPollutionIndex)).collect(Collectors.toList());
		System.out.println(value2);
		
		System.out.println("print city with lowest population index and lowest area");
		List<City> value3=c.stream().sorted(Comparator.comparing(City::getPollutionIndex).thenComparing(City::getArea_of_city)).limit(1).collect(Collectors.toList());
		System.out.println(value3);
		
		System.out.println("count how many city in state");
		long count=c.stream().map(City::getCityname).count();
		System.out.println(count);
		
		System.out.println("total area of each state");
		long sum=c.stream().collect(Collectors.summingLong(City::getArea_of_city));
		System.out.println(sum);
		
	}
	}

