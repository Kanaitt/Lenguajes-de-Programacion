"""
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

"""Slicing (rebanar)
"""
a = "Sebastian Rodriguez Parra"
print (a[2:5])

#Longitud
a = "aeiou"
print (len(a))

a = "la vida es bella    "
print (len(a))#Longituud de la cadena
print (a.strip())#sin espacios al inicio o al final

print (a.lower())#minusculas
print (a.upper())#mayuscula

cadena = "Maria"
print (cadena.replace("M", "L"))

cadena2 = "diego, Carlos, pepe, juan, maria, laura"#String
#SubString
print(cadena2.split(","))

# in - Not in (Validaciones de una cadena)
txt = "aaa"
x = "ain" in txt
print (x)

oracion = """ padre nuestro  padre nuestro  padre nuestro papa
        """
txt = "papa" in oracion
print (txt)

txt = "La luz tiene una  velocidad de "
x = "luz" not in txt
print(x)

# format () insertar numeros en un string
age = 22
txt = "Jessica Gissell tiene {} años"
print (txt.format(age))

contagiados = 17000
muertos = 630
recuperdos = 1200
reporteNot = """La cantidad de contagiados es {} personas,
muertos son {} personas en Colombia y recuperados van {} pacientes
"""
print (reporteNot.format(contagiados,muertos,recuperdos))

"""[Boleans]
"""
print (10 > 9 )
print (10 == 9 )
print (10 < 9 )

print (bool("Sebastian Prueba"))
print (bool(15))

class myClass():
    def _len_(self):
        return 0

myObj = myClass()
print (bool(myObj))

def metodo2(): #def + nombre +()+:
    return True

print (metodo2())#invocar metodo para que me ejecute

# Ejemplo condicion 
def diego():
    return False

if diego():
    print ("si")
else:
    print("no")

"""[Condicionales anindados]
"""

nota1 = int (input("Ingrese la primera nota : "))
nota2 = int (input("Ingrese la segunda nota : "))
nota3 = int (input("Ingrese la tercera nota: "))
media = (nota1+nota2+nota3)/3

if media == 0 or media == 2:
    print("perdio")
elif media == 3:
    print ("Paso arrastrado")
elif media ==4 or media==5:
    print ("Paso")
else:
    print ("Nota mal calculada")

#Operaciones ternarias
a = 2000
b = 330

if a > b: print ("a is greater than b")

a = 2
b = 330
print ("A") if a > b else print("B")

a = 330
b = 330
print ("A") if a > b else print ("=") if  a == b else print ("B")

# While
i=1
while i<6:
    print (i)
    if i == 3:
        break
    i += 1

i=1
while i<6:
    i += 1
    if i == 3:
        continue
    print (i)

#for
for x in range (20,23):
    print (x)

"""Funciones}
"""
def suma (sum1, sum2):
    resul = num1+num2
    return resul

#llamada del metodo
almacena_resultao = suma(5,7)
print (almacena_resultao)
suma (5,7)
suma (10,15)
suma (9,12)

 
def myFunction() :
      return True
 
print(myFunction())
 
"""[CLases y objetos en Python]
   POO
"""
 
class Myclass: # crear clase
 x=2
 
 # crear un objeto /instancia
object1 = Myclass()
print(object1.x)

#_init_(Asigno valores o propiedades)

class Persona:
    def __init__(self, nombre, edad, correo):
        self.nombre = nombre
        self.edad = edad
        self.correo = correo
        self.list [Persona]

    def funcion2(self):
        print ("Hola mi nombre es "+self.nombre)

    def impuestoIVA(self):
        iva = 12
        costo = int(input("Cual es el valor del producto?"))
        calcular = (costo*iva)/100
        print ("El calculo del iva es :" + str(calcular))
        
objecto2 = Persona("Luis", 24,"@gmail")
objecto2 = Persona("Sebastian", 25,"@hotmail.com")
#objecto2.impuestoIVA()

print (objecto2.nombre)
print (objecto2.edad)
print (objecto2.correo)

objecto2.funcion2()

#set (modificar)

objecto2.nombre = "Rafael"
print (objecto2.nombre)

#Borrar un objeto
del objecto2

"""[Python COLLECTIONS]
1. LIST : Coleccion ordenada de elementos que pueden ser modificados (si duplicados)
2. TUPLE :Coleccion ordenada de elementos que NO pueden ser modificados (si duplicados)
3. Set: Coleccion desordenada no indexada (no acepta duplicas)
4. Dictionary: Coleccion de datos, desordenada, puede modificar (no duplicados)
"""
listaUno = ['Colombia','Venezuela','Canada','Rusia']
for i in listaUno:
    print(i)

for x in listaUno:
    print (x)
    if x == "Colombia":
        break
lista = ['a','e','i','o','u']
print (lista[1])
print (lista [1:3])
print (lista[:3])
print (lista[3:])
print (len(lista))

lista.append('z')
print (lista)

lista[0]='holi'
print (lista)

lista.remove("o")
print (lista)

lista.pop(2)
print (lista)

del lista

listaCelular = ['Nokia', 'Sony', 'Samsung']
copia = listaCelular.copy()
print (copia)

"""[Diccionario]
JSON (clave: valor)
"""
diccionarioDiego = {
    "Marca":"Ducati",
    "Modelo": "Iron",
    "Year" : 2000
}
print (diccionarioDiego)

if "Modelo" in diccionarioDiego:
    print ("yes is it found")

x = diccionarioDiego["Marca"]
print (x)

y = diccionarioDiego.get("Marca")
print (y)

diccionarioDiego["year"]=9999
print(diccionarioDiego)

diccionarioDiego["color"]= "Red"
print(diccionarioDiego)

diccionarioDiego.pop("Modelo")
print(diccionarioDiego)



Misxxx = {
    "Novia1": {
        "nombre1" : "Gissell",
        "duracion": 2000
    },
    "Novia2": {
        "nombre2": "Minina",
        "duacion":1999
    },
    "Novia3": {
        "nombre2": "bebe",
        "duacion":2252
    }
}

print (Misxxx)

"""[Interfaz Grafica en Python]
GUI
UX
Librerias:
Tkinter
Wxpython
pyQT
PyGTK

Web:
Django
"""

"""

class Pelicula:
    def __init__(self,pelicula):
        