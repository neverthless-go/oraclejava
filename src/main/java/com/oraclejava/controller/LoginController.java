package com.oraclejava.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.oraclejava.domain.Customer;
import com.oraclejava.form.LoginForm;
import com.oraclejava.repository.CustomerRepository;

@Controller
public class LoginController {

	private CustomerRepository customerRepository;

	public LoginController(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@ModelAttribute
	public LoginForm seLoginForm() {
		return new LoginForm();
	}

	// 로그인화면
	@GetMapping("/login") // 밑의 메소드와 주소가 같을땐 get post로 구분을 준다.
	public String loginForm(Model model) {
		model.addAttribute("contents", "login-in :: login");
		return "index";
	}

	// 로그아웃 , session을 지우는 방법
	@GetMapping("/logout") // 밑의 메소드와 주소가 같을땐 get post로 구분을 준다.
	public String logout(Model model, HttpSession session) {
		session.invalidate(); //session전부 지움
		// session.removeAttribute("customer"); //customer는 지워지고 cart는 남음 위에꺼랑 이거 둘중에 하나 골라서 쓰기
		return "redirect:/login";
	}

	// 로그인처리
	@PostMapping("/login")
	public String loginAction(@Validated LoginForm loginForm, BindingResult result, Model model, HttpSession session) {

		if (result.hasErrors()) {
			return loginForm(model);
		}

		Customer customer = customerRepository.search(loginForm.getLogin(), loginForm.getPassword());
		if (customer != null) {
			session.setAttribute("customer", customer);
			model.addAttribute("contents", "login-out :: login");
			return "index"; // 로그인에 성공하셨습니다. //로그인에 성공하면 로그아웃으로 간다?
		} else {
			// 로그인 실패
			model.addAttribute("contents", "error-login :: login");
			return "index";
		}
	}

}
