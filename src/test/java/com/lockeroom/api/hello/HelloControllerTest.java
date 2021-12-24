package com.lockeroom.api.hello;

import com.lockeroom.api.www.hello.HelloController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class HelloControllerTest {

    private HelloController helloController = new HelloController();

    private MockMvc mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();

    @Test
    @DisplayName("say hello")
    void heartbeat() throws Exception {
        mockMvc.perform(get("/heartbeat"))
                .andExpect(content().string("hello"))
                .andExpect(status().isOk());
    }
}