package org.programus.codeexp.exp001_refcycle.try4;

import java.lang.ref.WeakReference;

public class Main {
  public static void main(String[] args) {
    Object[] a = new Object[1];
    Object[] b = new Object[1];
    a[0] = b;
    b[0] = a;
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
