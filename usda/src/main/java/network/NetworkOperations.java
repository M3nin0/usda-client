package network;

import java.io.IOException;

import org.json.JSONObject;

public interface NetworkOperations {
	JSONObject sendGet(String url) throws IOException;
}
