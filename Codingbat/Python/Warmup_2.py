__author__ = 'Oleksandr Pylkevych'


def string_times(str, n):
    return str * n


def front_times(str, n):
    if len(str) < 3:
        return str * n
    return str[:3] * n


def string_bits(str):
    result = ""
    for s in range(len(str)):
        if s % 2 == 0:
            result = result + str[s]
    return result


def string_splosion(str):
    if len(str) < 2:
        return str
    sum_str = ''
    for i in range(len(str)):
        sum_str += str[:i]
    return sum_str + str[:]


def last2(str):
    if len(str) < 2:
        return 0

    last2 = str[len(str) - 2:]
    count = 0

    for i in range(len(str) - 2):
        sub = str[i:i + 2]
        if sub == last2:
            count += 1

    return count


def array_count9(nums):
    count = 0
    for i in range(len(nums)):
        if nums[i] == 9:
            count += 1
    return count


def array_front9(nums):
    if len(nums) >= 4:
        for i in range(0, 4):
            if nums[i] == 9:
                return True
    if (len(nums)) < 4 and (9 in nums):
        return True
    return False


def array123(nums):
    # Note: iterate with length-2, so can use i+1 and i+2 in the loop
    for i in range(len(nums) - 2):
        if nums[i] == 1 and nums[i + 1] == 2 and nums[i + 2] == 3:
            return True
    return False


def string_match(a, b):
    shorter = min(len(a), len(b))
    count = 0

    for i in range(shorter - 1):
        a_sub = a[i:i + 2]
        b_sub = b[i:i + 2]
        if a_sub == b_sub:
            count += 1

    return count
