package io.github.cr9c.day02.dom;

import static org.junit.Assert.*;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMTest {
	private File f = new File("D:/workspace/基础加强-base/src/com/_520it/day02/xml/contact.xml");
	private File f1 = new File("d:/contact.xml");
	@Test
	public void test7() throws Exception {
		Document doc = null;
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		if (f1.exists()) {
			doc = builder.parse(f1);
		} else {
			doc = builder.newDocument();
			Element root = doc.createElement("contacts");
			doc.appendChild(root);
		}
		Element root = doc.getDocumentElement();
		Element linkmanE1 = doc.createElement("linkman");
		Element nameE1 = doc.createElement("name");
		Element emailE1 = doc.createElement("email");
		Element addressE1 = doc.createElement("address");
		Element groupE1 = doc.createElement("group");
		linkmanE1.setAttribute("id", "10010");
		nameE1.setTextContent("baobao");
		emailE1.setTextContent("bb.@126.com");
		addressE1.setTextContent("didu");
		groupE1.setTextContent("yanyuan");
		linkmanE1.appendChild(nameE1);
		linkmanE1.appendChild(emailE1);
		linkmanE1.appendChild(addressE1);
		linkmanE1.appendChild(groupE1);
		root.appendChild(linkmanE1);
		Transformer trans = TransformerFactory.newInstance().newTransformer();
		trans.transform(new DOMSource(doc), new StreamResult(f1));
	}
	@Test
	public void test5() throws Exception {
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
		Element root = doc.getDocumentElement();
		Element linkmanE1 = (Element) root.getElementsByTagName("linkman").item(2);
		linkmanE1.setAttribute("id", "9527");
		linkmanE1.setAttribute("id", "8527");
		Transformer trans = TransformerFactory.newInstance().newTransformer();
		trans.transform(new DOMSource(doc), new StreamResult(f));
		String id = linkmanE1.getAttribute("id");
		System.out.println(id);
	}
	@Test
	public void test4() throws Exception {
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
		Element root = doc.getDocumentElement();
		Element linkmanE1 = doc.createElement("linkman");
		Element nameE1 = doc.createElement("name");
		Element emailE1 = doc.createElement("email");
		Element addressE1 = doc.createElement("address");
		Element groupE1 = doc.createElement("group");
		nameE1.setTextContent("宝宝");
		emailE1.setTextContent("bb@126.com");
		addressE1.setTextContent("帝都");
		groupE1.setTextContent("演员");
		linkmanE1.appendChild(nameE1);
		linkmanE1.appendChild(emailE1);
		linkmanE1.appendChild(addressE1);
		linkmanE1.appendChild(groupE1);
		root.appendChild(linkmanE1);
		Transformer trans = TransformerFactory.newInstance().newTransformer();
		trans.transform(new DOMSource(doc), new StreamResult(f));
	}
	@Test
	public void test3() throws Exception {
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
		Element root = doc.getDocumentElement();
		Element linkmanE1 = (Element) root.getElementsByTagName("linkman").item(0);
		Element emailE1 = (Element) linkmanE1.getElementsByTagName("email").item(0);
		emailE1.setTextContent("xy@163.com");
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer trans = factory.newTransformer();
		Source xmlSource = new DOMSource(doc);
		Result outputTarget = new StreamResult(f);
		trans.transform(xmlSource, outputTarget);
	}
	@Test
	public void test1() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(f);
		assertNotNull(doc);
		Element ele = doc.getElementById("a1");
		System.out.println(ele);
	}
	@Test
	public void test11() throws Exception {
		File f1 = new File("D:/workspace/基础加强-base/src/com/_520it/day02/xml/contact11.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(f1);
		assertNotNull(doc);
		Element ele = doc.getElementById("a1");
		System.out.println(ele+"...");
	}
	@Test
	public void test2() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(f);
		Element root = doc.getDocumentElement();
		NodeList list = root.getElementsByTagName("linkman");
		Element linkmanE1 = (Element) list.item(1);
		Element nameE1 = (Element) linkmanE1.getElementsByTagName("name").item(0);
		String name = nameE1.getTextContent();
		System.out.println(name);
		assertEquals("东方姑娘", name);
	}
}
