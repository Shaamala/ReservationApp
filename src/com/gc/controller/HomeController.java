package com.gc.controller;

import java.io.IOException;


import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.resource.Contact;
import com.mailjet.client.resource.Email;
import com.mailjet.client.resource.Emailv31;

//
/**
 * 
 * @author: Antonella Solomon
 *
 */

@Controller
public class HomeController {
	
	@RequestMapping(value= {"/", "index"})
	public ModelAndView homePage() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>This is homepage.java</h3>";
		return new ModelAndView("index", "message", message);
	}
	
	@RequestMapping("/confirmation")
	public ModelAndView sendEmail2() {
	
	MailjetRequest email;
	MailjetResponse response = null;

	// Note how we set the version to v3.1 using ClientOptions
	//MailjetClient client = new MailjetClient(System.getenv("737eb42ade92225b46e471d3d091fa80"), System.getenv("3ffa02400a98cb6aeaf190ede5f50b5e"), new ClientOptions("v3.1"));
	MailjetClient client = new MailjetClient(System.getProperty("PublicKey"), System.getProperty("PrivateKey"), new ClientOptions("v3.1"));

	JSONObject message = new JSONObject();
	message.put(Emailv31.Message.FROM, new JSONObject()
	  .put(Emailv31.Message.EMAIL, "malarbw@umich.edu")
	  .put(Emailv31.Message.NAME, "Administrator")
	)
	.put(Emailv31.Message.SUBJECT, "RESERVATION CONFRIMATION")
	.put(Emailv31.Message.TEXTPART, "Dear customer, thanks for reservi")
	.put(Emailv31.Message.HTMLPART, "<h3>Dear passenger, welcome to Mailjet</h3><br/>May the delivery force be with you!")
	.put(Emailv31.Message.TO, new JSONArray()
	.put(new JSONObject()
	.put(Emailv31.Message.EMAIL, "ashaamala@hawkmail.hfcc.edu")));

	email = new MailjetRequest(Emailv31.resource).property(Emailv31.MESSAGES, (new JSONArray()).put(message));

	try {
		response = client.post(email);
	} catch (MailjetException | MailjetSocketTimeoutException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return new ModelAndView("confirmation", "response", response.getStatus());
	}
	/*@RequestMapping("/confirmation")*/
	public ModelAndView sendEmail() throws MailjetException, MailjetSocketTimeoutException {
		MailjetClient client = new MailjetClient(System.getenv("737eb42ade92225b46e471d3d091fa80"), System.getenv("3ffa02400a98cb6aeaf190ede5f50b5e"));
		MailjetRequest email;
		JSONArray recipients;
		MailjetResponse response;
		
		System.out.print("hello");

		recipients = new JSONArray()
		                .put(new JSONObject().put(Contact.EMAIL, "malarbw@umich.edu"));
		
		System.out.println(recipients);

		email = new MailjetRequest(Email.resource)
		                    .property(Email.FROMNAME, "Administrator")
		                    .property(Email.FROMEMAIL, "ashaamala@hawkmail.hfcc.edu")
		                    .property(Email.SUBJECT, "Thank you!")
		                    .property(Email.TEXTPART, "Thank you for choosing to stay at our kennel.")
		                    .property(Email.RECIPIENTS, recipients)
		                    .property(Email.MJCUSTOMID, "JAVA-Email");

		response = client.post(email);
		
		return new ModelAndView("confirmation", "response", response);
		
	}

	@RequestMapping("/pricing")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>This is the pricing page.java</h3>";
		return new ModelAndView("pricing", "message", message);
	}
	
	@RequestMapping("/customerProfile")
	public ModelAndView addCustomer() {
		

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>This is the page to add a customer.java</h3>";
		return new ModelAndView("customerProfile", "message", message);
	}
	
	@RequestMapping("/reserve")
	public ModelAndView reservation() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>This is the reserve page.java</h3>";
		return new ModelAndView("reserve", "message", message);
	}
	
	
}
