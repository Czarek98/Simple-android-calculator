# Simple android calculator
> Application which calculate using method "from left to right". 
>It means that it does not take only two numbers and calculate but calculate whole mathematical operation.
> Project created to pass the class on studies

## Table of contents
* [Functions](#functions)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Code Examples](#code-examples)
* [Features](#features)
* [Status](#status)
* [Credits](#credits)

## Functions
* Description of functional buttons:
* C - delete last sign but when result is displaying it works like backspace. It means you can back to previous calculation(before result).
* CE - clear whole calculation.
* () - tapping button display brackets alternately.
* Dark mode switch - change everything to black.

## Screenshots
Normal Mode and Dark Mode
<div style="display:flex;">
<img alt="App image" src="/img/screenshot.png" width="30%">
<img alt="App image" src="/img/screenshot2.png" width="30%">
</div>

## Technologies
* Programming language - Java
* External - Rhino script engine
* Development environment - Android Studio

## Code Examples
Add to build.gradle to make equals button work:
`implementation 'io.apisense:rhino-android:1.1.1'` 

## Features

To-do list:
* Add exponentiation function
* Add sound to every button
* Add history of calculations
* Add more functions
* Add settings

## Status
Project is: _in progress_

## Credits
Library used: https://github.com/APISENSE/rhino-android