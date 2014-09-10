__author__ = 'Oleksandr Pylkevych'


def monkey_trouble(a_smile, b_smile):
    return a_smile == b_smile


def sleep_in(weekday, vacation):
    return vacation or (weekday == vacation)


def sum_double(a, b):
    if a == b:
        return 2 * (a + b)
    return a + b


def diff21(n):
    if n <= 21:
        return 21 - n
    return 2 * (n - 21)


def parrot_trouble(talking, hour):
    return talking == True and (hour < 7 or hour > 20)


def makes10(a, b):
    return a == 10 or b == 10 or a + b == 10


def near_hundred(n):
    return (abs(100 - n) <= 10) or (abs(200 - n) <= 10)


def pos_neg(a, b, negative):
    if negative:
        return a < 0 and b < 0
    else:
        return (a < 0 < b) or (a > 0 > b)


def not_string(str):
    if 'not' in str[0:3]:
        return str
    return 'not ' + str


def missing_char(str, n):
    return str[0:n] + str[n + 1:len(str)]


def front_back(str):
    if len(str) <= 1:
        return str
    return str[-1] + str[1:len(str) - 1] + str[0]


def front3(str):
    if str <= 3:
        return str * 3
    return str[:3] * 3
