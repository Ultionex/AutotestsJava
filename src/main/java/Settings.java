import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import java.util.HashMap;

public class Settings {
    protected static HashMap<String, Object> body;

    @BeforeAll
    static void setupBeforeTests() {
        body = new HashMap<>();
    }
    @AfterEach
    void clearBody(){
        body.clear();
    }
}
