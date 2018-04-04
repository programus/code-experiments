package org.programus.codeexp.exp101_refcycle.try4;

import java.lang.ref.WeakReference;

public class Main {
  public static void main(String[] args) {
    SomeClass self = new SomeClass("self");
    self.setRef(self);
    WeakReference<SomeClass> wr = new WeakReference<>(self);
    System.out.println(self);
    System.out.println("--");
    System.out.println(wr.get());
    System.out.println("--");
    self = null;
    System.gc();
    System.out.println(wr.get());
    System.out.println("--");
  }
}
