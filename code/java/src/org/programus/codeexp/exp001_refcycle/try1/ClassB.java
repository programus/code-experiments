package org.programus.codeexp.exp001_refcycle.try1;

public class ClassB {
  private String name;
  private ClassA ref;

  public ClassB(String name) {
    this.name = name;
  }

  public void setRef(ClassA ref) {
    this.ref = ref;
  }

  @Override
  protected void finalize() {
    System.out.println(String.format("%s is collected by gc.", this.name));
  }
}
