package com.company.webservicebuild.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(QuoteController.class)
public class QuoteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnRandomQuote() throws Exception {

        // ARRANGE and ACT
        mockMvc.perform(
                get("/quote")
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isOk())                              // ASSERT that we got 200 OK.
                .andExpect(jsonPath("$.quote").isNotEmpty())    // ASSERT that we got back a non-empty quote.
                .andExpect(jsonPath("$.id").isNotEmpty())       // ASSERT that we got back a non-empty id.
                .andExpect(jsonPath("$.author").isNotEmpty());  // ASSERT that we got back a non-empty author.
    }
}
