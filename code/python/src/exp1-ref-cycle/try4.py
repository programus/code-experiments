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
    a.ref = weakref.proxy(b)
    b.ref = weakref.proxy(a)
    print(f'a: {a}, b: {b}')
    print(f'a.ref: {a.ref}, b.ref: {b.ref}')
    a = None
    b = None
    print('start gc...')
    gc.collect()
    print('all done')
