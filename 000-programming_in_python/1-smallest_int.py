def get_smallest_integer(my_list):
    my_list=[18,-4,7,4,93]
    a=my_list[0] if my_list else None
    for num in my_list:
        if num<a:
            a=num
            return(a)
a=get_smallest_integer(0)
if get_smallest_integer=="_main_":
    a=get_smallest_integer(3)
print(a)
