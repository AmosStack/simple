class Rectangle:
    
    def __init__(self, length, width):
        self.length = length
        self.width = width
        
    def area(self):
        return self.length * self.width
    
    def perimeter(self):
        return self.length + self.width
    
REC_1 = Rectangle(2,6)
REC_2 = Rectangle(5,6)

print("area: ", REC_1.area())
print("perimeter: ", REC_2.perimeter())
