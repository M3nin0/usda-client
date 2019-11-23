package usda;

import network.NetworkOperations;

/**
 * Builder to 
 *
 */
public class USDAClientBuilder {
	private String tokenApi;
	private NetworkOperations networkOperations;

	public USDAClientBuilder() {
	};

	public USDAClientBuilder addTokenAPI(String tokenAPI) {
		this.tokenApi = tokenAPI;
		return this;
	}

	public USDAClientBuilder addNetworkOperations(NetworkOperations networkOperations) {
		this.networkOperations = networkOperations;
		return this;
	}

	public USDAClient build() {
		return new USDAClient(tokenApi, networkOperations);
	}
}
