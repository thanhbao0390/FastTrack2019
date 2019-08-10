package s-build:packageName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public @ResponseBody Iterable<s-build:classEntityName> all() {
		// This returns a JSON or XML with the users
		return repo.findAll();
	}
	
	@PostMapping
	public @ResponseBody void save(@RequestBody s-build:classEntityName p) {

//		s-build:classEntityName o = new s-build:classEntityName();
//s-mode:body1
		repo.save(p);
	}

}
