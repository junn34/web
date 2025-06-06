package org.zerock.b01.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zerock.b01.dto.ReplyDTO;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/replies")
@Log4j2
public class ReplyController {
    @ApiOperation(value = "Replies POST",notes="POST 방식으로 댓글 등록")
    @PostMapping(value="/",consumes = MediaType.APPLICATION_JSON_VALUE) //swagger ui에서 해당 기능의 설명으로 출력
    public ResponseEntity<Map<String,Long>> register(@RequestBody ReplyDTO replyDTO) {
        log.info(replyDTO);
        Map<String,Long> resultMap = Map.of("rno",111L);
        return ResponseEntity.ok(resultMap);
    }
}
