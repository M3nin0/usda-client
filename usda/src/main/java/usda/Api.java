package usda;

import java.io.IOException;

import org.json.JSONObject;

import requests.Requests;

public class Api implements Urls {

	private String tokenApi;
	private Requests requests;

	public Api(String tokenApi) {
		this.tokenApi = tokenApi;
		this.requests = new Requests();
	}

	public String SearchFood(String identification) throws IOException {

		JSONObject obj = requests
				.sendGet(searchUrl + "q=" + identification + "&sort=n&max=25&offset=0&api_key=" + tokenApi);

		return obj.toString();
	}

	public String SearchFood(String identification, String max, String offset, String sort) throws IOException {
		return "";
	}

	public String SearchFoodReport(String identification) {
		return "";
	}

	public String SearchFoodReport(String identification, boolean ndbno) {
		return "";
	}

	public String SearchFoodReport(String identification, boolean ndbno, String max, String offset, String sort) {
		return "";
	}

	public String getListOfFood() {
		return "";
	}

}
