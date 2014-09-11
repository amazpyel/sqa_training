__author__ = 'Oleksandr Pylkevych'


def cigar_party(cigars, is_weekend):
    if is_weekend:
        return cigars >= 40
    else:
        return 40 <= cigars <= 60


def date_fashion(you, date):
    if date <= 2 or you <= 2:
        return 0
    elif date >= 8 or you >= 8:
        return 2
    else:
        return 1


def squirrel_play(temp, is_summer):
    if is_summer:
        return 60 <= temp <= 100
    elif 60 <= temp <= 90:
        return True
    return False


def caught_speeding(speed, is_birthday):
    if speed <= 60 or speed <= 65 and is_birthday:
        return 0
    elif 61 <= speed <= 80 or speed <= 85 and is_birthday:
        return 1
    elif speed >= 81:
        return 2


def sorta_sum(a, b):
    if 10 <= (a + b) <= 19:
        return 20
    return a + b


def alarm_clock(day, vacation):
    if 1 <= day <= 5 and not vacation:
        return '7:00'
    elif 1 <= day <= 5 and vacation or (day == 0 or day == 6) and not vacation:
        return '10:00'
    elif day == 0 or day == 6 and vacation:
        return 'off'


def love6(a, b):
    return a == 6 or b == 6 or a + b == 6 or abs(a - b) == 6


def in1to10(n, outside_mode):
    if outside_mode:
        return n <= 1 or n >= 10
    return 1 <= n <= 10


def near_ten(num):
    return abs(10 - num % 10) <= 2 or num % 10 <= 2
