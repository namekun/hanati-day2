# 20180817 hanati-day2

#### *editpad++를 설치하지않았기에 eclipse로 돌리겠습니다. 아이고 편해!*

## 데이터 타입 어제에 이어서.

### 문자형

* char형은 비 영어권 문자를 처리할 수 있도록 유니코드를 지원한다.
* 0~2^16-1(0 ~ 65535)사이의 값을 가질 수 있다 
* 문자 상수는 작은 따옴표 (' ') 안에 넣어야한다.
* char 형에는 모니터, 프린터 같은 주변기기를 제어하는데 사용하는 제어 문자와 인용부호(“”) 안에서 표현될 수 없는 특수한 문자(“, ‘, \)를 표현하는데 사용되는 이스케이프(Escape) 문자가 있다. 

| 구분           | 표기                                        | 설명                             |
| :------------- | ------------------------------------------- | -------------------------------- |
| 제어문자       | ‘\n’                                        | 줄을 바꾼다(New   Line)          |
| ‘\r’           | 현재행의   처음으로 이동(Carriage   Return) |                                  |
| ‘\t’           | 일정한 간격을 띄운다(Tab)                   |                                  |
| ‘\b’           | 한 칸 후진한다(Backspace)                   |                                  |
| ‘\f’           | 새 페이지로 넘긴다(Form   Feed)             |                                  |
| 이스케이프문자 | ‘\’’                                        | ’문자를 출력한다(Single   Quote) |
| ‘\”’           | ”문자를 출력한다(Double   Quote)            |                                  |
| ‘\\’           | \문자를 출력한다(Backslash)                 |                                  |

```java
package Fundamental;

/**
 * 자바 데이터 유형 테스트  
 */

class DataTypeExample{
	public static void main(String[] args){
		boolean flag = true; //false
		System.out.println(flag);
		//boolean flag2 = 10; // error
		
		//char
		char x = '\uD55c'; // '한'
		char y = '\uAE00'; // '글'
		
		System.out.println(x);
		System.out.println(y);
		
		//제어문자
		System.out.println("madeon is \nbest\t!\t!\t!");
		System.out.println("\"fucking\" java....");
	}
}
```

---

### 정수형

* byte - 1byte의 크기로 -27 ~ 27 -1(-128 ~ 127) 사이의 값을 가질 수 있다.
* short - 2byte의 크기로 -2^15 ~ 2^15 -1(-32768 ~ 32767) 사이의 값을 가질 수 있다 
* int - 4byte의 크기로 -2^31 ~ 2^31 -1(-2147483648 ~ 2147483647) 사이의 값을  가질 수 있다 
* long - 8byte의 크기로 -2^63 ~ 2^63 -1(-9223372036854775808 ~ 9223372036854775807) 사이의 값을 가질 수 있다 
* 주의사항
  * 변수 범위를 초과해서 상수를 할당할 수 없다
    * 예) byte b = 128; // 컴파일 에러
  * long 값을 할당하려면 접미사 ‘L’ 또는 ‘l’을 사용해야 한다
    * 예) long l = 2147483648L
```java
//byte, short, int, long
long money = 50000000L;
System.out.println(money);
System.out.print(money);
System.out.printf("%d\n", money);
```

---

### 실수형

* float - 4byte의 크기로 -2^31 ~ 2^31 -1(-3.40292347e38 ~ +3.40292347e38) 사이의 값을 가질 수 잇다.
* double - 8byte의 크기로 §-2^63 ~ 2^63-1(-1.79769313486231570308 ~ +1.79769313486231570308) 사이의 값을 가질 수 있다 
* 주의사항
  * 실수형 상수의 경우 기본적으로 double형으로 취급하기 때문에 float형으로 표현하려면 접미사 ‘F’ 또는 ‘f’를 사용해야 한다
```java
float pi = 3.141592;  // 컴파일 에러
float pi = 3.141592F;
double pi = 3.141592;
```
---
### JAVA의 출력방식 3가지
```java
System.out.println(money);
System.out.print(money);
System.out.printf("%d", money); // 출력의 형식을 지정해서 내보내는 방법
```

---

### 연산자(Operator)

* 종류
  * 산술 연산자(+, -, *, /, %)
  * 대입 연산자(=)
  * 복합 대입 연산자(+=, -=, *=, /=, %=) 
  * 형변환 연산자((DataType))
  * 증감 연산자(++, --)
  * 비교 연산자(>, >=, <, <=, ==, !=, instanceof)
  * 비트 연산자(&, |, ^, ~)
  * 논리 연산자(&&, ||, !)
  * 조건 삼항 연산자( ? : )
  * 배열 연산자([])
  * 메소드 연산자(())

