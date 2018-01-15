/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun ch25_3_2(){
//    var data2: dynamic
//    if(data2==undefined){//error
//        alert('undefined')//error
//    }else {
//        alert('defined')//error
//    }

    js("if(data2==undefined){ alert('undefined') }else { alert('defined') }")
    js("""
    if(data2==undefined){
        alert('undefined')
    }else {
        alert('defined')
    }
        """)
}