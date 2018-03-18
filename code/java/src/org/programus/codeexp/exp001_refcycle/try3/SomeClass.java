package org.programus.codeexp.exp001_refcycle.try3;

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
  public String toString() {
    return String.format("SomeClass: %s", this.name);
  }
}
