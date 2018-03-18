package org.programus.codeexp.exp001_refcycle.try2;

public class SomeClass {
  private String name;
  private SomeClass ref;

  public SomeClass(String name) {
    this.name = name;
  }

  public void setRef(SomeClass ref) {
    this.ref = ref;
  }

  @Override
  protected void finalize() {
    System.out.println(String.format("%s is collected by gc.", this.name));
  }
}
