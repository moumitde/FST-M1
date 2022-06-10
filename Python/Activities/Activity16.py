class Car:
    'this class represents a car'


    def __init__(self, manufacturer , model , make , transmission , color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color


    def accelerate(self):
        print(self.manufacturer +" "+self.model  ,"has started moving")


    def stop(self):
        print(self.manufacturer+" "+self.model , "has stopped")


car1 = Car("Toyota","Corolla","2015" , "manual" , "white")
car2 = Car("Suzuki","Maruti","2015" , "manual" , "white")
car3 = Car("Maruti","Corolla","2015" , "manual" , "white")

car1.accelerate()
car1.stop()