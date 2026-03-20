#declaring def print_right_triangle(height):...
def print_right_triangle(height):

#for loop iteration of index i and and j forming a right angled triangle...

    for i in range(height):

        for j in range(i+1):
            print("*",end=" ")

        print("\n")

#def calling statement for print_right_triangle() with an argument of 5....
if __name__ =="__main__":
    print_right_triangle(5)

