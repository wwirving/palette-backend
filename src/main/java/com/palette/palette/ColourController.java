package com.palette.palette;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ColourController {

	@Autowired
	public IColourRepository repository;

	public ColourController(){

	}

	@GetMapping("/courses")
}
