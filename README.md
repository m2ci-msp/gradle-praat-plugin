Gradle Praat Plugin
===================
[![Build Status](https://travis-ci.org/m2ci-msp/gradle-praat-plugin.svg?branch=master)](https://travis-ci.org/m2ci-msp/gradle-praat-plugin)

Provides [Praat](http://praat.org/) (v5.4.17) to Gradle projects via [native wrapper plugin](https://github.com/m2ci-msp/gradle-praat-wrapper-plugin).

Configuration
-------------

See https://plugins.gradle.org/plugin/org.m2ci.msp.praat

Usage
-----

### Execute provided Praat script

Assuming you have a Praat script like `myscript.praat`:
```
for i to 3
  printline Iteration 'i'
endfor
```

You can add a `PraatExec` task like this:

```gradle
task helloPraat(type: PraatExec) {
  script 'myscript.praat'
}
```

Run the task:

```
$ ./gradlew -q helloPraat
Iteration 1
Iteration 2
Iteration 3
```

### Execute inline Praat script

You can also execute Praat scripts defined inline in the task:

```gradle
task helloPraat(type: PraatExec) {
  script 'for i to 3',
         "printline Iteration 'i'",
         'endfor'
}
```
