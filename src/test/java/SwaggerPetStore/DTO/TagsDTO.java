package SwaggerPetStore.DTO;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Value
public class TagsDTO {

    Integer id;

    String name;
}
