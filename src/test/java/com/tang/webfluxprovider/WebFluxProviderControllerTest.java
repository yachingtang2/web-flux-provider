package com.tang.webfluxprovider;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

public class WebFluxProviderControllerTest {

  private WebTestClient client;

  @BeforeEach
  void setUp() {
    client = WebTestClient.bindToController(new WebFluxProviderController()).build();
  }

  @Test
  void getMessage() {
    client.get()
        .uri("/message")
        .exchange()
        .expectStatus().isOk()
        .expectHeader().contentType(MediaType.TEXT_PLAIN)
        .expectBody(String.class).isEqualTo("This is a new message!!!");
  }
}
