package com.victor.exercicio.passwordapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PasswordControllerTest {

    private static final String API_URL = "/api/password/validation";
    private static final String CORRECT_PASSWORD = "AbTp9!fok";

    @Autowired
    private MockMvc mockMvc;

    @Test
    void whenRequestIsMade_thenReturnStatusCodeOk() throws Exception {
        mockMvc.perform(post(API_URL)
                .contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                .param("password", CORRECT_PASSWORD))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    void whenMatchingAllConstraintsPassword_thenReturnTrue() throws Exception {

         mockMvc.perform(post(API_URL)
                .contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                .param("password", CORRECT_PASSWORD))
                .andExpect(status().isOk())
                .andExpect(content().string(Boolean.TRUE.toString()))
                .andDo(print());
    }

    @Test
    void whenPasswordNotMatchConstraints_thenReturnFalse() throws Exception {
        mockMvc.perform(post(API_URL)
                .contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                .param("password", "INCORRECT_PASSWORD"))
                .andExpect(status().isOk())
                .andExpect(content().string(Boolean.FALSE.toString()))
                .andDo(print());
    }
}
