package cz.jiripinkas.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import cz.jiripinkas.example.entity.Testimonial;

@Service
public class InitDbService {

	@Autowired
	TestimonialService testimonialService;

	// initialize database each day
	@Scheduled(fixedDelay = 86400000)
	public void init() {
		System.out.println("*** START INIT DATABASE ***");
		testimonialService.removeAll();
		{
			Testimonial testimonial = new Testimonial();
			testimonial.setPluses("Everything OK");
			testimonial.setMinuses("none");
			testimonial.setName("No Name");
			testimonialService.save(testimonial);
		}
		{
			Testimonial testimonial = new Testimonial();
			testimonial.setPluses("Nothing");
			testimonial.setMinuses("I can think of something ...");
			testimonial.setName("Jeff Grumpy");
			testimonialService.save(testimonial);
		}
		{
			Testimonial testimonial = new Testimonial();
			testimonial.setPluses("-");
			testimonial.setMinuses("-");
			testimonial.setName("none");
			testimonialService.save(testimonial);
		}
		System.out.println("*** FINISH INIT DATABASE ***");
	}
}
