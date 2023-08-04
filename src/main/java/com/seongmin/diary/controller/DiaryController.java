package com.seongmin.diary.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DiaryController {

    private final String baseUrl = "/diaries";

    @GetMapping(baseUrl)
    public String getList() {
        log.debug("get list");
        return "get list";
    }

}
