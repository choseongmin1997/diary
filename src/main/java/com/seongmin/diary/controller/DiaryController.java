package com.seongmin.diary.controller;

import com.seongmin.diary.Service.ShelfService;
import com.seongmin.diary.persistence.domain.Shelf;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class DiaryController {

    private final ShelfService shelfService;

    private final String baseUrl = "/shelves";

    @GetMapping(baseUrl)
    public List<Shelf> ShelfList() {
        log.debug("get shelf list ");
        return shelfService.getShelves();
    }

}
