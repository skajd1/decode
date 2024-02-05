package com.decode.web.domain.gpt.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GptApiResponseDto {

    private String titles;
    private List<String> tagIds;

    public GptApiResponseDto() {
        tagIds = new ArrayList<>();
    }
}
