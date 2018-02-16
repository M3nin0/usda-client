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

	/**
	 * A search request sends keyword queries and returns lists of foods which
	 * contain one or more of the keywords in the food description, scientific name,
	 * or commerical name fields.
	 * 
	 * @param keyword
	 *            Search terms
	 * @param sort
	 *            Sort the results by food name (n) or by search relevance (r)
	 * @param max
	 *            maximum rows to return
	 * @param offset
	 *            beginning row in the result set to begin
	 * @param args
	 *            Represents all parameters
	 * @return String with query results in json format
	 * @throws IOException
	 */
	public JSONObject SearchFood(String... args) throws IOException {

		String keyword = "";
		String sort = "r";
		String max = "10";
		String offset = "0";

		if (args != null) {
			if (args.length == 1) {
				keyword = args[0];
			}

			else if (args.length == 2) {
				keyword = args[0];
				sort = args[1];
			}

			else if (args.length == 3) {
				keyword = args[0];
				sort = args[1];
				max = args[2];
			}

			else if (args.length == 4) {
				keyword = args[0];
				sort = args[1];
				max = args[2];
				offset = args[3];
			}

			return requests.sendGet(searchUrl + "q=" + keyword + "&sort=" + sort + "&max=" + max + "&offset=" + offset
					+ "&api_key=" + tokenApi);

		}

		return null;

	}

	/**
	 * A Food Report is a list of nutrients and their values in various portions for
	 * a specific food
	 * 
	 * @param ndbno
	 *            NDB no
	 * @param type
	 *            Report type: [b]asic or [f]ull or [s]tats
	 * @param args
	 *            Represents all parameters
	 * @return
	 * @throws IOException
	 */
	public JSONObject SearchFoodReport(String... args) throws IOException {

		String ndbno = "0";
		String type = "b";

		if (args != null) {
			if (args.length == 1) {
				ndbno = args[0];
			}

			else if (args.length == 2) {
				ndbno = args[0];
				type = args[1];
			}

			return requests.sendGet(foodReportUrl + ndbno + "&type=" + type + "&format=json&api_key=" + tokenApi);
		}

		return null;
	}

	public String getListOfFood(String... args) {
		return "";
	}
}
