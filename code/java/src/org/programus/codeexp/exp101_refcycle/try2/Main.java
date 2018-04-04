package org.programus.codeexp.exp101_refcycle.try2;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    SomeClass a = new SomeClass("a");
    SomeClass b = new SomeClass("b");
    a.setRef(b);
    b.setRef(a);
    a = null;
    b = null;
    System.gc();
    Thread.sleep(200);
  }
}
