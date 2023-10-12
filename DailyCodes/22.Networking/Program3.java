import java.awt.*;
import java.net.*;
import java.io.*;

class Demo{

	public static void main(String[] args)throws URISyntaxException,IOException {
		
		String url = "www.core2Web.in";

		URI obj = new URI(url);

		Desktop desk = Desktop.getDesktop();

		desk.browse(obj);
	}
}