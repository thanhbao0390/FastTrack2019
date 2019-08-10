package s-build:packageName;

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

import s-build:packageEntityName;
import s-build:packageRepositoryName;

@RestController
@RequestMapping(path = "/s-build:requestUrl")
public class s-build:className {

	@Autowired
	private s-build:classRepositoryName repo;

	@GetMapping
	public @ResponseBody Iterable<s-build:classEntityName> findAll() {

		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<s-build:classEntityName> findById(@PathVariable s-build:propertiesType id) {

		Optional<s-build:classEntityName> o = repo.findById(id);
		if (!o.isPresent()) {
			// log.error("Id " + id + " is not existed");
			return ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok(o.get());
	}
	
	@PostMapping
	public @ResponseBody void save(@RequestBody s-build:classEntityName p) {

		repo.save(p);
	}
	
	@DeleteMapping
	public @ResponseBody void delete(@RequestBody s-build:classEntityName p) {

		repo.delete(p);
	}

}
