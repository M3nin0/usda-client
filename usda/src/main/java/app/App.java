package app;

import java.io.IOException;

import usda.Api;

public class App {
	public static void main(String[] args) {
		Api api = new Api("DEMO_KEY");
		try {
			System.out.println("Food Search");
			System.out.println(api.SearchFood("butter"));
			System.out.println("Food Search - Complete");
			System.out.println(api.SearchFood("45163330", "r", "15", "0"));
			System.out.println("Search food report - Basic");
			System.out.println(api.SearchFoodReport("01009", "b"));
			System.out.println("Search list");
			System.out.println(api.getListOfFood("d"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
