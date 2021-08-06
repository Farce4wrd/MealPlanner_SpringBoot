package com.petero.eatsimple.controllers;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.petero.eatsimple.models.Ingredient;
import com.petero.eatsimple.models.Meal;

import reactor.core.publisher.Mono;

import static com.petero.eatsimple.controllers.IngredientRestController.MEAL_INGREDIENTS;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IngredientRestControllerTest {
	
	@Autowired
	private ApplicationContext context;
	private WebTestClient webTestClient;
	private Ingredient ingredient;
	private Meal meal;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		webTestClient = WebTestClient.bindToApplicationContext(this.context).build();
		
		ingredient = new Ingredient("id", "Beans", 20, 200, meal);
	}

	@Test
	void testGetAllIngredients() {
		webTestClient.get().uri(MEAL_INGREDIENTS)
		.exchange()
		.expectBodyList(Ingredient.class);
	}

	@Test
	void testCreateIngredient() {
		webTestClient.post()
		.uri(MEAL_INGREDIENTS)
		.body(Mono.just(ingredient), Ingredient.class)
		.exchange()
		.expectStatus().isOk()
		.expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
		.expectBody(Ingredient.class);
	}

}
