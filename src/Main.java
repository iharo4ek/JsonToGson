import com.google.gson.Gson;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon Pirko on ${DATE}
 */
public class Main {
	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();

		FileReader fileReader = new FileReader("test2.json");
		List<String> lines = new ArrayList<String>();
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String s = bufferedReader.readLine();
		while (s != null) {
			lines.add(s);
			s = bufferedReader.readLine();
		}

		s = "";

		for (String str : lines) {
			s+=str;
		}

		List list = gson.fromJson(s, List.class);
		System.out.println(list);

//
	}
}
