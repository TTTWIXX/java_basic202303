package day08.poly;

class A {}
class B extends A{}
class C extends A {}
class D extends B{}
class E extends C{}
public class Basic {


    // 자식객체는 상속관계에 있는 상위타입을 사용할 수 있다.

   A X1= new A();
   A x2= new B();
   A x3= new C();
   B x4= new D();
   A x5= new E();

   void test(){
       int a=10;
       double b=a;

       B x =new B();
       A z =x; //작은 타입에서 큰타입으로 갈때는 오류 x
//       C y =z; //큰 타입에서 작은타입으로 갈때는 오류 x

   }

}
