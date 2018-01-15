if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'Ch26_main'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'Ch26_main'.");
}
if (typeof this['kotlinx-html-js'] === 'undefined') {
  throw new Error("Error loading module 'Ch26_main'. Its dependency 'kotlinx-html-js' was not found. Please, check whether 'kotlinx-html-js' is loaded prior to 'Ch26_main'.");
}
var Ch26_main = function (_, Kotlin, $module$kotlinx_html_js) {
  'use strict';
  var Unit = Kotlin.kotlin.Unit;
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  var addClass = Kotlin.kotlin.dom.addClass_hhb33f$;
  var get_create = $module$kotlinx_html_js.kotlinx.html.dom.get_create_4wc2mh$;
  var p = $module$kotlinx_html_js.kotlinx.html.p_8pggrc$;
  var a = $module$kotlinx_html_js.kotlinx.html.a_gu26kr$;
  var set_onClickFunction = $module$kotlinx_html_js.kotlinx.html.js.set_onClickFunction_pszlq2$;
  var button = $module$kotlinx_html_js.kotlinx.html.button_whohl6$;
  var div = $module$kotlinx_html_js.kotlinx.html.js.div_wkomt5$;
  var div_0 = $module$kotlinx_html_js.kotlinx.html.div_ri36nr$;
  var setOf = Kotlin.kotlin.collections.setOf_i5x0yv$;
  var set_classes = $module$kotlinx_html_js.kotlinx.html.set_classes_njy09m$;
  var get_classes = $module$kotlinx_html_js.kotlinx.html.get_classes_fxodxh$;
  var plus = Kotlin.kotlin.collections.plus_xfiyik$;
  function main(args) {
    Ch26_1_1();
    Ch26_1_2();
    Ch26_1_3();
    Ch26_2_2();
  }
  function sayHello$lambda(event) {
    alert('Hello Kotlin');
  }
  var sayHello;
  function selectDOMNode$lambda(it) {
    alert('Hello Kotlin');
    return Unit;
  }
  function selectDOMNode() {
    var node = document.getElementById('result_1_1');
    node != null ? (node.innerHTML = "<a href='https://kotlinlang.org'>kotlin<\/a>") : null;
    var button = document.getElementById('btn_1_2');
    button != null ? (button.addEventListener('click', selectDOMNode$lambda), Unit) : null;
  }
  var array;
  function createDOM() {
    var result = document.getElementById('result_1_2');
    var ul = document.createElement('ul');
    var $receiver = array;
    var tmp$;
    for (tmp$ = 0; tmp$ !== $receiver.length; ++tmp$) {
      var element = $receiver[tmp$];
      var li = document.createElement('li');
      li.textContent = element;
      ul.appendChild(li);
    }
    result != null ? result.appendChild(ul) : null;
  }
  function Ch26_1_1() {
    selectDOMNode();
    createDOM();
  }
  function ajax$lambda(closure$xhr) {
    return function () {
      if (closure$xhr.v.status == 200) {
        println(closure$xhr.v.responseText);
      }
       else {
        println('error');
      }
    };
  }
  function ajax() {
    var xhr = {v: new XMLHttpRequest()};
    xhr.v.open('GET', 'some.json', true);
    xhr.v.onreadystatechange = ajax$lambda(xhr);
    xhr.v.send();
  }
  function Ch26_1_2() {
    ajax();
  }
  function testJQuery() {
    $('#result_3_1').text('hello jQuery');
  }
  function Ch26_1_3() {
    testJQuery();
  }
  function createDOM$lambda(it) {
    println('button click...');
    return Unit;
  }
  function createDOM_0() {
    var root = document.getElementById('result_4_1');
    var div = document.createElement('div');
    addClass(div, ['panel']);
    var p = document.createElement('p');
    addClass(p, ['pClass']);
    p.textContent = 'Hello';
    var a = document.createElement('a');
    a.setAttribute('href', 'http://kotlinlang.org');
    a.textContent = 'kotlin';
    var button = document.createElement('button');
    button.textContent = 'click me!';
    button.addEventListener('click', createDOM$lambda);
    div.appendChild(p);
    div.appendChild(a);
    div.appendChild(button);
    root != null ? root.appendChild(div) : null;
  }
  function useDSL$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('Hello');
    return Unit;
  }
  function useDSL$lambda$lambda_0($receiver) {
    $receiver.unaryPlus_pdl1vz$('kotlin');
    $receiver.href = 'http://kotlinlang.org';
    return Unit;
  }
  function useDSL$lambda$lambda$lambda(it) {
    println('button click...');
    return Unit;
  }
  function useDSL$lambda$lambda_1($receiver) {
    $receiver.unaryPlus_pdl1vz$('click me');
    set_onClickFunction($receiver, useDSL$lambda$lambda$lambda);
    return Unit;
  }
  function useDSL$lambda($receiver) {
    p($receiver, 'pClass', useDSL$lambda$lambda);
    a($receiver, void 0, void 0, void 0, useDSL$lambda$lambda_0);
    button($receiver, void 0, void 0, void 0, void 0, useDSL$lambda$lambda_1);
    return Unit;
  }
  function useDSL() {
    var root = document.getElementById('result_4_1');
    var div_0 = div(get_create(document), 'panel', useDSL$lambda);
    root != null ? root.appendChild(div_0) : null;
  }
  function domTree$lambda$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('sub div');
    return Unit;
  }
  function domTree$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('p one');
    div_0($receiver, void 0, domTree$lambda$lambda$lambda);
    return Unit;
  }
  function domTree$lambda$lambda_0($receiver) {
    $receiver.unaryPlus_pdl1vz$('p two');
    return Unit;
  }
  function domTree$lambda($receiver) {
    p($receiver, void 0, domTree$lambda$lambda);
    p($receiver, void 0, domTree$lambda$lambda_0);
    return Unit;
  }
  function domTree() {
    var myDiv = div(get_create(document), void 0, domTree$lambda);
    var root = document.getElementById('result_4_2');
    root != null ? root.appendChild(myDiv) : null;
  }
  function css$lambda$lambda($receiver) {
    set_classes($receiver, setOf(['container', 'left', 'tree']));
    set_classes($receiver, plus(get_classes($receiver), 'siteHeader'));
    return Unit;
  }
  function css$lambda($receiver) {
    p($receiver, 'container left tree');
    p($receiver, void 0, css$lambda$lambda);
    return Unit;
  }
  function css() {
    var myDiv = div(get_create(document), void 0, css$lambda);
    var root = document.getElementById('result_4_3');
    root != null ? root.appendChild(myDiv) : null;
  }
  function Ch26_2_2() {
    useDSL();
    domTree();
    css();
  }
  _.main_kand9s$ = main;
  var package$twenty_six_one_one = _.twenty_six_one_one || (_.twenty_six_one_one = {});
  Object.defineProperty(package$twenty_six_one_one, 'sayHello', {
    get: function () {
      return sayHello;
    }
  });
  package$twenty_six_one_one.selectDOMNode = selectDOMNode;
  Object.defineProperty(package$twenty_six_one_one, 'array', {
    get: function () {
      return array;
    }
  });
  package$twenty_six_one_one.createDOM = createDOM;
  package$twenty_six_one_one.Ch26_1_1 = Ch26_1_1;
  var package$twenty_six_one_two = _.twenty_six_one_two || (_.twenty_six_one_two = {});
  package$twenty_six_one_two.ajax = ajax;
  package$twenty_six_one_two.Ch26_1_2 = Ch26_1_2;
  var package$twenty_six_one_three = _.twenty_six_one_three || (_.twenty_six_one_three = {});
  package$twenty_six_one_three.testJQuery = testJQuery;
  package$twenty_six_one_three.Ch26_1_3 = Ch26_1_3;
  var package$twenty_six_two_two = _.twenty_six_two_two || (_.twenty_six_two_two = {});
  package$twenty_six_two_two.createDOM = createDOM_0;
  package$twenty_six_two_two.useDSL = useDSL;
  package$twenty_six_two_two.domTree = domTree;
  package$twenty_six_two_two.css = css;
  package$twenty_six_two_two.Ch26_2_2 = Ch26_2_2;
  sayHello = sayHello$lambda;
  array = ['hello', 'kotlin', 'kkang'];
  main([]);
  Kotlin.defineModule('Ch26_main', _);
  return _;
}(typeof Ch26_main === 'undefined' ? {} : Ch26_main, kotlin, this['kotlinx-html-js']);
