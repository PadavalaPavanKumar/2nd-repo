package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlUsingDOM {
	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
				"root");
		String querry = "insert into employeeDetails values(?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(querry);
		DocumentBuilderFactory docBuilFac = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuil = docBuilFac.newDocumentBuilder();
		Document doc = docBuil.parse("ReadFromFile.xml");
		
		Element root = doc.getDocumentElement();
		NodeList nodeList = root.getElementsByTagName("employeeDetails");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);

			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;

				 
				String name = element.getElementsByTagName("name").item(0).getTextContent();
				String project = element.getElementsByTagName("project").item(0).getTextContent();
				String domain = element.getElementsByTagName("domain").item(0).getTextContent();
				String salary1 = element.getElementsByTagName("salary").item(0).getTextContent();
				String experience = element.getElementsByTagName("experience").item(0).getTextContent();

				int salary = Integer.parseInt(salary1);
			//	ps.setString(1, id);
				ps.setString(2, name);
				ps.setString(3, project);
				ps.setString(4, domain);
				ps.setInt(5, salary);
				ps.setString(6, experience);
				ps.executeUpdate();
 
			}
		}
		ps.close();
		connection.close();
	}

}
