package org.programus.codeexp.exp101_refcycle.try4;

public class SomeClass {
  private String name;
  private SomeClass ref;

  public SomeClass(String name) {
    this.name = name;
  }

  public void setRef(SomeClass ref) {
    this.ref = ref;
  }

  public SomeClass getRef() {
    return ref;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format("SomeClass: %s", this.name);
  }
}
