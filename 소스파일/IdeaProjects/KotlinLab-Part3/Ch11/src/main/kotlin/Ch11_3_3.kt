package eleven_three_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

//추상 클래스와 Sealed 클래스의 차이
//sealed class SeaedClass public constructor(){//error
//
//    public constructor(no: Int): this()//error
//
//    class SubOne(val radius: Double) : SeaedClass()
//    class SubTwo(val width: Int, val height: Int) : SeaedClass()
//}

abstract class AbstractClass public constructor(){
    public constructor(no: Int): this()

    class SubOne(val radius: Double) : AbstractClass()
    class SubTwo(val width: Int, val height: Int) : AbstractClass()
}