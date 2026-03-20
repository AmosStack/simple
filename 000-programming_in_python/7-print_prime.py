#to declare is_prime(number): that will check if entered numbered is prime or not
def is_prime(number):

    if number==0 and number==1:

        return False

    elif number > 1:

        for i in range (2,number):

            if (number%i==0):

                return False

        else:
            return True

    else:

        return False


#Calling statement for is_prime() with an argument of 5
if __name__=="__main__":
    print(is_prime(8))


























