#importamos Tkinter
import tkinter as tk
#Creamos la ventana
raiz = tk.Tk()

lista_peliculas = list() #lista vacia
peliculas = {}           #diccionario vacio

def crearPelicula():
    #Creando una pelicula nueva (Vacio)
    peliculas = {} #pelicula nueva
    
    #Creando la pelicula con datos (Usuario)
    peliculas["Pelicula"] = cuadroNombre
    peliculas["Genero"] = cuadroGenero
    peliculas["Año"] = cuadroAnno
    peliculas["Resumen"] = cuadroResumen
    peliculas["Link"] = cuadroLink
    
    #Poner la pelicula en la lista
    lista_peliculas.append(peliculas)
    
def listar_todos():
    print ("Listado de peliculas")
    for peli in lista_peliculas:
        print(peli["Pelicula"], "-", peli["Genero"],"-",peli["Año"],"-",peli["Resumen"],"-",peli["Link"])
        
#Contenido
raiz.title("MIS PELICULAS FAVORITAS")
#raiz.resizable(False,False)#Bloquear el tamaño
#raiz.config(bd = 5)
#raiz.config(relief="sunken")
raiz.config(width="500", height ="500")


#Datos

labelTitulo = Label(raiz, text ="PELICULAS").place(x= 0,y= 0)

cuadroNombre = Entry(raiz).place(x=120,y=50)
labelNombre = Label(raiz, text = "Pelicula: ").place(x = 50, y = 50)

cuadroGenero = Entry(raiz).place(x=120,y=80)
labelGenero = Label(raiz, text = "Genero: ").place(x = 50, y = 80)

cuadroAnno = Entry(raiz, width=15).place(x=160,y=110)
labelAnno = Label(raiz, text = "Año de Estreno: ").place(x = 50, y = 110)

cuadroResumen = Entry(raiz).place(x=120,y=140)
labeResumen = Label(raiz, text = "Resumen: ").place(x = 50, y = 140)

cuadroLink = Entry(raiz).place(x=120,y=170)
labeLink = Label(raiz, text = "Trailer: ").place(x = 50, y = 170)

#botonCrear = tk.Button(raiz, Text = "Crear Registro", height=5, width=20)
#botonCrear.pack()

botonCrear = tk.Button(raiz, relief='flat',text='Crear Registro',width=20, command = crearPelicula)
botonCrear.place(x = 200, y = 200)

botonMostrar = tk.Button(raiz, relief='flat',text='Mostrar Registro',width=20, command = listar_todos)
botonMostrar.place(x = 200, y = 250)


#botonVer = Button(raiz, Text = "Ver Los Registros", command = istar_todos)
#Inicia la ventana (permite que no se cierre)
raiz.mainloop()

