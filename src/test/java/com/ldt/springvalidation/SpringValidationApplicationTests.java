package com.ldt.springvalidation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@AutoConfigureMockMvc
//@SpringBootTest(classes = com.ldt.springvalidation.SpringValidationApplication.class)
//@WebMvcTest

@RunWith(SpringRunner.class)
//@ContextConfiguration(classes=SpringValidationApplication.class)
//@WebMvcTest
@WebMvcTest
@AutoConfigureMockMvc
class SpringValidationApplicationTests {

//    @Autowired
//    public WebApplicationContext wac;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
//        if (mockMvc == null) {
//            mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
//        }
    }

    @Test
    void contextLoads() {
        try {
//            MockHttpServletResponse result = getMockMvc().perform(get("/user/get")
//                    .contentType(APPLICATION_JSON))
//                    .andExpect(status().isOk())
//                    .andReturn()
//                    .getResponse();
//            System.out.println(result.getContentAsString());
            MediaType textPlainUtf8 = new MediaType(MediaType.TEXT_PLAIN, Charset.forName("UTF-8"));
            String user = "{\"name\": \"bob\", \"email\" : \"bob@domain.com\"}";
            mockMvc.perform(MockMvcRequestBuilders.post("/user/test")
                    .content(user)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.content()
                            .contentType(textPlainUtf8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private MockMvc getMockMvc() {
        return mockMvc;
    }

}
