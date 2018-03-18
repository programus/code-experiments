package org.programus.codeexp.exp001_refcycle.try1;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    ClassA a = new ClassA("a");
    ClassB b = new ClassB("b");
    a.setRef(b);
    b.setRef(a);
    a = null;
    b = null;
    System.gc();
    Thread.sleep(200);
  }
}
