package codecheck;

public class App {
	public static void main(String[] args) {
		URL url = new URL("http://challenge-server.code-check.io/");
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestMethod("GET");
		http.connect();

		// サーバーからのレスポンスを標準出力へ出す
		BufferedReader reader = new BufferedReader(new InputStreamReader(http.getInputStream()));
		String xml = "", line = "";
		while((line = reader.readLine()) != null)
		xml += line;
		System.out.println(xml);
		reader.close();
}
