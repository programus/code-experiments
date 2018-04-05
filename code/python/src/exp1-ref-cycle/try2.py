#!/usr/bin/env python
# -*- coding: utf-8 -*-

import weakref
import gc


class SomeClass:
    def __init__(self, name):
        self.name = name

    def __del__(self):
        print(f"{self.name} is dying")

    def __repr__(self):
        return f"SomeClass[{self.name}]"

    def __str__(self):
        return self.__repr__()


if __name__ == '__main__':
    gc.disable()
    a = SomeClass('a')
    b = SomeClass('b')
    a.ref = b
    b.ref = a
    print(f'a: {a}, b: {b}')
    wra = weakref.ref(a)
    wrb = weakref.ref(b)
    print(f'wra: {wra()}, wrb: {wrb()}')
    a = None
    b = None
    print('start gc...')
    gc.collect()
    print(f'wra: {wra()}, wrb: {wrb()}')
