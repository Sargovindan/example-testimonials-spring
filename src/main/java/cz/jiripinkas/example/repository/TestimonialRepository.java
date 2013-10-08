package cz.jiripinkas.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cz.jiripinkas.example.entity.Testimonial;

@Repository
public class TestimonialRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public Testimonial save(Testimonial testimonial) {
		if (testimonial.getTestimonialId() == null) {
			entityManager.persist(testimonial);
			return testimonial;
		} else {
			return entityManager.merge(testimonial);
		}
	}

	public List<Testimonial> findAll() {
		return entityManager.createNamedQuery(Testimonial.FIND_ALL, Testimonial.class).getResultList();
	}

	public Testimonial findOne(int testimonialId) {
		return entityManager.find(Testimonial.class, testimonialId);
	}

	public void delete(int testimonialId) {
		entityManager.remove(entityManager.find(Testimonial.class, testimonialId));
	}
	
	public void deleteAll() {
		entityManager.createQuery("delete from Testimonial").executeUpdate();
	}
}
