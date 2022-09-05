package s22.viikkoteht_2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import s22.viikkoteht_2.domain.Friend;

@Controller
public class FriendController {
	
	ArrayList<Friend> friends = new ArrayList<>();
	
		@GetMapping("/index")
		public String firends(Friend name, Model model) {
			
			
			
			model.addAttribute("friendsList", friends);
			model.addAttribute("name", new Friend());
			friends.add(name);
			return "friends";				
		}
		
		

}
