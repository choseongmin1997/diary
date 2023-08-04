package com.seongmin.diary.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
public class DiaryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private final String baseUrl = "/diaries";

    @Test
    public void getDiaryListTest() throws Exception {
        //when
        MvcResult mvcResult = mockMvc.perform(get(baseUrl)).andReturn();

        //then
        Assertions.assertThat(mvcResult.getResponse().getContentAsString()).isEqualTo("get list");
    }
}
