package com.tang.webfluxprovider;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class webFluxProviderApplicationTest {

  private WebFluxProviderApplication application;

  @BeforeEach
  void setUp() {
    application = new WebFluxProviderApplication();
  }

  @Test
  void notNull() {
    assertThat(application).isNotNull();
  }
}