package com.greenfoxacademy.groot;

import com.greenfoxacademy.groot.controller.GuardianController;
import com.greenfoxacademy.groot.models.Groot;
import com.greenfoxacademy.groot.services.GuardianService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class TestGroot {
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;

    // if an additional service layer is used
    // - meaning not all logic is added to the controller and you have Autowired fields in it -
    // then you have to mock out the service class like below
    //
    @MockBean
    GuardianService guardianService;

    @Test
    public void testIfGrootAnswersCorrectly() throws Exception {
        String received="hiGroot";
        String translated="I am Groot!";
        when(guardianService.MessageOfGroot(received)).thenReturn(new Groot(received));

        mockMvc.perform(get("/groot?=message=" + received))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.received", is(received)))
                .andExpect(jsonPath("$.translated", is(translated)))
                .andDo(print());
    }
}


