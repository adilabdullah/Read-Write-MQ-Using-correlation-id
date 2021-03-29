/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbreadwritemq;

import com.java.model.Accounts;
import static dbreadwritemq.DbConnection.rs;
import java.io.File;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.json.simple.JSONObject;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author pc
 */
public class CreateXML {
    
    public static String CreateXML(String s1,
            String s2,
            String s3,
            String s4,
            String s5,
            String s6,
            String s7,
            String s8,
            String s9,
            String s10,
            String s11)
    {
        try {
 
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
 
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
 
            Document document = documentBuilder.newDocument();
 
            // root element
            Element root = document.createElement("Customer");
            document.appendChild(root);
             
            // employee element
            Element employee = document.createElement("Accounts");
 
            root.appendChild(employee);
 
            // set an attribute to staff element
          
            Attr attr = document.createAttribute("id");
            attr.setValue("1");
            employee.setAttributeNode(attr);
 
            //you can also use staff.setAttribute("id", "1") for this
 
            // firstname element
            Element sno = document.createElement("sno");
            sno.appendChild(document.createTextNode(s1));
            employee.appendChild(sno);
 
            // lastname element
            Element account_no = document.createElement("account_no");
            account_no.appendChild(document.createTextNode(s2));
            employee.appendChild(account_no);
 
            // email element
            Element account_title = document.createElement("account_title");
            account_title.appendChild(document.createTextNode(s3));
            employee.appendChild(account_title);
 
            // department elements
            Element min_limit = document.createElement("min_limit");
            min_limit.appendChild(document.createTextNode(s4));
            employee.appendChild(min_limit);
            // department elements
            Element max_limit = document.createElement("max_limit");
            max_limit.appendChild(document.createTextNode(s5));
            employee.appendChild(max_limit);
            // department elements
            Element tran_limit = document.createElement("tran_limit");
            tran_limit.appendChild(document.createTextNode(s6));
            employee.appendChild(tran_limit);
// department elements
            Element balance = document.createElement("balance");
            balance.appendChild(document.createTextNode(s7));
            employee.appendChild(balance);
// department elements
            Element account_type = document.createElement("account_type");
            account_type.appendChild(document.createTextNode(s8));
            employee.appendChild(account_type);
            // department elements
            Element status = document.createElement("status");
            status.appendChild(document.createTextNode(s9));
            employee.appendChild(status);
                 // department elements
            Element max_tran_limit = document.createElement("max_tran_limit");
            max_tran_limit.appendChild(document.createTextNode(s10));
            employee.appendChild(max_tran_limit);
                 // department elements
            Element opening_date = document.createElement("opening_date");
            opening_date.appendChild(document.createTextNode(s11));
            employee.appendChild(opening_date);
            // create the xml file
            //transform the DOM Object to an XML File
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
         
            //  StreamResult streamResult = new StreamResult(new File(xmlFilePath));
 
            // If you use
            // StreamResult result = new StreamResult(System.out);
            // the output will be pushed to the standard output ...
            // You can use that for debugging 
 
      //      transformer.transform(domSource, streamResult);
 StringWriter writer = new StringWriter();
StreamResult result = new StreamResult(writer);
TransformerFactory tf = TransformerFactory.newInstance();
//Transformer transformer = tf.newTransformer();
transformer.transform(domSource, result);
return writer.toString();
    }
         catch (ParserConfigurationException pce) {
            pce.printStackTrace();
            return pce.getMessage();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
            return tfe.getMessage();
        }
    }
    
    
    
       public static String CreateJSON(String s1,
            String s2,
            String s3,
            String s4,
            String s5,
            String s6,
            String s7,
            String s8,
            String s9,
            String s10,
            String s11)
       {
            JSONObject cus = new JSONObject();
            JSONObject acc = new JSONObject();
            JSONObject accd = new JSONObject();
          Accounts accs=new Accounts(Integer.parseInt(s1),s2,s3,Double.parseDouble(s4),Double.parseDouble(s5),
        Integer.parseInt(s6),Double.parseDouble(s7),s8,s9,Double.parseDouble(s10),s11);
cus.put("Customer",acc);
acc.put("Accounts",accd);
accd.put("sno",accs.getSno());
accd.put("account_no",accs.getAccount_no());
accd.put("account_title",accs.getAccount_title());
accd.put("min_limit",accs.getMin_limit());
accd.put("max_limit",accs.getMax_limit());
accd.put("tran_limit",accs.getTran_limit());
accd.put("balance",accs.getBalance());
accd.put("account_type",accs.getAccout_type());
accd.put("status",accs.getStatuss());
accd.put("max_tran_limit",accs.getMax_tran_limit());
accd.put("opening_date",accs.getOpening_date());

return cus.toString();
       }
       
       
       
     public static void main(String argv[]) {
 
        try {
 
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
 
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
 
            Document document = documentBuilder.newDocument();
 
            // root element
            Element root = document.createElement("Customer");
            document.appendChild(root);

for(int i=1;i<=10;i++){              
            // employee element
            Element employee = document.createElement("Accounts");
 
            root.appendChild(employee);
 
            // set an attribute to staff element
          
            Attr attr = document.createAttribute("id");
            attr.setValue(String.valueOf(i));
            employee.setAttributeNode(attr);
 
            //you can also use staff.setAttribute("id", "1") for this
 
            // firstname element
            Element firstName = document.createElement("firstname");
            firstName.appendChild(document.createTextNode("James"));
            employee.appendChild(firstName);
 
            // lastname element
            Element lastname = document.createElement("lastname");
            lastname.appendChild(document.createTextNode("Harley"));
            employee.appendChild(lastname);
 
            // email element
            Element email = document.createElement("email");
            email.appendChild(document.createTextNode("james@example.org"));
            employee.appendChild(email);
 
            // department elements
            Element department = document.createElement("department");
            department.appendChild(document.createTextNode("Human Resources"));
            employee.appendChild(department);
}
            // create the xml file
            //transform the DOM Object to an XML File
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
         
            //  StreamResult streamResult = new StreamResult(new File(xmlFilePath));
 
            // If you use
            // StreamResult result = new StreamResult(System.out);
            // the output will be pushed to the standard output ...
            // You can use that for debugging 
 
      //      transformer.transform(domSource, streamResult);
 StringWriter writer = new StringWriter();
StreamResult result = new StreamResult(writer);
TransformerFactory tf = TransformerFactory.newInstance();
//Transformer transformer = tf.newTransformer();
transformer.transform(domSource, result);
System.out.println("XML IN String format is: \n" + writer.toString());

            System.out.println("Done creating XML File");
 
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
