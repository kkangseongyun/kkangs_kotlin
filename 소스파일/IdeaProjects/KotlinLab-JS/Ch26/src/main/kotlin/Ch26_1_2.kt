package twenty_six_one_two
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
external class XMLHttpRequest

fun ajax() {
    var xhr :dynamic= XMLHttpRequest();
    xhr.open("GET", "some.json", true);
    xhr.onreadystatechange=fun(){
        if (xhr.status == 200) {
            println(xhr.responseText)
        }else {
            println("error")
        }
    }
    xhr.send();
}
fun Ch26_1_2(){
    ajax()
}