"""
lista_peliculas = list() #lista vacia
peliculas = {}           #diccionario vacio

def crearPelicula():
    #Creando una pelicula nueva (Vacio)
    peliculas = {} #pelicula nueva
    
    #Creando la pelicula con datos (Usuario)
    peliculas["Pelicula"] = input("Ingrese Pelicula: ")
    peliculas["Genero"] = input("Ingrese el genero: ")
    peliculas["Año"] = input ("Ingrese Año: ")
    peliculas["Resumen"] = input ("Ingrese un Resumen: ")
    peliculas["Link"] = input ("Ingrese el link del trailer: ")
    
    #Poner la pelicula en la lista
    lista_peliculas.append(peliculas)
    
def listar_todos():
    print ("Listado de peliculas")
    for peli in lista_peliculas:
        print(peli["Pelicula"], "-", peli["Genero"],"-",peli["Año"],"-",peli["Resumen"],"-",peli["Link"])
    
def main():  
    while(True):
        print("1. - Crear peliculas")
        print("2. - Ver las peliculas")
        print("3. - Salir")
        
        opcion = input("Ingrese opcion: ")
        
        if (opcion == "1"):
            crearPelicula()
        elif (opcion == "2"):
            listar_todos()
        elif (opcion == "3"):
            break  
    
main()

from Tkinter import *
import tkFont
# using grid
# +------+-------------+
# | btn1 |    btn2     |
# +------+------+------+
# | btn3 | btn3 | btn4 |
# +-------------+------+
root = Tk()
# tkFont.BOLD == 'bold'
helv36 = tkFont.Font(family='Helvetica', size=36, weight=tkFont.BOLD)
btn1 = Button(text='btn1', font=helv36)
btn2 = Button(text='btn2', font=helv36)
btn3 = Button(text='btn3', font=helv36)
btn4 = Button(text='btn4', font=helv36)
btn5 = Button(text='btn5', font=helv36)
root.rowconfigure((0,1), weight=1)  # make buttons stretch when
root.columnconfigure((0,2), weight=1)  # when window is resized
btn1.grid(row=0, column=0, columnspan=1, sticky='EWNS')
btn2.grid(row=0, column=1, columnspan=2, sticky='EWNS')
btn3.grid(row=1, column=0, columnspan=1, sticky='EWNS')
btn4.grid(row=1, column=1, columnspan=1, sticky='EWNS')
btn5.grid(row=1, column=2, columnspan=1, sticky='EWNS')

"""

import tkinter as tk

root = tk.Tk()
btn = tk.Button(root, bg='#000000', fg='#b7f731',relief='flat',text='hello button',width=20)
btn.pack()

root.mainloop()