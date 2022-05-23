package kr.mooka.web.controller

import kr.mooka.web.dto.MovieInfo
import org.assertj.core.api.Java6Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MovieControllerTests(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `Get Random Movie List`() {
        val response: ResponseEntity<Array<MovieInfo>> = restTemplate.getForEntity(
            "/movie/random?limit=8",
            Array<MovieInfo>::class.java
        )
        val movieList: Array<MovieInfo> = response.body!!
        assertThat(response.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(movieList.size).isEqualTo(3)
    }
}