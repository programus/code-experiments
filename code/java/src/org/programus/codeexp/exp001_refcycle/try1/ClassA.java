package org.programus.codeexp.exp001_refcycle.try1;

public class ClassA {
  private String name;
  private ClassB ref;

  public ClassA(String name) {
    this.name = name;
  }

  public void setRef(ClassB ref) {
    this.ref = ref;
  }

  @Override
  protected void finalize() {
    System.out.println(String.format("%s is collected by gc.", this.name));
  }
}
