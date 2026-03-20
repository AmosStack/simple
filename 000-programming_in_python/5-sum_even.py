def sum_even_numbers(my_list):
    """returns the sum of all the even nunmbers in a list of integers."""
    sum=0
    for num in my_list:
        if num % 2 == 0:
            sum += num
    return sum

if __name__ == "__main__":
    my_list = [1,2,3,4,5,6,7,8,9,10]
    sum_even = sum_even_numbers(my_list)
    print(f"the sum of even number in {my_list} is: {sum_even}")