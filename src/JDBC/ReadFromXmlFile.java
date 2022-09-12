package JDBC;

import java.io.File;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadFromXmlFile {
	public static void main(String[] args) throws Exception {
		Map <String,String> mapvalues=new HashMap();
		File file = new File("ReadFromFile.xml");
		DocumentBuilderFactory docbuilderfac = DocumentBuilderFactory.newInstance();
		DocumentBuilder docbuilder = docbuilderfac.newDocumentBuilder();
		Document doc = docbuilder.parse(file);
		NodeList nl = doc.getElementsByTagName("employeeDetails");
		System.out.println(nl.getLength());
		for (int i = 0; i < nl.getLength(); i++) {
			ArrayList al = new ArrayList();
			Node p = nl.item(i);
			if (p.getNodeType() == Node.ELEMENT_NODE) {
				Element e = (Element) p;
				NodeList childNodes = p.getChildNodes();
				//System.out.println(childNodes.getLength());
				for (int j = 0; j < childNodes.getLength(); j++) {
					String k=String.valueOf(j);
					Node values = childNodes.item(j);
					// System.out.println(values);
					if (values.getNodeType() == Node.ELEMENT_NODE) {
						Element name1 = (Element) values;
              mapvalues.put(name1.getTagName(),name1.getTextContent());
//						String a = name1.getTagName();
//						System.out.println(a);
						

						// ps.setString(j++,name1.getTextContent());

					}

					// ps.executeUpdate();
				}
				///System.out.println(mapvalues);
				int i1=0;
				EmployeeDetailsClass edc = new EmployeeDetailsClass();
				  Class<?> classOfClass=edc.getClass();
				   for(Field fields:classOfClass.getDeclaredFields()) {
				     fields.setAccessible(true);
				    // Class<?> type=fields.getType();
				     
				    fields.set(edc,mapvalues.get(i1));
				     i1++;
				   }
              
			}

		}

//	 ps.close();
//	 con.close();
	}
	
	
	   }
	   

