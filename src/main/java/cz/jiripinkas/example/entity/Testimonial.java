package cz.jiripinkas.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Testimonial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "testimonial_id")
	private Integer testimonialId;
	
	private Date createdDate;

	private String name;

	@Lob
	private String pluses;

	@Lob
	private String minuses;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getPluses() {
		return pluses;
	}

	public void setPluses(String pluses) {
		this.pluses = pluses;
	}

	public String getMinuses() {
		return minuses;
	}

	public void setMinuses(String minuses) {
		this.minuses = minuses;
	}

	public Integer getTestimonialId() {
		return testimonialId;
	}

	public void setTestimonialId(Integer testimonialId) {
		this.testimonialId = testimonialId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
