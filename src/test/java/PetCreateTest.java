import dto.CategoryDTO;
import dto.PetDTO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PetCreateTest extends Settings {

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
    void getPetById() {

        RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/{petId}", pet.getId())
                .then()
                .statusCode(200)
                .log().all();
    }
}