---

### 산술연산자

- '+' 연산자는 자바의 연산자 오버로딩(overloading)을 지원한다.

```java
int x = 10 + 20; // 덧셈 가능
String name = "kijung" + "kim"; // 연결 가능
String info = "김기정: " + 30 + 10; // 정수를 문자열로 형 변환 후 연결
```

*Fundamental/Operator.java*

```java
package Fundamental;

public class Operator {
	public static void main(String[] args) {
		// 산술 연산자
		int x = 10 + 20; // 덧셈 가능
		String name = "kijung" + "kim"; // 연결 가능
		String info = "result: " + 30 + 10; // 정수를 문자열로 형 변환 후 연결
		
		System.out.println(x);
		System.out.println(name);
		System.out.println(info);
		
		int x1 = 50;
		int y = 20;
		
		System.out.printf("%d\n", (x1 + y));
		System.out.printf("%d\n", (x1 - y));
    }
}
```

*복합 대입 연산자*

```java
int x = 1
x += 1
System.out.print(x);
x-=1
System.out.print(x);
x*=1
System.out.print(x);
x/=1
System.out.print(x);
x%=1
System.out.print(x);
...
```

---

### 형 변환 연산자

- 형변환은 자동으로 발생, 또는 사용자에 의해 명시적으로 발생할 수 있다.

- 자동 형변화(Promotion) - Up Casting

  - 작은 데이터 타입에서 큰 데이터 타입으로의 형변환은 자동적으로 이루어진다.

  - 데이터의 손실이 발생하지 않는다.

```java
int j = 5; double result = 160.0 + j;
int I = 10;   System.out.println(“i = “ + i); 
```

- 강제 형변화(Demotion) - Down Casting

  - 큰 데이터 타입에서 작은 데이터타입으로 형변환 하려면 형변환 연산자('(datatype)')를 사용해야 한다.
  - 데이터의 손실이 발생할 수 있다.
  - 실수를 정수로 출력하고자 할 경우 주로 사용한다.

```java
double s1 = 170.234; int s2 = (int)s1; System.out.println(S2);
// 8바이트 중 앞의 4바이트를 버리고 뒤의 4바이트만 사용함.
```

---

### 증감연산자

- ++ & --
  - 주의사항
	* ++, -- 연산자가 변수의 앞에 붙느냐, 뒤에 붙느냐에 따라 결과값이 다르기 때문에 앞뒤의 문맥을 잘 파악해야 한다
		* 연산자가 앞에 붙을 경우
			* 변수의 값이 사용되기 전에 변수의 값을 1 증가 또는  감소 시킨다
		* 연산자가 뒤에 붙을 경우
				* 변수의 값이 사용 된 후에 변수의 값을 1 증가 또는  감소 시킨다

---

### 비교 연산자

* 두개의 값을 비교한 후에 결과로 true 또는 false 값을 반환한다.

  * 기본적인건 알고, instance of

```java
  op1 instanceof 클래스
  // op1이 클래스의 인스턴스인 경우 true
```

---

### 비트연산자

* 다음 예시를 보고 어떤건지 감을 잡아보자

```java
// 비트연산자
x = 10;
System.out.println(x * 2 * 2 * 2);
x = 10;
System.out.println(x << 3); // x * 2^3
x = 10;
System.out.println(x >> 3); // x / 2^3
```

---

### 논리연산자

* 피연산자의 값을 평가하여 결과로  true 또는 false값을 반환한다.

```java
op1 && op2 // op1, op2가 모두 true인 경우에만 true
op1 || op2 // op1 또는 op2 둘 중 하나이상이 true 인 경우에는 true
!op1 // op1이 true이면 false
```

* Short-circuit Logical Operator

```java
if(true || ???){…}
if(false && ???){…}
//if문의 ???부분은 전체 결과에 영향을 미치지 않기 때문에 ???부분은 수행되지 않음
// | <- 이건 over-loading연산자
```

---

### 조건 삼항 연산자

* 조건? 수식1:수식2;
  * 조건을 평가해서 true이면 수식1을, false이면 수식 2를 실행한다.
  * 조건문 (if) 대신에 대입 연산자와 함꼐 유용하게 사용한다.

```java
int a=2,b=3,c=1,max;
 max = (a > b)? a:b;
max = (max > c)? max : c;
System.out.printf("최대값은 %d 이다", max);
```

---

## 제어문

* 종류
  * 조건문 : if, switch
  * 반복문 : while, do-while, for
  * 이동문 : break, continue, return

---

## if문 실습 + Scanner 

