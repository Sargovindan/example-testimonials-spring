package cz.jiripinkas.example.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.jiripinkas.example.entity.Testimonial;
import cz.jiripinkas.example.repository.TestimonialRepository;

@Service
@Transactional
public class TestimonialService {

	@Autowired
	private TestimonialRepository testimonialRepository;

	public Testimonial save(Testimonial testimonial) {
		testimonial.setCreatedDate(new Date());
		return testimonialRepository.save(testimonial);
	}

	public Testimonial findOne(int testimonialId) {
		return testimonialRepository.findOne(testimonialId);
	}

	public List<Testimonial> findAll() {
		return testimonialRepository.findAll();
	}
	
	public void removeAll() {
		testimonialRepository.deleteAll();
	}
}
