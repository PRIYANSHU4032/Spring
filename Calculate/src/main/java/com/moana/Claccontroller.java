package com.moana;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Claccontroller {
		@RequestMapping("add")
		public String add(@RequestParam("num1") int i,@RequestParam("num2") int j,Model m) {
			
			int sum = i+j;
			m.addAttribute("add",sum);
			return "result";
			
		}
		
		@RequestMapping("substract")
		public String subtarct(@RequestParam("num1") int i,@RequestParam("num2") int j,Model m) {
			
			int sub = i-j;
			m.addAttribute("sub",sub);
			return "result";
			
		}
		
		@RequestMapping("multiply")
		public String multiply(@RequestParam("num1") int i,@RequestParam("num2") int j,Model m) {
			
			int multi= i*j;
			m.addAttribute("multi",multi);
			return "result";
			
		}
		
		@RequestMapping("divide")
		public String divide(@RequestParam("num1") int i,@RequestParam("num2") int j,Model m) {
			
			int divide= i/j;
			m.addAttribute("divide",divide);
			return "result";
			
		}

}
