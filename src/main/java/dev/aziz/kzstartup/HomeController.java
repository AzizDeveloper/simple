package dev.aziz.kzstartup;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/basket")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> getBasket() {
        return ResponseEntity.ok("This is basket");
    }

    @GetMapping("/secret")
    public ResponseEntity<String> getBasketSecret() {
        return ResponseEntity.ok("This is secret basket");
    }

}
