package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONObject;

public class MozillaNetworkClient implements NetworkOperations {
	public JSONObject sendGet(String url) throws IOException {

		URL urlObj = new URL(url);
		HttpsURLConnection conn = (HttpsURLConnection) urlObj.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("User-Agent", "Mozilla/50.0");
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

}
