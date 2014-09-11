__author__ = 'Oleksandr Pylkevych'


def hello_name(name):
    return "Hello " + name + "!"


def make_abba(a, b):
    return a + b + b + a


def make_tags(tag, word):
    return "<" + tag + ">" + word + "</" + tag + ">"


def make_out_word(out, word):
    return out[0:2] + word + out[2:]


def extra_end(str):
    return str[-2:] * 3


def first_two(str):
    if len(str) < 2:
        return str
    return str[:2]


def first_half(str):
    return str[:len(str) / 2]


def without_end(str):
    return str[1:len(str) - 1]


def combo_string(a, b):
    if len(a) == 0:
        return b
    elif len(b) == 0:
        return a
    elif len(a) > len(b):
        return b + a + b
    return a + b + a


def non_start(a, b):
    return a[1:] + b[1:]


def left2(str):
    return str[2:] + str[:2]
