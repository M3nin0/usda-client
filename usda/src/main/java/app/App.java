package app;

import java.io.IOException;

import usda.Api;

public class App {
	public static void main(String[] args) {
		Api api = new Api("DEMO_KEY");
		
		try {
			System.out.println(api.SearchFood("butter"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
