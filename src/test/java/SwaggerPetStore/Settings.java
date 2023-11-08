package SwaggerPetStore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import java.util.HashMap;

public class Settings {
    protected static HashMap<String, Object> body;

    @BeforeAll
    static void setupBeforeTests() {
        // В этом методе создается новый экземпляр HashMap и присваивается body
        body = new HashMap<>();
    }
    @AfterEach
    void clearBody(){
        // В этом методе body очищается
        body.clear();
    }
}
