package com.decode.web.domain.board.dto;

import com.decode.web.domain.tag.dto.TagDto;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class QuestionListDto {

    private Long id;
    private String title;
    private String writer;
    private List<TagDto> tags;
    private LocalDateTime createdTime;
    private int answerCnt;
    private int meTooCnt;

}