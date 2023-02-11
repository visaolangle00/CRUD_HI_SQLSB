package mtv.xyz.controllers;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mtv.xyz.models.Depart;
import mtv.xyz.services.DepartService;

@Controller
@RequestMapping("/departs")
public class DepartController {
	@Autowired
	private DepartService departService;
	@GetMapping("/add")
	public String add(ModelMap model) {
		model.addAttribute("depart", new Depart());
		return "departs/addOrEdit";
	}
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(ModelMap model,Depart depart) {
		departService.save(depart);
		
		model.addAttribute(depart);
		return "departs/addOrEdit";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable(name = "id") Integer id) {
		return "departs/addOrEdit";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Integer id) {
		return "list";
	}
	@RequestMapping("/list")
	public String list() {
		return "list";
	}
	@RequestMapping("/find")
	public String find() {
		return "find";
	}
}
