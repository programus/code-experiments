package org.programus.codeexp.exp001_refcycle.try5;

import java.lang.ref.WeakReference;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Object[] a = new Object[1];
    a[0] = a;
    WeakReference wr = new WeakReference(a);
    System.out.println(wr.get());
    a = null;
    System.out.println(wr.get());
    System.gc();
    System.out.println(wr.get());
  }
}
