#to declare def character_frequency():
def character_frequency(string):
   dict={}
   for i in string:
       if i in dict:
            dict[i]+=1
       else:
            dict[i]=1
   return dict

user=input("enter string..:")
#calling of def character_frequency() with argument....
if __name__=="__main__":
     print(character_frequency(user))