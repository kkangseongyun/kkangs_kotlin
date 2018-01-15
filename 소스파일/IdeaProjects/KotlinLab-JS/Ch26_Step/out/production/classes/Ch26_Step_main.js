if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'Ch26_Step_main'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'Ch26_Step_main'.");
}
if (typeof this['kotlinx-html-js'] === 'undefined') {
  throw new Error("Error loading module 'Ch26_Step_main'. Its dependency 'kotlinx-html-js' was not found. Please, check whether 'kotlinx-html-js' is loaded prior to 'Ch26_Step_main'.");
}
var Ch26_Step_main = function (_, Kotlin, $module$kotlinx_html_js) {
  'use strict';
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var Unit = Kotlin.kotlin.Unit;
  var get_create = $module$kotlinx_html_js.kotlinx.html.dom.get_create_4wc2mh$;
  var img = $module$kotlinx_html_js.kotlinx.html.img_evw26v$;
  var td = $module$kotlinx_html_js.kotlinx.html.td_vlzo05$;
  var a = $module$kotlinx_html_js.kotlinx.html.a_gu26kr$;
  var tr = $module$kotlinx_html_js.kotlinx.html.js.tr_9pz0lc$;
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  function User(avatar_url, login, html_url, type) {
    this.avatar_url = avatar_url;
    this.login = login;
    this.html_url = html_url;
    this.type = type;
  }
  User.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'User',
    interfaces: []
  };
  User.prototype.component1 = function () {
    return this.avatar_url;
  };
  User.prototype.component2 = function () {
    return this.login;
  };
  User.prototype.component3 = function () {
    return this.html_url;
  };
  User.prototype.component4 = function () {
    return this.type;
  };
  User.prototype.copy_w74nik$ = function (avatar_url, login, html_url, type) {
    return new User(avatar_url === void 0 ? this.avatar_url : avatar_url, login === void 0 ? this.login : login, html_url === void 0 ? this.html_url : html_url, type === void 0 ? this.type : type);
  };
  User.prototype.toString = function () {
    return 'User(avatar_url=' + Kotlin.toString(this.avatar_url) + (', login=' + Kotlin.toString(this.login)) + (', html_url=' + Kotlin.toString(this.html_url)) + (', type=' + Kotlin.toString(this.type)) + ')';
  };
  User.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.avatar_url) | 0;
    result = result * 31 + Kotlin.hashCode(this.login) | 0;
    result = result * 31 + Kotlin.hashCode(this.html_url) | 0;
    result = result * 31 + Kotlin.hashCode(this.type) | 0;
    return result;
  };
  User.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.avatar_url, other.avatar_url) && Kotlin.equals(this.login, other.login) && Kotlin.equals(this.html_url, other.html_url) && Kotlin.equals(this.type, other.type)))));
  };
  function resultJsCore(msg) {
    var root = document.getElementById('result_core');
    var list = JSON.parse(msg);
    var tmp$;
    for (tmp$ = 0; tmp$ !== list.length; ++tmp$) {
      var element = list[tmp$];
      var tr = document.createElement('tr');
      var imgTd = document.createElement('td');
      imgTd.setAttribute('scope', 'col');
      var img = document.createElement('img');
      img.setAttribute('src', element.avatar_url);
      img.setAttribute('class', 'rounded-circle');
      img.setAttribute('width', '50');
      imgTd.appendChild(img);
      tr.appendChild(imgTd);
      var nameTd = document.createElement('td');
      nameTd.setAttribute('scope', 'col');
      nameTd.textContent = element.login;
      tr.appendChild(nameTd);
      var homeTd = document.createElement('td');
      homeTd.setAttribute('scope', 'col');
      var homeA = document.createElement('a');
      homeA.setAttribute('href', element.html_url);
      homeA.textContent = element.html_url;
      homeTd.appendChild(homeA);
      tr.appendChild(homeTd);
      var typeTd = document.createElement('td');
      typeTd.setAttribute('scope', 'col');
      typeTd.textContent = element.type;
      tr.appendChild(typeTd);
      root != null ? root.appendChild(tr) : null;
    }
  }
  function resultKotlinx_html_js$lambda$lambda$lambda$lambda(closure$it) {
    return function ($receiver) {
      $receiver.src = closure$it.avatar_url;
      $receiver.width = '50';
      return Unit;
    };
  }
  function resultKotlinx_html_js$lambda$lambda$lambda(closure$it) {
    return function ($receiver) {
      $receiver.attributes.put_xwzc9p$('scope', 'col');
      img($receiver, 'rounded-circle', void 0, void 0, resultKotlinx_html_js$lambda$lambda$lambda$lambda(closure$it));
      return Unit;
    };
  }
  function resultKotlinx_html_js$lambda$lambda$lambda_0(closure$it) {
    return function ($receiver) {
      $receiver.attributes.put_xwzc9p$('scope', 'col');
      $receiver.unaryPlus_pdl1vz$(closure$it.login);
      return Unit;
    };
  }
  function resultKotlinx_html_js$lambda$lambda$lambda$lambda_0(closure$it) {
    return function ($receiver) {
      $receiver.href = closure$it.html_url;
      $receiver.unaryPlus_pdl1vz$(closure$it.html_url);
      return Unit;
    };
  }
  function resultKotlinx_html_js$lambda$lambda$lambda_1(closure$it) {
    return function ($receiver) {
      $receiver.attributes.put_xwzc9p$('scope', 'col');
      a($receiver, void 0, void 0, void 0, resultKotlinx_html_js$lambda$lambda$lambda$lambda_0(closure$it));
      return Unit;
    };
  }
  function resultKotlinx_html_js$lambda$lambda$lambda_2(closure$it) {
    return function ($receiver) {
      $receiver.attributes.put_xwzc9p$('scope', 'col');
      $receiver.unaryPlus_pdl1vz$(closure$it.type);
      return Unit;
    };
  }
  function resultKotlinx_html_js$lambda$lambda(closure$it) {
    return function ($receiver) {
      td($receiver, void 0, resultKotlinx_html_js$lambda$lambda$lambda(closure$it));
      td($receiver, void 0, resultKotlinx_html_js$lambda$lambda$lambda_0(closure$it));
      td($receiver, void 0, resultKotlinx_html_js$lambda$lambda$lambda_1(closure$it));
      td($receiver, void 0, resultKotlinx_html_js$lambda$lambda$lambda_2(closure$it));
      return Unit;
    };
  }
  function resultKotlinx_html_js(msg) {
    var root = document.getElementById('result_kotlinx');
    var list = JSON.parse(msg);
    var tmp$;
    for (tmp$ = 0; tmp$ !== list.length; ++tmp$) {
      var element = list[tmp$];
      var tr_0 = tr(get_create(document), void 0, resultKotlinx_html_js$lambda$lambda(element));
      root != null ? root.appendChild(tr_0) : null;
    }
  }
  function getListData$lambda(closure$xhr) {
    return function () {
      if (closure$xhr.v.readyState == 4 && closure$xhr.v.status == 200) {
        println(closure$xhr.v.responseText);
        resultJsCore(closure$xhr.v.responseText);
        resultKotlinx_html_js(closure$xhr.v.responseText);
      }
    };
  }
  function getListData() {
    var xhr = {v: new XMLHttpRequest()};
    xhr.v.open('GET', 'https://api.github.com/users', true);
    xhr.v.onreadystatechange = getListData$lambda(xhr);
    xhr.v.send();
  }
  function main(args) {
    getListData();
  }
  _.User = User;
  _.resultJsCore_61zpoe$ = resultJsCore;
  _.resultKotlinx_html_js_61zpoe$ = resultKotlinx_html_js;
  _.getListData = getListData;
  _.main_kand9s$ = main;
  main([]);
  Kotlin.defineModule('Ch26_Step_main', _);
  return _;
}(typeof Ch26_Step_main === 'undefined' ? {} : Ch26_Step_main, kotlin, this['kotlinx-html-js']);
