#importamos Tkinter
import tkinter as tk
import tkMessageBox
import Tkinter
#Creamos la ventana
raiz = tk.Tk()

lista_peliculas = list() #lista vacia
peliculas = {}           #diccionario vacio
 
 #Captura de Datos
datoPeli = tk.StringVar()
datoGen = tk.StringVar()
datoAnno = tk.IntVar()
datoResu = tk.StringVar()
datoLink = tk.StringVar()

impresion = StringVar()


def crearPelicula():
    #Creando una pelicula nueva (Vacio)
    peliculas = {} #pelicula nueva

    #Creando la pelicula con datos (Usuario)
    peliculas["Pelicula"] = datoPeli.get()
    peliculas["Genero"] = datoGen.get()
    peliculas["Año"] = datoAnno.get()
    peliculas["Resumen"] = datoResu.get()
    peliculas["Link"] = datoLink.get()
    
    #Poner la pelicula en la lista
    lista_peliculas.append(peliculas)
    
    #Mostrar peliculas en la listbox
    for peli in lista_peliculas:
        pelilista= peli['Pelicula'], peli["Genero"], peli["Año"], peli["Resumen"], peli["Link"]
    Lb1.insert(0,pelilista)

    #Limpiar los campos    
    datoPeli.set("")
    datoGen.set("")
    datoAnno.set("")
    datoResu.set("")
    datoLink.set("")

def modificarPelicula():
    peliculas = {} 
    #Modificamos la pelicula con datos (Usuario)
    peliculas["Pelicula"] = datoPeli.get()
    peliculas["Genero"] = datoGen.get()
    peliculas["Año"] = datoAnno.get()
    peliculas["Resumen"] = datoResu.get()
    peliculas["Link"] = datoLink.get()
    
    #Poner la pelicula en la lista
    lista_peliculas.append(peliculas)
    #Seleccion de la pelicula a modificar
    x = Lb1.curselection()
    #Mostrar los datos de la peliculas
    for peli in lista_peliculas:
        pelilista= peli["Pelicula"], peli["Genero"], peli["Año"], peli["Resumen"], peli["Link"]
    Lb1.delete(x)
    Lb1.insert(x,pelilista)
    #Limpiar los campos
    datoPeli.set("")
    datoGen.set("")
    datoAnno.set("")
    datoResu.set("")
    datoLink.set("")

#Borrar Toda la lista
def borrarTodo():
    Lb1.delete(0,1000) 
    
#Borrar Seleccion
def borrarSeleccion():
    x = Lb1.curselection()
    Lb1.delete(x)        
    
#Contenido
raiz.title("MIS PELICULAS FAVORITAS")
raiz.resizable(False,False)#Bloquear el tamaño
raiz.config(bd = 5)
raiz.config(relief="sunken")
raiz.config(width="1000", height ="900")

#Datos

labelTitulo = tk.Label(raiz, text ="PELICULAS").place(x= 300,y= 0)

cuadroNombre = tk.Entry(raiz,textvariable = datoPeli).place(x=200,y=50)
labelNombre = tk.Label(raiz, text = "Pelicula: ").place(x = 50, y = 50)

cuadroGenero = tk.Entry(raiz, textvariable = datoGen).place(x=200,y=80)
labelGenero = tk.Label(raiz, text = "Genero: ").place(x = 50, y = 80)

cuadroAnno = tk.Entry(raiz, textvariable = datoAnno).place(x=200,y=110)
labelAnno = tk.Label(raiz, text = "Año de Estreno: ").place(x = 50, y = 110)

cuadroResumen = tk.Entry(raiz, textvariable = datoResu).place(x=200,y=140)
labeResumen = tk.Label(raiz, text = "Resumen: ").place(x = 50, y = 140)

cuadroLink = tk.Entry(raiz, textvariable = datoLink).place(x=200,y=170)
labeLink = tk.Label(raiz, text = "Trailer: ").place(x = 50, y = 170)

labellistaTitulo = tk.Label(raiz, text = "Listado de peliculas").place(x = 250, y = 210)

#Creacion de la lista
Lb1 = tk.Listbox(raiz,  width=122, height=40)
Lb1.place(x = 0, y = 240) 

#Funcion para eliminar    
def fnOnclickListBox(evento):
    print("Click:",evento,evento.type,evento.state)
    print("Click en Listbox")
    print ("Elementos Seleccionados",Lb1.curselection())

#Enlaza el evento Select Listbox
Lb1.bind("<<ListboxSelect>>", fnOnclickListBox)  

#Botones
botonCrear = tk.Button(raiz,text='Crear Registro',width=20, command = crearPelicula)
botonCrear.place(x = 380, y = 40)

botonBorrarTodo = tk.Button(raiz,text='Borrar Todo',width=20, command = borrarTodo)
botonBorrarTodo.place(x = 380, y = 80)

botonBorrarTodo = tk.Button(raiz,text='Borrar Seleccion',width=20, command = borrarSeleccion)
botonBorrarTodo.place(x = 380, y = 120)

botonBorrarTodo = tk.Button(raiz,text='Modificar Seleccion',width=20, command = modificarPelicula)
botonBorrarTodo.place(x = 380, y = 160)

#Inicia la ventana (permite que no se cierre)
raiz.mainloop()

