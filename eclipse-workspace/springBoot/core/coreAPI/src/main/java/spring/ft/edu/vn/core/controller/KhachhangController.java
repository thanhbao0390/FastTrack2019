package spring.ft.edu.vn.core.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import spring.ft.edu.vn.core.entity.Khachhang;
import spring.ft.edu.vn.core.repository.KhachhangRepository;

@RestController
@RequestMapping(path = "/khachhang")
public class KhachhangController {

	@Autowired
	private KhachhangRepository repo;

	@GetMapping
	public @ResponseBody Iterable<Khachhang> findAll() {

		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Khachhang> findById(@PathVariable String id) {

		Optional<Khachhang> o = repo.findById(id);
		if (!o.isPresent()) {
			// log.error("Id " + id + " is not existed");
			return ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok(o.get());
	}
	
	@PostMapping
	public @ResponseBody void save(@RequestBody Khachhang p) {

		repo.save(p);
	}
	
	@DeleteMapping
	public @ResponseBody void delete(@RequestBody Khachhang p) {

		repo.delete(p);
	}

}
