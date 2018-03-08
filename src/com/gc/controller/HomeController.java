package com.gc.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gc.dao.CustomerDaoImp;
import com.gc.dao.CustomersDao;
import com.gc.dao.DogsDaoImp;
import com.gc.dao.ReservationDoaImp;
import com.gc.model.Customers;
import com.gc.model.Dogs;
import com.gc.model.Reservation;

/**
 * 
 * @author: Abduljabbar Shaamala
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
	

	
	// Add dog 
		@RequestMapping(value="adddog")
		public ModelAndView adddog(@RequestParam("dogName")String dogName,@RequestParam("breed")String breed,@RequestParam("size")String size,
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
		}
	

		@RequestMapping(value="addCustomer")
		public ModelAndView addCustomersandReservation(@RequestParam("fName")String fName,@RequestParam("lName")String lName,@RequestParam("street")String street,
				@RequestParam("city")String city,@RequestParam("state")String state,@RequestParam("zip")String zip,@RequestParam("email")String email,@RequestParam("homeTel")String homeTel,
				@RequestParam("emrgTel")String emrgTel,@RequestParam("vetName")String vetName,@RequestParam("vetTel")String vetTel,
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
			
				
				String msg = "Reservation successful";
				
				return new ModelAndView("index","MSG",msg);
				
		}		
		
	
	
}
