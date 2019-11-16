package com.javatechie.api;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloServiceApplication.class)
class HelloServiceApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testMessage() throws Exception {
        mockMvc.perform(get("/home"))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello-service working !!"));
    }
    @Test
    public void testMessageFail() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello-service working !!"));
    }

}
