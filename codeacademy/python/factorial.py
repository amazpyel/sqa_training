def factorial(x):
    if x == 1:
        return x
    elif x == 0:
        return 1
    else:
        return x * factorial(x-1)
