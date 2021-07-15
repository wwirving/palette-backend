package com.palette.palette;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class ColourController {

	@Autowired
	public IColourRepository repository;

	public ColourController() {

	}

	@GetMapping("/colours")
	public ResponseEntity<Colour> getColours() {
		return new ResponseEntity(this.repository.findAll(), HttpStatus.OK);
	}

	//get single colour by ID
	@GetMapping("/colours/{colourId}")
	public ResponseEntity getColour(@PathVariable String colourId) {
		Colour colour = this.repository.findById(colourId).get();

		if (colour != null) {
			return new ResponseEntity<>(colour, HttpStatus.OK);
		} else {
			return new ResponseEntity(null, HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/colours")
	public ResponseEntity<Colour> createColour(@RequestBody Colour colour) {
		Colour dbColour = this.repository.save(colour);
		if (dbColour != null) {
			return ResponseEntity.status(HttpStatus.OK).body(colour);
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(colour);
		}
	}

	@DeleteMapping("/colours/{colourId}")
	public ResponseEntity deleteColour(@PathVariable String colourId) {
		this.repository.deleteById(colourId);
		return ResponseEntity.status(HttpStatus.OK).body("Succesfully deleted colour");
	}
}

