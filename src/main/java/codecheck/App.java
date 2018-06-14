package codecheck;

public class App {
	public static void main(String[] args) {
//		for (int i = 0, l = args.length; i < l; i++) {
//			String output = String.format("argv[%s]: %s", i, args[i]);
//			System.out.println(output);



		String apiUrl = "http://challenge-server.code-check.io/";

			URL connectUrl = new URL(apiUrl);
				HttpURLConnection con = (HttpURLConnection)connectUrl.openConnection();

				con.setRequestMethod("GET");
				con.setDoOutput(true);
				con.setInstanceFollowRedirects(true);


		}
	}
}
