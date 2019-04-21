---
id : lesson2
title : 자바 기초
---

## Hello World

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### 암기

- public : 메소드의 접근제어자. `public`은 누구나 이 메소드에 접근 할 수 있다는 의미
- static : 메소드에 `static`이 지정되어 있는 경우 이 메소드는 인스턴스 생성없이 실행 할 수 있음을 의미
- void : 메소드의 리턴값이 없음을 의미
- String : 문자열을 나타내는 자바의 자료형
- args[] : `String` 자료형에 대한 변수명으로 args 뒤에 []가 있으므로 한 개가 아닌 여러개의 값으로 이루어진 배열을 의미
- System.out.println : 표준출력으로 데이터를 보내는 자바의 내장 메소드로 println 메소드로 들어오는 문자열 값을 화면에 출력
- public static void main(String[] args) : 프로그램 시작지점을 의미하는 함수. 자바 언어의 규칙
- 기본적으로 문장의 끝에 `;`을 붙여야 함.

### 팁

- 처음에는 위 코드를 통째로 외우는 것을 추천
- IntelliJ 치트키 : psvm, sout

## 주석

```java
// 한줄주석

/* 범위주석 */

/**
 * JavaDoc 주석
 */
```

## 변수

### 변수란

```java
int a;
String b;
```

변수란 값을 저장할 수 있는 메모리의 공간을 의미한다. 위 코드와 같은 a, b를 변수(variable)라고 한다.

### 선언, 대입

변수는 `선언`, `대입` 2단계를 통해서 만들 수 있습니다.

- 선언 : [자료형 변수명] 이런 형식으로 선언

```java
int age;
String name;
```

- 대입 : 할당 기호(=)를 통해서 값을 대입

```java
age = 11;
name = "ethan";
```

- 선언 + 대입 동시도 가능

```java
int age = 11;
String name = "ethan";
```

### 변수명

변수의 이름은 개발자가 마음대로 지을 수 있다. 위의 예처럼 a,b 라는 이름으로 지을 수도 있고, 아래와 같이 one, two 라는 이름으로도 지을 수 있다.

```java
int one;
String two;
```

단, 변수의 이름을 지을 때는 다음과 같이 지켜야 할 몇가지 규칙이 있다.

- 변수명은 숫자로 시작할 수 없다.
- `_`와 `$` 문자 이외의 특수문자는 사용할 수 없다.
- 자바의 키워드는 변수명으로 사용할 수 없다. (예: int, class, return 등)

## 타입

데이터의 종류를 의미한다. 자바는 크게 Primitive 타입과 Reference 타입 2가지로 나뉜다.

![Java Type Graph](https://static.javatpoint.com/images/java-data-types.png)

### Boolean

```java
boolean var1 = true;
boolean var2 = false;
```

참과 거짓을 의미한다. 타입에는 `boolean`이 있으며 값으로 `true`, `false` 2가지를 사용할 수 있다.

### Character

```java
char var = 'a';
```

문자 하나를 의미한다. 문자열이 아님에 주의하자. 타입에는 `char`가 있으며, 값으로 할당하는 문자는 `''`로 감싸서 사용해야 한다.

### Integer

```java
byte var1 = 1;
short var2 = 2;
int var3 = 3;
long var4 = 4;
```

정수를 의미한다. `byte`, `short`, `int`, `long` 이렇게 4가지 타입이 존재한다. 일반적으로는 `int`타입을 사용한다.

각각의 타입의 크기와 범위는 다음과 같다.
|타입| 크기 | 범위|
|--|--|--|
|byte|1byte|-127 ~ 128|
|short|2byte|-32767 ~ 32768|
|int|4byte|-2147483649 ~ 2147483648|
|long|8byte|-9223372036854775808 ~ 9223372036854775807|

타입이 여러개인 이유는 메모리를 효율적으로 사용하기 위해서이다. 사용하려는 숫자의 범위를 고려해서 타입을 선택한다.

### Floating-point

```java
float var1 = 0.1;
double var2 = 1.2;
```

소수를 의미한다. `float`, `double` 이렇게 2가지 타입이 존재한다. 일반적으로 `double` 타입을 사용한다.

각각의 타입의 크기와 범위는 다음과 같다.
|타입| 크기 | 범위|
|--|--|--|
|float|4byte|1.40239846E-45f ~ 3.40282347E+38f|
|double|8byte|4.94065645841246544E-324 ~ 1.79769313486231570E+308|

### String

```java
String var1 = "buzzcamp";
String var2 = "Ethan";
```

문자열을 의미한다. 타입에는 `String`이 있으며, 값으로 할당하는 문자는 `""`로 감싸서 사용해야 한다.

### Array

자료형의 집합을 의미한다.

#### 배열의 생성

```java
boolean[] var1 = new boolean[1];
char[] var2 = new char[2];
byte[] var3 = new byte[3];
short[] var4 = new short[4];
int[] var5 = new int[5];
long[] var6 = new long[6];
float[] var7 = new float[7];
double[] var8 = new double[8];
```

자료형 다음 `[]` 기호를 붙여서 사용한다. 할당 할 때 최초에 크기를 지정해주어야 한다.

#### 배열의 접근

```java
String[] weeks = new String[7];
weeks[0] = "월";
weeks[1] = "화";
weeks[2] = "수";
weeks[3] = "목";
weeks[4] = "금";
weeks[5] = "토";
weeks[6] = "일";
```

변수명에 `[인덱스]`를 붙여서 데이터에 접근한다.

## 연산자

- 산술 : +, -, *, /, %
- 부호 : +, -
- 문자열 : +
- 대입 : =, +=, -=, *=, /=, %=
- 증감 : ++, --
- 비교 : ==, !=, >, <, >=, <=

## 조건문

조건에 따라서 코드를 실행시키거나 않기를 원할 때 사용한다.

### if

```java
if (true) {
    System.out.println("참인 경우에 if 문 안쪽의 코드가 실행됩니다.");
}

if (false) {
    System.out.println("거짓이기 때문에 이 코드는 실행되지 않습니다.");
}
```

### switch

```java
int a = 1;
switch (a) {
    case 1:
        System.out.println("a가 1이므로 이 코드가 실행됩니다.");
        break; // break 를 꼭 붙여줍시다.
    case 2:
        System.out.println("a가 2였다면 이 코드가 실행됩니다.");
        break;
    default:
        System.out.println("a가 case에 있는 값이랑 매칭을 못했을 경우 이 코드가 실행됩니다.);
}
```

## 반복문

비슷한 코드를 여러번 반복해야 할 경우 간단하게 작성하기 위해서 사용한다.

### for

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i : " + i);
}
/*
 출력결과
 i : 0
 i : 1
 i : 2
 i : 3
 i : 4
 i : 5

*/
```

### while

```java
int i = 0;
while (i < 5) {
    i++;
    System.out.println("i : " + i);
}
/*
 출력결과
 i : 1;
 i : 2;
 i : 3;
 i : 4;
 i : 5;
*/
```

## 강의자료

[시즌1 강의자료](https://docs.google.com/presentation/d/1ai3zJmDY3m-P2ahKwrbapUetf1yTc5Zm1Wm6w3XNCi8/edit?usp=sharing)