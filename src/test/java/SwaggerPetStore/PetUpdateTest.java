package SwaggerPetStore;

import SwaggerPetStore.DTO.CategoryDTO;
import SwaggerPetStore.DTO.PetDTO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PetUpdateTest extends Settings {
    static PetDTO pet;

    @Order(1)
    @Test
    void createPetTest() {

        pet = PetDTO.builder()
                .name("Jack")
                .category(CategoryDTO.builder()
                        .id(1)
                        .name("dog")
                        .build())

                .photoUrls(new String[] {"url"})
                .status("available")
                .build();

        pet = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(pet)
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .log().all()
                .extract().body().as(PetDTO.class);
    }

    @Order(2)
    @Test
    void updatePetTest() {
        // Обновление объекта PetDTO с новыми данными
        pet = PetDTO.builder()
                .id(pet.getId())
                .name("Rob")
                .category(CategoryDTO.builder()
                        .id(1)
                        .name("dog")
                        .build())

                .photoUrls(new String[] {"url"})
                .status("available")
                .build();
// Отправка PUT-запроса на сервер с обновленным объектом PetDTO
        pet = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(pet)
                .when()
                .put("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .log().all()
                .extract().body().as(PetDTO.class);
    }
}
