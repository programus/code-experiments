package org.programus.codeexp.exp001_refcycle.try5;

import java.lang.ref.WeakReference;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Object[] a = new Object[1];
    a[0] = a;
    WeakReference<Object[]> wr = new WeakReference<>(a);
    System.out.println(Arrays.toString(a));
    System.out.println("--");
    System.out.println(Arrays.toString(wr.get()));
    System.out.println("--");
    a = null;
    System.gc();
    System.out.println(Arrays.toString(wr.get()));
    System.out.println("--");
  }
}
