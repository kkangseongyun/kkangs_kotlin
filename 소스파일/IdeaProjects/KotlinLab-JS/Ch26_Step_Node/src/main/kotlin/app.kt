/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
external fun require(module:String):dynamic

fun main(args: Array<String>) {

    val express = require("express")
    val app = express()

    app.get("/", { req, res ->
        res.type("text/plain")
        res.send("HelloWorld with Kotlin")
    })

    app.listen(3000, {
        println("Listening on port 3000")
    })
}