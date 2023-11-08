package SwaggerPetStore.dto;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
@Jacksonized
@Builder
@Value
public class CategoryDTO {
        Integer id;

        String name;
}
