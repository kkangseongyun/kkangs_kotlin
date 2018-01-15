package twenty_six_one_one

import org.w3c.dom.events.Event
import kotlin.browser.document
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
external fun alert(msg: String): Unit

val sayHello = fun (event: Event){
    alert("Hello Kotlin")
}
fun selectDOMNode(){
    val node = document.getElementById("result_1_1")
    node?.innerHTML="<a href='https://kotlinlang.org'>kotlin</a>"

    val button= document.getElementById("btn_1_2")
//    button?.addEventListener("click", sayHello)
    button?.addEventListener("click", { alert("Hello Kotlin")})
}

val array = arrayOf("hello", "kotlin", "kkang")

fun createDOM(){
    val result = document.getElementById("result_1_2")
//    var html="<ul>"
//    array.forEach {
//        html += "<li>$it</li>"
//    }
//    html += "</ul>"
//    result?.innerHTML=html

    val ul = document.createElement("ul")
    array.forEach {
        val li= document.createElement("li")
        li.textContent=it
        ul.appendChild(li)
    }
    result?.appendChild(ul)
}



fun Ch26_1_1(){
    selectDOMNode()
    createDOM()
}