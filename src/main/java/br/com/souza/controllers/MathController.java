package br.com.souza.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.souza.SimpleMath;

//Para informar que é do tipo REST
@RestController
public class MathController {
	SimpleMath math = new SimpleMath();
	
	@GetMapping("/sum")
		public String teste() {
		return"Digite os valores a serem somados!";
	}
	
	@GetMapping("/sum/{num1}/{num2}")
	public Double sum(
			@PathVariable Double num1,
			@PathVariable Double num2
			) {
		return math.sum(num1, num2);	
	}
	
	@GetMapping("/mult/{num1}/{num2}")
	public Double mult(
			@PathVariable Double num1,
			@PathVariable Double num2
			) {
		return math.multiplication(num1, num2);
	}
	
		@GetMapping("/div/{num1}/{num2}")
		public Double division(
				@PathVariable Double num1,
				@PathVariable Double num2
				) {
			return math.division(num1, num2);	
		}
	
		@GetMapping("/sqrt/{num1}")
		public Double sqrt(
				@PathVariable Double num1
				) {
			return math.squareRoot(num1);	
		}
		@GetMapping("/mean/{num1}")
		public Double mean(
				@PathVariable Double num1,
				@PathVariable Double num2
				) {
			return math.mean(num1, num2);	
		}
	
}
