package day_15.sealed_demo;

public sealed class Parent permits Child {
}

// sealed , non-sealed , final
final class Child extends Parent {

}

//class Child1 extends Child {
//
//}

// Multi threading

