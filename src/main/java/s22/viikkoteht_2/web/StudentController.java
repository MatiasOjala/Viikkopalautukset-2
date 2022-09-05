package s22.viikkoteht_2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import s22.viikkoteht_2.domain.Student;

@Controller
public class StudentController {

	@GetMapping("/students")
	public String showStudents(Model model) {
		
		ArrayList<Student> students = new ArrayList<>();
		
			students.add(new Student("Matias", "Ojala"));
			students.add(new Student("Matiass", "Ojalaa"));
			students.add(new Student("Matiasss", "Ojalaaa"));
		
		model.addAttribute("studentsList", students);
		
		return "students";
				
	}
}
