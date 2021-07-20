package autotests;

import helpers.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstProgram extends TestBase {

	public static void main(String[] args){
		String[] langs = {"Java","#C", "Python", "PHP"};
		for(String l : langs){
			System.out.println("Я хочу выучить: " + l);
		}

		List<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("#C");
		for(int i = 0; i < languages.size(); i++){
			System.out.println("Я хочу вючить: " + languages.get(i));
		}

		List<String> language = Arrays.asList("java", "#C", "Python");
		for(String l : language){
			System.out.println("Я хочу вючить: " + l);
		}
	}



//	public static void main(String[] args){
//		String[] langs = {"Java","#C", "Python", "PHP"};
//		for(int i = 0; i < langs.length; i++){
//			System.out.println("Я хочу выучить: " + langs[i]);
//		}
//	}

	public static boolean isPrime(int n){
		int m = (int) Math.sqrt(n);
		for(int i = 2; i < m; i+=1){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
//
//	public static boolean isPrimeWhile(int n){
//		int i = 2;
//		while(i < n){
//			if(n % i == 0){
//				return false;
//			}
//			i++;
//		}
//		return true;
//	}

//  public static void main(String[] args) {
//		Square s = new Square(5);
//		System.out.println("Площадь квадрата со сторoной " + s.l + " = " + s.area());
//
//		Rectangle r = new Rectangle(4,6);
//		System.out.println("Площадь прямоугольника со сторoнами  " + r.a + " и " + r.b + " = " + r.area());
//	}

//	public static void main(String[] args) {
//			hello("world");
//			hello("Tatev");
//
//			double len = 5;
//		System.out.println("Площадь квадрата со сторoной " + len + " = " + area(len));
//
//		double x = 4;
//		double y = 6;
//		System.out.println("Площадь прямоугольника со сторoнами  " + x + " и " + y + " = " + area(len));
//	}

	//
//	public static double area(double a, double b) {
//		return a*b;
//	}
//
//	public static void hello(String somebody) {
//		System.out.println("Hello, " + somebody + "!");
//	}

//	public static void main(String[] args) {

//		String somebody = "world";
//		System.out.println("Hello, " + somebody + "!");

//		double число с плавающей точкой 16.0
//		double l = 4.0;
//		double s = l * l;
//		System.out.println("Площадь квадрата со сторoной " + l + " = " + s );

		//int только целое число
//		int l = 5;
//		int s = l * l;
//		System.out.println("Площадь квадрата со сторoной " + l + " = " + s );

// 		int l=8;
//		System.out.println("Площадь квадрата со сторoной " + l + " = " + ( l * l) );

//		System.out.println("Площадь квадрата со сторoной " + 6 + " = " + ( 6 * 6) );

//		System.out.println(2 + 2);
//		System.out.println(2 * 2);
//		System.out.println(2 / 2);
//		System.out.println(2 - 2);
//
//		System.out.println(1 / 2);
//		System.out.println(1.0 / 2);
//		System.out.println(1 / 2.0);
//		System.out.println(2.0 / 2);
//		//конкатонация
//		System.out.println("2" + "2");
//		System.out.println(2 + "2");
//		System.out.println("2" + 2);
//		System.out.println(2 + 2 * 2);
//		System.out.println((2 + 2) * 2);
//		System.out.println("2 + 2 = " + 2 + 2);
//		System.out.println("2 + 2 = " + (2 + 2));
//	}

}