```java
package day2_180817;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		int score = 99;
		System.out.println(score);
		
		// if
		if(score<100) {
			System.out.println("100점이 아니면 다 똑같습니다.");
		}
		
		// if-else
		if(score >= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		// if-else
		if(score % 2 == 0) {
			System.out.println("Even");
			if(score > 50) {
				System.out.println("점수 : " + score);
			}
		} else {
			System.out.println("Odd");
		}
		
		System.out.print("점수 : ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("수");
		} else if(score >= 80) {
			System.out.println("우");
		} else if(score >= 70) {
			System.out.println("미");
		} else if(score >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}	
	}
}

```

---

## switch 문 실습

```java
package day2_180817;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		int x = 4;

		switch (x) {
		case 1:
			System.out.println(x);
			break;
		case 2:
			System.out.println(x);
			break;
		case 3:
			System.out.println(x);
			break;
		case 4:
			System.out.println(x);
			break;
		case 5:
			System.out.println(x);
			break;
		default:
			System.out.println("해당하는 값이 없습니다.");
		}

		int x1 = 70, y = 25;

		System.out.print("연산자를 입력해주세요 :");
		Scanner sc = new Scanner(System.in);
		String opp = sc.next();

		switch (opp) {
		case "+":
			System.out.println(x + y);
			break;
		case "-":
			System.out.println(x - y);
			break;
		case "*":
			System.out.println(x * y);
			break;
		case "/":
			System.out.println(x / y);
			break;
		case "%":
			System.out.println(x % y);
			break;
		default:
			System.out.println("지원하지 않는 연산자입니다.");
		}
	}
}
```

---

## while문

* 주어진 조건이 만족되는 동안 반복해서 문장을 실행할 때 사용한다.

```java
package day2_180817;

public class WhileExample {
	public static void main(String[] args) {
		int x = 0;
		while (x < 10) { // x가 10보다 작으면 while문을 돌린다.
			System.out.println("kosta187th");
			x++;
		}
		x = 0;
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;
		
		while (x < 101) {
			if(x % 2 == 0) {
				evensum += x;
				sum += x;
			} else {
				oddsum += x;
				sum += x;
			}
			x++;
		}
		System.out.println("sum : " + sum);
		System.out.println("even sum : " + evensum);
		System.out.println("odd sum : " + oddsum);
	}
}
```

---

## for문

* 초기 변수 값을 설정하고, 이 변수의 값이 주어진 조건을 만족되는 동안 반복해서 문장을 실행할때 사용한다.
* 변수초기식을 여러 개 선언하고 증감식도 여러 개 선언할 수 있다
   for(변수초기식1, 변수초기식2,…;  조건식;  증감식1, 증감식2, …){}
* 모두 생략할 수 있다(무한반복)
   for( ; ; ){}
* 조건식을 제외한 변수초기식과 증감식을 생략할 수 있다(while문과 동일)
   for( ; 조건식; ){}
* 필요에 따라 중첩(내포)하여 사용한다

---

## city of star~ 

*ForMission.java*

```java
package day2_180817;

public class ForMission {

	public static void main(String[] args) {
		// 1. *이 차례대로 찍히는 for문 만들어보기

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}

		System.out.println();

		// 2. 1번 출력의 역순
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 3. 끝에서부터 *을 하나씩 추가로
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		// 4. 3번의 역순
		for (int i = 5; i > 0; i--) {
			for (int j = 4; j >= 0; j--) {
				if (i > j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		// 5. triangle
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 6.역삼각형
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 7. 모래시계
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 8. gugudan
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d, ", i, j, i * j);
			}
			System.out.printf("다음으로 넘어갑니다~\n");
		}
	}
}
```

---

## break & continue

* break  

  * 제어문(switch, while, for) 블록 내부에 위치하여 실행 흐름을 제어문 블록 밖으로 이동시킨다 

* Label?

  * 만일 break문 뒤에 레이블(Label)이 존재할 경우, 레이블이 선언된 제어문 블록 밖으로 이동시킨다.

    ```java
    OUT:
    whlile(true){
        while(true){
            break OUT;
        }
    } 
    ```

* continue  

  * 반복 제어문(while, for) 블록 내부에 위치하여 실행 흐름을 제어문 블록의 처음으로 이동시킨다. 
  * 레이블과 같이 사용될 경우 레이블이 선언된 제어문 블록의 처음으로 이동
  * 주로 반복문의 문장 중 특정 조건을 만족할 경우,  실행시키지 않을 문장을 위해 사용한다 
  * continue 뒤의 문장은 실행되지 않는다.

  ```java
  int k = 1;
  for(int i = 3 ; i < 100 ; i++){
         System.out.println(“여러 번 반복”);
         k++;
         if(k > 4){
                continue; 
         }
         System.out.println(“나도 반복”);  // k > 4 보다 커지면, 실행되지 않음.
  }
  ```

