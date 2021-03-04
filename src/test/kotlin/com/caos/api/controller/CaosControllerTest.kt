package com.caos.api.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(CaosController::class)
internal class CaosControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `canary test`() {
        assert(true)
    }

    @Test
    fun `return hello world as JSON`() {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(status().isOk)
                .andExpect(content().json("{\"hello\":\"world\"}"))
    }

}
