package com.gc.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gc.dao.CustomerDaoImp;
import com.gc.dao.DogsDaoImp;
import com.gc.dao.ReservationDoaImp;
import com.gc.model.Customers;
import com.gc.model.Dogs;
import com.gc.model.Reservation;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;

/**
 * 
 * @author: Abduljabbar Shaamala
 *
 */

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "index" })
	public ModelAndView homePage() {


		String message = "<br><div style='text-align:center;'>" + "<h3>Beekel Farms Kennel</h3>";
		return new ModelAndView("index", "message", message);
	}

	@RequestMapping("/sendEmail")
	public ModelAndView sendEmail(@RequestParam("email") String email, @RequestParam("fName") String fName) {

		MailjetRequest email1;
		MailjetResponse response = null;

		// Note how we set the version to v3.1 using ClientOptions
		// MailjetClient client = new
		// MailjetClient(System.getenv("737eb42ade92225b46e471d3d091fa80"),
		// System.getenv("3ffa02400a98cb6aeaf190ede5f50b5e"), new
		// ClientOptions("v3.1"));
		MailjetClient client = new MailjetClient(System.getProperty("PublicKey"), System.getProperty("PrivateKey"),
				new ClientOptions("v3.1"));

		JSONObject message = new JSONObject();
		message.put(Emailv31.Message.FROM,
				new JSONObject().put(Emailv31.Message.EMAIL, "malarbw@umich.edu").put(Emailv31.Message.NAME,
						"Administrator"))
				.put(Emailv31.Message.SUBJECT, "RESERVATION CONFRIMATION")
				.put(Emailv31.Message.TEXTPART, "Dear " + fName + ", thanks for reserving with our kennel.")
				//.put(Emailv31.Message.HTMLPART,
					//	"<h3>Dear passenger, welcome to Mailjet</h3><br/>May the delivery force be with you!")
				.put(Emailv31.Message.TO, new JSONArray()
						.put(new JSONObject().put(Emailv31.Message.EMAIL, email)));

		email1 = new MailjetRequest(Emailv31.resource).property(Emailv31.MESSAGES, (new JSONArray()).put(message));

		try {
			response = client.post(email1);
		} catch (MailjetException | MailjetSocketTimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ModelAndView("sendEmail", "response", response.getStatus());
	}

	

	@RequestMapping("/pricing")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>This is the pricing page.java</h3>";

		return new ModelAndView("pricing", "message", message);
	}

	@RequestMapping("/customerProfile")
	public ModelAndView addCustomer() {


		String message = "<br><div style='text-align:center;'>" + "<h3>Beekel Farms Kennel</h3>";

		

		return new ModelAndView("customerProfile", "message", message);
	}

	@RequestMapping("/reserve")
	public ModelAndView reservation() {


		String message = "<br><div style='text-align:center;'>" + "<h3>Beekel Farms Kennel</h3>";
		return new ModelAndView("reserve", "message", message);
	}

	

	
	// Add dog 
		/*@RequestMapping(value="adddog")
		public ModelAndView adddog(@RequestParam("dogName")String dogName, @RequestParam("breed")String breed,@RequestParam("size")String size,
				@RequestParam("food")String food) {
			
				Dogs dog = new Dogs();
				dog.setDogName(dogName);
				dog.setBreed(breed);
				dog.setSize(size);
				dog.setFood(food);
							  				
			DogsDaoImp test = new DogsDaoImp();
			test.addDogs(dog);
			
			String msg = "Add customer successful";
			
			return new ModelAndView("index","MSG",msg);
		}*/
	

		@RequestMapping(value="addCustomer")
		public ModelAndView addCustomer(@RequestParam("fName")String fName,@RequestParam("lName")String lName,@RequestParam("street")String street,
				@RequestParam("city")String city,@RequestParam("state")String state,@RequestParam("zip")String zip,@RequestParam("email")String email,@RequestParam("homeTel")String homeTel,
				@RequestParam("emrgTel")String emrgTel,@RequestParam("vetName")String vetName, @RequestParam("vetTel")String vetTel,
				@RequestParam("dropOff")String dropOff,@RequestParam("pickUp")String pickUp) {
			
			
			Customers customer = new Customers();
		    customer.setfName(fName);
			customer.setlName(lName);
			customer.setStreet(street);
			customer.setCity(city);
			customer.setState(state);
			customer.setZip(zip);
			customer.setEmail(email);
			customer.setHomeTel(homeTel);
			customer.setEmrgTel(emrgTel);
			customer.setVetName(vetName);
			customer.setVetTel(vetTel);
			
			Reservation reserv = new Reservation();
				reserv.setDropOff(dropOff);
				reserv.setPickUp(pickUp);
				reserv.setCustomer(customer);
				
				CustomerDaoImp test = new CustomerDaoImp();
				test.addCustomers(customer);
			ReservationDoaImp test1 = new ReservationDoaImp();
			test1.addReservation(reserv);
			
				
				String msg = "Profile created.";
				
				
				return new ModelAndView("index","MSG",msg);
				
		}		
		

}