---

## return 문

* 메소드 블록 내부에 위치해, 실행 흐름을 메소드 블록 밖으로 이동시킨다.
* 즉, 현재 실행중인 메소드를 중단하고, 메소드를 호출한 곳으로 제어를 반환.
* main() 메소드에서 return문을 사용하면 프로그램이 종료된다.

```java
public static void main(String[] args){
     if(true){
          method();
          return;
     }
     System.out.println(“리턴”);
}

public static void method(){
     if(true) return;
     System.out.println(“method() 수행됨”);          
}
```

---

## Method(함수)란?

* 프로그램 개발 시 자주 사용하는 기능을 계속적으로 재사용하기 위해 하나의 독립된 모듈(실행코드 블럭)로 묶은것. - { } 사용
  * 프로그램 구성 단위로 프로그램의 **부품** 역할
* 장점?
  * 기능의 재사용성
    * 한번 정의된 함수는 필요할 때마다 사용(호출) 할 수 있어 동일한 코드의 반복을 줄일 수 있다.
  * 관리 및 수정의 용이성
    * 에러 발생 시 에러 요인을 빠르게 유추할 수 있으며, 유지보수가 수월하다.

```java
반환값의데이터타입 함수이름(매개변수(값을 받아오기 위한 변수)목록) { // 함수 선언문
	// 변수, 연산자, 제어문등을 이용한 함수 기능 구현 코드;		  // 함수 body
	// return [반환값];
}
```

* 반환값의 데이터 타입
  * 함수가 실행 된 후에 반환하는 값에 대한 반환(리턴)타입이다.
  * 리턴 값이 없을 경우에는 void 키워드를 지정
* 함수이름
  * 사용자가 정의하는 함수의 이름, 관례상 소문자로 시작한다.
* 매개변수(Parameter) 목록
  * 함수 사용(호출) 시 전달되는 값(전달인자:Argument)들을 입력받기 위한 변수를 선언한다.
* 리턴타입이 없는(void) 함수 호출
  * 함수이름(전달인자);
* 리턴 타입이 있는 함수 호출
  * 함수의 리턴타입과 같은 변수선언 = 함수이름(전달인자);

```java
package day2_180817;

public class FunctionExample {

	// 함수 정의
	static void printMessage(String name, String message) {
		System.out.println("[" + name + "] : " + message);
	}

	static int sum(int x, int y) {
		return x + y; // 값을 리턴해서 보내준다.
	}

	// JVM에 의해 최초 실행되는 엔트리포인트 main() 함수
	public static void main(String[] args) {
		// 함수 사용(호출)
		printMessage("kalid", "another one"); // 반환값 없음
		int result = sum(30, 50); // 반환값 있음
		System.out.println(result);
	}

}
```

*결과물*

```console
[kalid] : another one
100
```

---

## 구구단 예제

```java
package day2_180817;

import java.util.Scanner;

public class FunctionMisssion {

	static void printGugudan(int x) {
		for (int i = 2; i <= x; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();	
		}
		System.out.println("구구단이 끝났습니다.");
	}

	public static void main(String[] args) {
		
		System.out.print("원하시는 단까지 출력해줍니다. 번호를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		printGugudan(g);
	}

}
```

---

static이 왜 method앞에 쓰이면 클래스 메서드이다.

클래스 메서드는 호출방법 역시 클래스 변수처럼 객체를 생성하지 않고도, 'classname.methodname(parameter)'와 같은 식으로 호출가능.

어느때에 static을 사용해서 클래스 메서드로 정의해야하는가?

* 클래스는 '데이터(변수)'와 데이터에 관련된 메서드의 집합' 이라고 할 수 있다. 
* **같은 클래스 내에 있는 메서드와 멤버변수는 아주 밀접한 관계가 있다. 인스턴스 메서드는 인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드이다.**
* 그래서 **인스턴스 변수와 관계없거나(메서드 내에서 인스턴스 변수를 사용하지 않거나), 클래스 변수만을 사용하는 메서드들은 클래스 메서드로 정의한다.**
* 인스턴스 변수 뿐만 아니라 인스턴스 메서드를 호출하는 경우에도 인스턴스 메서드로 선언되어야한다. 인스턴스 메서드를 호출하는 것 역시 인스턴스 변수를 간접적으로 사용하는 것이기 때문이다.
