package codecheck;

import javax.ws.rs.client.WebTarget;

public class App {
	public static void main(String[] args) {
//		for (int i = 0, l = args.length; i < l; i++) {
//			String output = String.format("argv[%s]: %s", i, args[i]);
//			System.out.println(output);

		WebTarget target = client.target("http://challenge-server.code-check.io/")
		 .queryParam("q", "hash");

			try {
			    String result = target.request().get(String.class);
			} catch (BadRequestException e) {
			    logger.error("response=" + e.getResponse().readEntity(String.class), e);
			    throw e;
			}
	}
}
