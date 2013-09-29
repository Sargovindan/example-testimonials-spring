package cz.jiripinkas.example.dto;

import java.text.SimpleDateFormat;

import cz.jiripinkas.example.entity.Testimonial;

public class JsonTestimonial {

	private String name;

	private String date;

	private String pdf;

	public JsonTestimonial(Testimonial testimonial) {
		name = "<a href='testimonials/edit.html?id=" + testimonial.getTestimonialId() + "'>" + testimonial.getName() + "</a>";
		date = new SimpleDateFormat("d.M.yyyy hh:mm:ss").format(testimonial.getCreatedDate());
		pdf = "<a href='testimonials/pdf.html?id=" + testimonial.getTestimonialId() + "'>pdf</a>";
	}

	public JsonTestimonial() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

}
