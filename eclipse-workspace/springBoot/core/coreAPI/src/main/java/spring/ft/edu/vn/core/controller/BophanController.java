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

import spring.ft.edu.vn.core.entity.Bophan;
import spring.ft.edu.vn.core.repository.BophanRepository;

@RestController
@RequestMapping(path = "/bophan")
public class BophanController {

	@Autowired
	private BophanRepository repo;

	@GetMapping
	public @ResponseBody Iterable<Bophan> findAll() {

		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Bophan> findById(@PathVariable String id) {

		Optional<Bophan> o = repo.findById(id);
		if (!o.isPresent()) {
			// log.error("Id " + id + " is not existed");
			return ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok(o.get());
	}
	
	@PostMapping
	public @ResponseBody void save(@RequestBody Bophan p) {

		repo.save(p);
	}
	
	@DeleteMapping
	public @ResponseBody void delete(@RequestBody Bophan p) {

		repo.delete(p);
	}

}
