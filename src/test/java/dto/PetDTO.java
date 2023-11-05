package dto;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Value
public class PetDTO {
    String id;

    CategoryDTO category;

    String name;

    String [] photoUrls;

    TagsDTO[] tags;

    String status;
}

