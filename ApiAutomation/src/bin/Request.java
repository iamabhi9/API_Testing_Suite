package bin;

import java.util.List;

public class Request {
	
	public Request(   List<String> xlData) {
		super();
		System.out.println(xlData);
		this.url = xlData.get(0);
		this.apiName = xlData.get(1);
		this.method = xlData.get(2);
		this.payload = xlData.get(3);
	}

	String url;
	String apiName;
	String method;
	String payload;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

}
