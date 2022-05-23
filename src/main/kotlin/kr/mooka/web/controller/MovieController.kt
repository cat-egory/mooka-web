package kr.mooka.web.controller

import kr.mooka.web.dto.MovieInfo
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieController {

    @GetMapping("movie/random")
    fun getRandomMovieList(@RequestParam(defaultValue = "10") limit: String): List<MovieInfo> {

        println("limit:$limit")

        return listOf(
            MovieInfo("YourName", "http://naver.com", "imageUrl", "kimino-nawa", "shinkai makoto"),
            MovieInfo("YourName2", "http://naver.com/asd", "imageUrl", "kimino-nawa", "shinkai makoto"),
            MovieInfo("YourName3", "http://naver.com/vgbf", "imageUrl", "kimino-nawa", "shinkai makoto")
        )
    }
}