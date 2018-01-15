import kotlinx.html.a
import kotlinx.html.dom.create
import kotlinx.html.img
import kotlinx.html.js.tr
import kotlinx.html.td
import kotlin.browser.document
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
external class XMLHttpRequest

data class User(val avatar_url: String, val login: String, val html_url: String, val type: String)

fun resultJsCore(msg: String){
    val root = document.getElementById("result_core")

    val list=JSON.parse<Array<User>>(msg)
    list.forEach {
        val tr = document.createElement("tr")

        val imgTd = document.createElement("td")
        imgTd.setAttribute("scope","col")
        val img= document.createElement("img")
        img.setAttribute("src", it.avatar_url)
        img.setAttribute("class","rounded-circle")
        img.setAttribute("width","50")
        imgTd.appendChild(img)
        tr.appendChild(imgTd)

        val nameTd = document.createElement("td")
        nameTd.setAttribute("scope","col")
        nameTd.textContent=it.login
        tr.appendChild(nameTd)

        val homeTd = document.createElement("td")
        homeTd.setAttribute("scope","col")
        val homeA = document.createElement("a")
        homeA.setAttribute("href", it.html_url)
        homeA.textContent=it.html_url
        homeTd.appendChild(homeA)
        tr.appendChild(homeTd)

        val typeTd = document.createElement("td")
        typeTd.setAttribute("scope","col")
        typeTd.textContent=it.type
        tr.appendChild(typeTd)

        root?.appendChild(tr)
    }
}

fun resultKotlinx_html_js(msg: String){
    val root = document.getElementById("result_kotlinx")

    val list=JSON.parse<Array<User>>(msg)
    list.forEach {

        val tr = document.create.tr {
            td {
                attributes["scope"] = "col"
                img("rounded-circle"){
                    src=it.avatar_url
                    width="50"
                }
            }
            td {
                attributes["scope"] = "col"
                + it.login
            }
            td {
                attributes["scope"] = "col"
                a {
                    href=it.html_url
                    + it.html_url
                }
            }
            td {
                attributes["scope"] = "col"
                + it.type
            }
        }
        root?.appendChild(tr)
    }
}
fun getListData(){
    var xhr :dynamic= XMLHttpRequest();
    xhr.open("GET", "https://api.github.com/users", true);

    xhr.onreadystatechange=fun(){
        if (xhr.readyState == 4 && xhr.status == 200) {
            println(xhr.responseText)
            resultJsCore(xhr.responseText)
            resultKotlinx_html_js(xhr.responseText)
        }
    }
    xhr.send();
}

fun main(args: Array<String>) {
    getListData()
}

