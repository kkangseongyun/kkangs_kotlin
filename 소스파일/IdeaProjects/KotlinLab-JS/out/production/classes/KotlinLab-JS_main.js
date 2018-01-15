if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'KotlinLab-JS_main'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'KotlinLab-JS_main'.");
}
this['KotlinLab-JS_main'] = function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  function main(args) {
    println('Hello World');
  }
  _.main_kand9s$ = main;
  main([]);
  Kotlin.defineModule('KotlinLab-JS_main', _);
  return _;
}(typeof this['KotlinLab-JS_main'] === 'undefined' ? {} : this['KotlinLab-JS_main'], kotlin);
