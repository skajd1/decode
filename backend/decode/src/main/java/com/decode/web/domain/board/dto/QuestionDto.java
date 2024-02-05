package com.decode.web.domain.board.dto;

import com.decode.web.entity.UserProfileEntity;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class QuestionDto {

    private LocalDateTime createTime;
    private LocalDateTime updatedTime;


}
