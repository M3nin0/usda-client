package requests;

import java.io.IOException;
import java.util.List;

import org.json.JSONObject;

public interface NetworkOperations {
	JSONObject sendGet(String url) throws IOException;
	void sendPost(String url, List<String> params);
}
