package cz.jiripinkas.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import cz.jiripinkas.example.dto.DataTableResult;
import cz.jiripinkas.example.dto.JsonTestimonial;
import cz.jiripinkas.example.entity.Testimonial;
import cz.jiripinkas.example.service.TestimonialService;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class TestimonialController {

	@Autowired
	private TestimonialService testimonialService;

	@RequestMapping("/testimonials")
	public String list(Model model) {
		model.addAttribute("list", testimonialService.findAll());
		return "testimonials";
	}

	@ModelAttribute("testimonial")
	public Testimonial construct() {
		return new Testimonial();
	}

	@RequestMapping("/testimonials/new")
	public String showNew() {
		return "testimonial-edit";
	}

	@RequestMapping(value = "/testimonials/new", method = RequestMethod.POST)
	public String addNew(@ModelAttribute Testimonial testimonial) {
		testimonialService.save(testimonial);
		return "redirect:/testimonials/new.html?success=true";
	}

	@RequestMapping("/testimonials/edit")
	public String showEdit(@RequestParam int id, Model model) {
		model.addAttribute("testimonial", testimonialService.findOne(id));
		return "testimonial-edit";
	}

	@RequestMapping(value = "/testimonials/edit", method = RequestMethod.POST)
	public String editSubmit(@ModelAttribute Testimonial testimonial, @RequestParam int id) {
		testimonial.setTestimonialId(id);
		testimonialService.save(testimonial);
		return "redirect:/testimonials.html";
	}

	@RequestMapping("/testimonials/list")
	@ResponseBody
	DataTableResult listJson() {
		DataTableResult result = new DataTableResult();
		ArrayList<JsonTestimonial> list = new ArrayList<JsonTestimonial>();
		List<Testimonial> testimonials = testimonialService.findAll();
		for (Testimonial testimonial : testimonials) {
			list.add(new JsonTestimonial(testimonial));
		}
		result.setAaData(list);
		return result;
	}

	@RequestMapping("/testimonials/pdf")
	public void generatePdf(@RequestParam int id, HttpServletResponse response) throws DocumentException, IOException {
		Testimonial testimonial = testimonialService.findOne(id);
		Document document = new Document();
		PdfWriter.getInstance(document, response.getOutputStream());
		document.open();
		document.add(new Paragraph("Name: " + testimonial.getName()));
		document.add(new Paragraph("Pluses: " + testimonial.getPluses()));
		document.add(new Paragraph("Minuses: " + testimonial.getMinuses()));
		document.close();
	}
}
