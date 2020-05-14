print ("Holaaa")

#Documentar ejemplo

""" [Ejemplo tema 1 variables]
    Python es un lenguaje debilmente tipado
"""
x = 5
y = "Sebastian"

print (x)
print (y)

myvar = "Pepitas"
my_var = 2
VARIABLE_MAYUSCULA = 5

X, Y, Z = "Paula", "Gissel", "Sebastian"

print (X)
print (Y)
print (Z)

#Global variables
pi = "Rusia"
def myfunc():
    print ("El pais mas grande del mundo es " +pi)

myfunc() #Llamada de funcion

#Local and Global variable
papa = "usain Bold"#Global
def familia():
    mama = "maria Antioneta"#Local
    print ("Mi Papa es "+papa)
    print ("Mi mama es "+mama)

familia()
print ("Mi Papa es "+papa)

carros ="Chevrolet"
def ventas():
    global precio 
    precio = 2
ventas()
print (precio)

x = "Hola mundo"
y = 20
z = 25.3
pal = 8j
cal = ["Apple","Banana", "Cherry"]
var = range(6)
Sebastian = True
var2 = b"Hello"
var3 = memoryview(bytes(5))

print (type(x))
print (type(y))
print (type(z))
print (type(pal))
print (type(cal))
print (type(var))
print (type(Sebastian))
print (type(var2))
print (type(var3))

a = 1 #int
b = 2.8 #Float
c = 76j #Complex

print (type(a))
print (type(b))
print (type(c))

#Convert form int to float
d = float(a)
print(type(d))

#Convert form float to int
e = int(b)
print(type(e))

#Convert form int to complex
f = complex(a)
print(type(f))

"""[Random number]
"""
import random
numAleatorio = random.randrange(1,10)
print (numAleatorio)

"""[String are arrays]
"""
a = "Hola"
print (a)

print ("Hola")

oracion =""" pruebas jaskjasdkjasdkjasdkjsdjdkjsakdnaksdnkadsaksdnasdkasndkdsnasan"""

print(oracion)

a = "Sebastian Rodriguez parra"

print (a[0])
print (a[10])
print (a[18])