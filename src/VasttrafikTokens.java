import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Base64;
import java.util.Scanner;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.javanet.*;
import com.google.api.client.json.jackson2.*;
import com.google.api.client.http.*; 


//import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
//import com.google.api.client.auth.oauth2.TokenResponse;
//import com.google.api.client.http.GenericUrl;
//import com.google.api.client.http.javanet.NetHttpTransport;
//import com.google.api.client.json.jackson2.JacksonFactory;

public class VasttrafikTokens {

	private final String userAgent = "Mozilla/5.0";
	
	public static void main(String[] args) throws IOException {
		
//		URL myURL = new URL("https://api.vasttrafik.se/token");
//		HttpURLConnection myURLConnection = (HttpURLConnection)myURL.openConnection();
//		String userCredentials = "sSIf0MwMXPU2fgxgetm5_zd7Mc4a:Ang2fYUT2o4Lb1gv3ez_TSxKMMoa";
//		String basicAuth = "Basic " + new String(Base64.getEncoder().encodeToString(userCredentials.getBytes()) + " grant_type=client_credentials&scope=test");
//		myURLConnection.setRequestProperty ("Authorization", basicAuth);
//		myURLConnection.setRequestMethod("POST");
//		myURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//		myURLConnection.setRequestProperty("Content-Length", "0");
//		myURLConnection.setRequestProperty("Content-Language", "en-US");
//		myURLConnection.setRequestProperty("grant_type", "client_credentials&scope=test");
//		myURLConnection.setUseCaches(false);
//		myURLConnection.setDoInput(true);
//		myURLConnection.setDoOutput(true);
//		
//		System.out.println(myURLConnection.getResponseMessage());
		
		
		String userCredentials = "sSIf0MwMXPU2fgxgetm5_zd7Mc4a:Ang2fYUT2o4Lb1gv3ez_TSxKMMoa";
		String basicAuth = "Basic " + new String(Base64.getEncoder().encodeToString(userCredentials.getBytes()) + " grant_type=client_credentials&scope=test");
		
		TokenResponse response =
			      new AuthorizationCodeTokenRequest(new NetHttpTransport(), new JacksonFactory(),
			          new GenericUrl("https://api.vasttrafik.se/token"), "here write your code")
			          .setRedirectUri("https://api.vasttrafik.se/token")
			          .set("Authorization",basicAuth)
			          .set("Content-type", "application/x-www-form-urlencoded")
			          .set("Content-length", "0")
			          .set("Content-Language", "en-US")
			          .execute();
		System.out.println("Access token: " + response.getAccessToken());
		
		
		
		
//		InputStream input = myURLConnection.getInputStream();
//		
//		Scanner scan = new Scanner(input);
//		while(scan.hasNext()) {
//			System.out.println(scan.next());
//		}
		
//		System.out.println(new String(Base64.getEncoder().encodeToString("josu9112:H3j5an123!".getBytes())));
//		System.out.println(new String(Base64.getDecoder().decode("sSIf0MwMXPU2fgxgetm5_zd7Mc4a".getBytes())));
	}
	
//	private void sendPost() throws IOException {
//		String url = "https://api.vasttrafik.se/token";
//		URL urlObj = null;
//		try {
//			urlObj = new URL(url);
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		HttpsURLConnection con = (HttpsURLConnection) urlObj.openConnection();
//		
//		con.setRequestMethod("POST");
//		con.setRequestProperty("User-Agent", userAgent);
//		con.setRequestProperty("Accept Language", "en-US,en;q=0.5");
//		
//		
//		
//		
//		
//	}
	

}
