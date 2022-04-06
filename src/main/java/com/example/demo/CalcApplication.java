package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class CalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcApplication.class, args);
	}
	
	/*public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}*/
	@GetMapping(path="/Sumar/{Num1}/{Num2}")
	public String sumar(@PathVariable String Num1,@PathVariable String Num2) {
		return "Suma de los valores = " + Num1+" + "+Num2 + " = " + (Integer.parseInt(Num1)+Integer.parseInt(Num2));
	}
	@GetMapping(path="/Restar/{Num1}/{Num2}")
	public String restar(@PathVariable String Num1,@PathVariable String Num2) {
		return "Resta de los valores = " + Num1+" - "+Num2 + " = " + (Integer.parseInt(Num1)-Integer.parseInt(Num2));
	}
	@GetMapping(path="/Multiplicar/{Num1}/{Num2}")
	public String multiplicar(@PathVariable String Num1,@PathVariable String Num2) {
		return "Multiplicacion de los valores = " + Num1+" * "+Num2 + " = " + (Integer.parseInt(Num1)*Integer.parseInt(Num2));
	}
	@GetMapping(path="/Dividir/{Num1}/{Num2}")
	public String dividir(@PathVariable String Num1,@PathVariable String Num2) {
		return "La multiplicacion de los valores es = " + Num1+" / "+Num2 + " = " + (Integer.parseInt(Num1)/Integer.parseInt(Num2));
	}
	
}
