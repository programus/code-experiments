#!/usr/bin/env python
# -*- coding: utf-8 -*-

import gc


class SomeClass:
    def __init__(self, name):
        self.name = name

    def __del__(self):
        print(f"{self.name} is dying")


if __name__ == '__main__':
    gc.disable()
    a = SomeClass('a')
    b = SomeClass('b')
    a.ref = b
    b.ref = a
    a = None
    b = None
    print('start gc...')
    gc.collect()
    print('all done')
