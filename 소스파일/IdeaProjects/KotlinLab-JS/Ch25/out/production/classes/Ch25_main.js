if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'Ch25_main'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'Ch25_main'.");
}
var Ch25_main = function (_, Kotlin) {
  'use strict';
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  Sub.prototype = Object.create(JsSuper.prototype);
  Sub.prototype.constructor = Sub;
  function User(no, name) {
    this.no = no;
    this.name = name;
  }
  User.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'User',
    interfaces: []
  };
  User.prototype.component1 = function () {
    return this.no;
  };
  User.prototype.component2 = function () {
    return this.name;
  };
  User.prototype.copy_19mbxw$ = function (no, name) {
    return new User(no === void 0 ? this.no : no, name === void 0 ? this.name : name);
  };
  User.prototype.toString = function () {
    return 'User(no=' + Kotlin.toString(this.no) + (', name=' + Kotlin.toString(this.name)) + ')';
  };
  User.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.no) | 0;
    result = result * 31 + Kotlin.hashCode(this.name) | 0;
    return result;
  };
  User.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.no, other.no) && Kotlin.equals(this.name, other.name)))));
  };
  function ch25_3_1$dynFun(arg) {
    return 10;
  }
  function ch25_3_1() {
    var obj = new User(10, 'kkang');
    var resultDom = document.getElementById('result_3_1_dynamic_1');
    resultDom != null ? (resultDom.innerHTML = 'no : ' + obj.no + ', name : ' + obj.name) : null;
    var dynFun = ch25_3_1$dynFun;
    var dynData = 10;
    dynData = 'hello';
    dynFun(10);
    dynFun(true);
    var data1 = 10;
    data1 = 'kkang';
    var resultDom2 = document.getElementById('result_3_1_dynamic_2');
    resultDom2 != null ? (resultDom2.innerHTML = 'data1 : ' + data1) : null;
    var myData2 = null;
    var myData3 = null;
    var myData4 = 10;
  }
  function main(args) {
    ch25_3_1();
    ch25_3_3();
  }
  function ch25_3_2() {
    if (data2 == undefined) {
      alert('undefined');
    }
     else {
      alert('defined');
    }
    if (data2 == undefined) {
      alert('undefined');
    }
     else {
      alert('defined');
    }
  }
  function Sub() {
    JsSuper.call(this);
  }
  Sub.prototype.subFun = function () {
    console.log('i am kotlin subFun');
  };
  Sub.prototype.superFun = function () {
    JsSuper.prototype.superFun.call(this);
    console.log('i am kotlin superFun');
  };
  Sub.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Sub',
    interfaces: []
  };
  function ch25_3_3$ObjectLiteral() {
  }
  ch25_3_3$ObjectLiteral.prototype.argFun1 = function () {
    console.log('argFun1 call....');
  };
  ch25_3_3$ObjectLiteral.prototype.argFun2 = function () {
    console.log('argFun2 call....');
  };
  ch25_3_3$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function ch25_3_3() {
    alert('hello kkang');
    jsFun(jsData);
    var obj = new JsClass('kim');
    obj.sayHello();
    JsClass.sayHello2('lee');
    var obj2 = new Sub();
    obj2.superFun();
    obj2.subFun();
    jsFun3(new ch25_3_3$ObjectLiteral());
  }
  var myVal;
  function myFun() {
    println('myFun call....');
  }
  function MyClass() {
  }
  MyClass.prototype.myClassFun = function () {
    println('myClassFun call.....');
  };
  MyClass.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'MyClass',
    interfaces: []
  };
  var someVal;
  function someFun() {
    println('someFun call....');
  }
  function someFun2(arg) {
    println('someFun2 call... ' + arg);
  }
  var someVal2;
  function SomeClass() {
  }
  SomeClass.prototype.helloClassFun = function () {
    println('someFun call....');
  };
  SomeClass.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'SomeClass',
    interfaces: []
  };
  var package$twenty_five_three_one = _.twenty_five_three_one || (_.twenty_five_three_one = {});
  package$twenty_five_three_one.User = User;
  package$twenty_five_three_one.ch25_3_1 = ch25_3_1;
  package$twenty_five_three_one.main_kand9s$ = main;
  _.ch25_3_2 = ch25_3_2;
  _.Sub = Sub;
  _.ch25_3_3 = ch25_3_3;
  Object.defineProperty(_, 'myVal', {
    get: function () {
      return myVal;
    }
  });
  _.myFun = myFun;
  _.MyClass = MyClass;
  var package$twenty_five_four_two = _.twenty_five_four_two || (_.twenty_five_four_two = {});
  Object.defineProperty(package$twenty_five_four_two, 'someVal', {
    get: function () {
      return someVal;
    }
  });
  package$twenty_five_four_two.someFun = someFun;
  package$twenty_five_four_two.helloFun = someFun2;
  Object.defineProperty(package$twenty_five_four_two, 'helloVal', {
    get: function () {
      return someVal2;
    }
  });
  package$twenty_five_four_two.HelloClass = SomeClass;
  myVal = 'hello myVal';
  someVal = 'someVal..';
  someVal2 = 'someVal2';
  main([]);
  Kotlin.defineModule('Ch25_main', _);
  return _;
}(typeof Ch25_main === 'undefined' ? {} : Ch25_main, kotlin);
