package requests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONObject;

public class Requests implements NetworkOperations {
	private final String userAgent = "Mozilla/50.0";

	@Override
	public JSONObject sendGet(String url) throws IOException {

		URL urlObj = new URL(url);
		HttpsURLConnection conn = (HttpsURLConnection) urlObj.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("User-Agent", userAgent);
		int responseCode = conn.getResponseCode();

		if (responseCode == HttpsURLConnection.HTTP_OK) {
			BufferedReader input = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = input.readLine()) != null) {
				response.append(inputLine);
			}

			input.close();

			return new JSONObject(response.toString());
		}
		return null;
	}

	@Override
	public void sendPost(String url, List<String> params) {

	}
}
