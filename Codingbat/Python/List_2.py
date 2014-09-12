__author__ = 'Oleksandr Pylkevych'


def count_evens(nums):
    count = 0
    for i in range(len(nums)):
        if nums[i] % 2 == 0:
            count += 1
    return count


def big_diff(nums):
    return max(nums) - min(nums)


def centered_average(nums):
    max_nums = nums[0]
    min_nums = nums[0]
    for i in range(len(nums)):
        if nums[i] > max_nums:
            max_nums = nums[i]
        if nums[i] < min_nums:
            min_nums = nums[i]
    return (sum(nums) - max_nums - min_nums) / (len(nums) - 2)


def sum13(nums):
    total = 0
    if len(nums) == 0:
        return 0
    i = 0
    while i < len(nums):
        if nums[i] != 13:
            if i == 0 or nums[i - 1] != 13:
                total += nums[i]
        i += 1
    return total


def sum67(nums):
    state = 0
    total = 0
    for n in range(len(nums)):
        if state == 0:
            if nums[n] == 6:
                state = 1
            else:
                total += nums[n]
        else:
            if nums[n] == 7:
                state = 0
    return total


def has22(arr):
    for i in range(1, len(arr)):
        if arr[i] == 2 and arr[i - 1] == 2:
            return True
    return False
