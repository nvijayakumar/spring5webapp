/**
 * 
 */
package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repository.AuthorRepository;

/**
 * @author vijayakumar
 * @Since  12-Jan-2022
 *
 */
@Controller
public class AuthorController {

	private AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		
		model.addAttribute("authors", authorRepository.findAll());
		
		return "authors/list";
	}
	
}
