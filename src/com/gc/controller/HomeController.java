package com.gc.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gc.dao.CustomerDaoImp;
import com.gc.dao.DogsDaoImp;
import com.gc.model.Customers;
import com.gc.model.Dogs;



import com.gc.util.HibernateUtil;
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
				// .put(Emailv31.Message.HTMLPART,
				// "<h3>Dear passenger, welcome to Mailjet</h3><br/>May the delivery force be
				// with you!")
				.put(Emailv31.Message.TO, new JSONArray().put(new JSONObject().put(Emailv31.Message.EMAIL, email)));

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

		String message = "<br><div style='text-align:center;'>" + "<h3>This is the pricing page.java</h3>";

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


	// Create Customer profile
	@RequestMapping(value = "addProfile")
	public ModelAndView addCustomer(@RequestParam("fName") String fName, @RequestParam("lName") String lName,
			@RequestParam("street") String street, @RequestParam("city") String city,
			@RequestParam("state") String state, @RequestParam("zip") String zip, @RequestParam("email") String email,
			@RequestParam("homeTel") String homeTel, @RequestParam("emrgTel") String emrgTel,
			@RequestParam("vetName") String vetName, @RequestParam("vetTel") String vetTel,
			@RequestParam("dropOff") String dropOff, @RequestParam("pickUp") String pickUp,
			@RequestParam("dogName") String dogName, @RequestParam("breed") String breed,
			@RequestParam("size") String size, @RequestParam("food") String food) {

		// add customer to database
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
		customer.setDogName(dogName);
		customer.setDropOff(dropOff);
		customer.setPickUp(pickUp);
		customer.setDogName(dogName);
		customer.setDropOff(dropOff);
		customer.setPickUp(pickUp);

		// add dog to database
		Dogs dog = new Dogs();
		dog.setDogName(dogName);
		dog.setBreed(breed);
		dog.setSize(size);
		dog.setFood(food);
		String customerFullName = fName + " " + lName;
		dog.setOwner(customerFullName);
		// call DAO implement
		CustomerDaoImp testC = new CustomerDaoImp();
		testC.addCustomers(customer);
		DogsDaoImp testD = new DogsDaoImp();
		testD.addDogs(dog);
		String msg = "Profile created.";

		return new ModelAndView("reserve", "MSG", msg);

	}

	// display customer list
	@RequestMapping("customerList")
	public ModelAndView CustomerList(Model model) {

		ArrayList<Customers> customerList = listAllCustomers();

		model.addAttribute("reserdetail", customerList);
		return new ModelAndView("customerList", "cList", customerList);
	}

	// method get customer list from database
	public ArrayList<Customers> listAllCustomers() throws HibernateException {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria crit = session.createCriteria(Customers.class);
		ArrayList<Customers> customerList = (ArrayList<Customers>) crit.list();
		tx.commit();
		session.close();
		return customerList;
	}

	// add customer manual
	@RequestMapping("addcustomer")
	public ModelAndView addCustomer(@RequestParam("fName") String fName, @RequestParam("lName") String lName,
			@RequestParam("street") String street, @RequestParam("city") String city,
			@RequestParam("state") String state, @RequestParam("zip") String zip, @RequestParam("email") String email,
			@RequestParam("homeTel") String homeTel, @RequestParam("emrgTel") String emrgTel,
			@RequestParam("vetName") String vetName, @RequestParam("vetTel") String vetTel,
			@RequestParam("dropOff") String dropOff, @RequestParam("pickUp") String pickUp,
			@RequestParam("dogName") String dogName) {

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
		customer.setDogName(dogName);
		customer.setDropOff(dropOff);
		customer.setPickUp(pickUp);

		CustomerDaoImp testC = new CustomerDaoImp();
		testC.addCustomers(customer);

		String msg = "<br><div style='text-align:center;'>" + "<h4>Customer added successfully</h4>";
		
		return new ModelAndView("customerList", "addCustomer", msg);

	}

	// delete customer
	@RequestMapping("delete")
	public ModelAndView deleteCustomer(@RequestParam("id") int id) {

		System.out.println(id);
		CustomerDaoImp testC = new CustomerDaoImp();
		testC.deleteCustomers(id);
		ArrayList<Customers> customerList = listAllCustomers();
		return new ModelAndView("customerList", "cList", customerList);
	}

	// not final
	// update customer data
	@RequestMapping("update")
	public ModelAndView updateCustomer(@RequestParam("customerID") int customerID, @RequestParam("fName") String fName,
			@RequestParam("lName") String lName, @RequestParam("street") String street,
			@RequestParam("city") String city, @RequestParam("state") String state, @RequestParam("zip") String zip,
			@RequestParam("email") String email, @RequestParam("homeTel") String homeTel,
			@RequestParam("emrgTel") String emrgTel, @RequestParam("vetName") String vetName,
			@RequestParam("vetTel") String vetTel, @RequestParam("dropOff") String dropOff,
			@RequestParam("pickUp") String pickUp, @RequestParam("dog") String dogName) {

		CustomerDaoImp testC = new CustomerDaoImp();
		testC.updateCustomers(customerID);

		Customers customer = new Customers();
		customer.setCustomerID(customerID);
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
		customer.setDogName(dogName);
		customer.setDropOff(dropOff);
		customer.setPickUp(pickUp);

		ArrayList<Customers> customerList = listAllCustomers();

		return new ModelAndView("customerList", "cList", customerList);
	}

	// display dog list from database
	@RequestMapping("dogList")
	public ModelAndView dogList(Model model) {
		ArrayList<Dogs> dogList = listAllDogs();
		return new ModelAndView("dogList", "dList", dogList);
	}
	//method list all dogs from database 
	public ArrayList<Dogs> listAllDogs() throws HibernateException {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Criteria crit = session.createCriteria(Dogs.class);

		ArrayList<Dogs> dogList = (ArrayList<Dogs>) crit.list();

		tx.commit();
		session.close();
		return dogList;
	}
	//add dog manual
	@RequestMapping(value = "adddog")
	public ModelAndView adddog(@RequestParam("dogName") String dogName, @RequestParam("breed") String breed,
			@RequestParam("size") String size, @RequestParam("food") String food, @RequestParam("owner") String owner) {

		Dogs dog = new Dogs();
		dog.setDogName(dogName);
		dog.setBreed(breed);
		dog.setSize(size);
		dog.setFood(food);
		dog.setOwner(owner);

		DogsDaoImp testD = new DogsDaoImp();
		testD.addDogs(dog);

		String msg = "<br><div style='text-align:center;'>" + "<h4>Dog added successfully</h4>";
		return new ModelAndView("dogList", "addDog", msg);

	}
	// search in customer list by drop off date
	@RequestMapping("searchbydate")
	public ModelAndView searchreserve(@RequestParam("dropOff") String date) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Criteria crit = session.createCriteria(Customers.class);
		crit.add(Restrictions.like("dropOff", "%" + date + "%"));
		ArrayList<Customers> customerList = (ArrayList<Customers>) crit.list();
		tx.commit();
		session.close();

		return new ModelAndView("customerList", "cList", customerList);
	}
	// search in dog list by dog name
	@RequestMapping("searchbydog")
	public ModelAndView searchdog(@RequestParam("dogName") String dogName) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Criteria crit = session.createCriteria(Customers.class);
		crit.add(Restrictions.like("dogName", "%" + dogName + "%"));
		ArrayList<Dogs> dogList = (ArrayList<Dogs>) crit.list();
		tx.commit();
		session.close();

		return new ModelAndView("dogList", "dList", dogList);
	}
	// display reservation list
	@RequestMapping("reservationList")
	public ModelAndView reservationList(Model model) {

		ArrayList<Customers> reserveList = listAllCustomers();

		model.addAttribute("reserdetail", reserveList);
		return new ModelAndView("reservlist", "RList", reserveList);
	}
	// search in reservation list by drop off date
	@RequestMapping("searchbyreserve")
	public ModelAndView searchDate(@RequestParam("dropOff") String dropOff) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Criteria crit = session.createCriteria(Customers.class);
		crit.add(Restrictions.like("dropOff", "%" + dropOff + "%"));
		ArrayList<Customers> reserveList = (ArrayList<Customers>) crit.list();
		tx.commit();
		session.close();

		return new ModelAndView("reservlist", "RList", reserveList);
	}

}
