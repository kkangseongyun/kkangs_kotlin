package twenty_six_two_two

import kotlinx.html.*
import kotlinx.html.dom.create
import kotlinx.html.js.div
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document
import kotlin.dom.addClass
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
fun createDOM(){
    val root= document.getElementById("result_4_1")

    val div= document.createElement("div")
    div.addClass("panel")

    val p = document.createElement("p")
    p.addClass("pClass")
    p.textContent="Hello"

    val a = document.createElement("a")
    a.setAttribute("href","http://kotlinlang.org")
    a.textContent="kotlin"

    val button = document.createElement("button")
    button.textContent="click me!"
    button.addEventListener("click", { println("button click...")})

    div.appendChild(p)
    div.appendChild(a)
    div.appendChild(button)

    root?.appendChild(div)
}

fun useDSL(){
    val root= document.getElementById("result_4_1")

    val div = document.create.div("panel"){
        p("pClass"){
            + "Hello"
        }
        a{
            + "kotlin"
            href="http://kotlinlang.org"
        }
        button{
            + "click me"
            onClickFunction={ println("button click...")}
        }
    }

    root?.appendChild(div)
}

fun domTree(){
    val myDiv = document.create.div {
        p {
            +"p one"
            div {
                + "sub div"
            }
        }
        p {
            +"p two"
        }
    }

    val root= document.getElementById("result_4_2")
    root?.appendChild(myDiv)
}

fun css(){
    val myDiv = document.create.div {
        p(classes = "container left tree")
        p {
            classes=setOf("container", "left", "tree")
            classes += "siteHeader"
        }
    }
    val root= document.getElementById("result_4_3")
    root?.appendChild(myDiv)
}
fun Ch26_2_2(){
    //createDOM()
    useDSL()
    domTree()
    css()
}