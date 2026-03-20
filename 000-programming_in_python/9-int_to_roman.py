#int_to_roman def...
def int_to_roman(n):

    #list of numbers and roman value that would be used to reference entered number into roman numerals
    numbers=[1,4,5,9,10,40,50,90,100,400,500,900,1000]
    roman=["I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"]

    # i=12 for total number of index in each  list above
    i=12

    roman_numerals=" "

    #while loop for interating entered number
    while n!=0:
        if numbers[i]<=n:
            roman_numerals+=roman[i]
            n=n-numbers[i]
        else:
            i=i-1
    return roman_numerals

#user input button
user=int(input("enter number:"))

#calling statement for int_to_roman() with an argument from user input button
if __name__=="__main__":
    print(int_to_roman(user))






















