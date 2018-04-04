package org.programus.codeexp.exp101_refcycle.try3;

import java.lang.ref.WeakReference;

public class Main {
  public static void main(String[] args) {
    SomeClass a = new SomeClass("a");
    SomeClass b = new SomeClass("b");
    a.setRef(b);
    b.setRef(a);
    WeakReference<SomeClass> wra = new WeakReference<>(a);
    WeakReference<SomeClass> wrb = new WeakReference<>(b);

    System.out.println(a);
    System.out.println(b);
    System.out.println("--");
    System.out.println(wra.get());
    System.out.println(wrb.get());
    System.out.println("--");

    a = null;
    b = null;
    System.gc();

    System.out.println(wra.get());
    System.out.println(wrb.get());
    System.out.println("--");
  }
}
