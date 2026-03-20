def find_first_occurance(my_list, num):
    """searches for the first occurance of an integer in a list and returns its index."""
    for i in range(len(my_list)):
        if my_list[i] ==num:
            return i
    return -1

if __name__== "__main__":
    my_list = [5,3,7,1,9,2,8]
num=8
index=find_first_occurance(my_list, num)
if index != -1:
        print(f"the first occurance of {num} in the list is at index  {index}.")
else:
        print(f"{num} is not in the list.")