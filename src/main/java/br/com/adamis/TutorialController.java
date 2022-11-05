package br.com.adamis;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TutorialController {

	@GetMapping
	public ResponseEntity<String> getAllTutorials(@RequestParam(required = false) String title) {

		try {
			return ResponseEntity.ok("teste");
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}

	}

}
