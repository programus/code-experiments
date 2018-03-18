package org.programus.codeexp.exp001_refcycle.try3;

import java.lang.ref.WeakReference;

public class Main {
  public static void main(String[] args) {
    SomeClass a = new SomeClass("a");
    SomeClass b = new SomeClass("b");
    a.setRef(b);
    b.setRef(a);
    WeakReference wra = new WeakReference(a);
    WeakReference wrb = new WeakReference(b);
    System.out.println(a);
    System.out.println(b);
    System.out.println("--");
    a = null;
    b = null;
    System.out.println(wra.get());
    System.out.println(wrb.get());
    System.out.println("--");
    System.gc();
    System.out.println(wra.get());
    System.out.println(wrb.get());
    System.out.println("--");
  }
}
