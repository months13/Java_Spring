package com.fastcampus.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // ctrl+shift+o �ڵ� ����Ʈ 
public class RegisterController {
//	@RequestMapping(value="/register/add", method=RequestMethod.GET) // �ű�ȸ�� ����
	@GetMapping("/register/add") // 4.3���� �߰�
	public String register() {
		return "registerForm";  // WEB-INF/views/registerForm.jsp
	}
	
//	@RequestMapping(value="/register/save", method=RequestMethod.POST) // �ű�ȸ�� ����
// 	@PostMapping("/register/save")
	@PostMapping("/register/add")
	public String save(@ModelAttribute("user") User user, Model m) throws Exception{
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id�� �߸��Է��ϼ̽��ϴ�.", "utf-8");
			
			m.addAttribute("msg", msg);
			return "redirect:/register/add"; // �ű�ȸ�� ����ȭ������ �̵�(redirect)
		}
		
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return false;
	}
	
}