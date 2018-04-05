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
    a = None
    print('all done')
