__author__ = 'Oleksandr Pylkevych'


def double_char(str):
    str_res = ''
    for i in range(len(str)):
        str_res += str[i] * 2
    return str_res


def count_hi(str):
    count = 0
    for i in range(len(str) - 1):
        if 'hi' in str[i:i+2]:
            count += 1
    return count


def cat_dog(str):
    count_cat = 0
    count_dog = 0

    for i in range(len(str) - 1):
        if 'cat' in str[i:i+3]:
            count_cat += 1
        if 'dog' in str[i:i+3]:
            count_dog += 1
    return count_cat == count_dog


def count_code(str):
    code_count = 0
    for i in range(len(str) - 1):
        if 'co' in str[i:i+2] and 'e' in str[i+3:i+4]:
            code_count += 1
    return code_count


def end_other(a, b):
    return a.lower().endswith(b.lower()) or b.lower().endswith(a.lower())


def xyz_there(str):
    for i in range(len(str)):
        if str[i] != '.' and str[i+1:i+4] == 'xyz':
            return True
    if str[0:3] == 'xyz':
        return True
    return False
