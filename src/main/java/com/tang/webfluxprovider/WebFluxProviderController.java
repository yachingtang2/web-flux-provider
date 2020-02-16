package com.tang.webfluxprovider;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WebFluxProviderController {

  @GetMapping("/message")
  public ResponseEntity<Mono<String>> getMessage() {

    return ResponseEntity.status(HttpStatus.OK)
            .contentType(MediaType.TEXT_PLAIN)
            .body(Mono.just("This is a new message!!!"));

//    return new ResponseEntity<>(Mono.just("This is a new message!!!"), HttpStatus.OK);
  }
}
