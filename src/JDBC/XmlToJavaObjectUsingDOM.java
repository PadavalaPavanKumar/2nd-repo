package JDBC;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.kanerika.test.util.Array;

public class XmlToJavaObjectUsingDOM {
	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
				"root");
		String querry = "insert into studentdetailstable values(?,?,?)";
		DocumentBuilderFactory docBuilFac = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuil = docBuilFac.newDocumentBuilder();
		Document doc = docBuil.parse("XmlFile.xml");
		Element root = doc.getDocumentElement();
		NodeList nodeList = root.getElementsByTagName("EmployeeDetailsSubClass");

		for (int i = 0; i < nodeList.getLength(); i++) {
			int iii = 1;
			Node node = nodeList.item(i);
			EmployeeDetailsSubClass empde = new EmployeeDetailsSubClass();
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				// Node node = nodeList.item(i);
				Element element = (Element) node;
				// System.out.println(element);
				// System.out.println(element.getTagName());
				Class<?> classofclass = EmployeeDetailsSubClass.class;
				PreparedStatement ps = connection.prepareStatement(querry);
				for (Field field : classofclass.getDeclaredFields()) {

					field.setAccessible(true);
					//field.get(element.getTextContent());
					String value = field.getName();
					NodeList nodelist1 = element.getElementsByTagName(value);
					Node node1 = nodelist1.item(0);
					Element element1 = (Element) node1;
					Class<?> type = field.getType();
					if (type.equals(int.class)) {
						int ii = Integer.parseInt(element1.getTextContent());
						ps.setInt(iii, ii);
					} else {
						String ss = element1.getTextContent();
						ps.setString(iii, ss);
					}
					iii = iii + 1;
				}

				ps.executeUpdate();
				ps.close();

			}

		}
		connection.close();
	}
}
