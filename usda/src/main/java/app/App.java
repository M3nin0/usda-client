package app;

import java.io.IOException;

import network.MozillaNetworkClient;
import usda.USDAClient;
import usda.USDAClientBuilder;

public class App {
	public static void main(String[] args) throws IOException {
		USDAClient usdaClient = new USDAClientBuilder()
									.addTokenAPI("YOUR_TOKEN_HERE")
									.addNetworkOperations(new MozillaNetworkClient()).build();

		usdaClient.searchFood("Milk");
	}
}
