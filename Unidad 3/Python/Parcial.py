

raiz.mainloop()

#importamos Tkinter
import tkinter as tk
import tkMessageBox
import Tkinter
#Creamos la ventana
raiz = tk.Tk()

#Captura de Datos

nota1 = tk.StringVar()
nota2 = tk.StringVar()
nota3 = tk.StringVar()
porcentaje1 = tk.StringVar()
porcentaje2 = tkStringVar()
porcentaje3 = tk.StringVar()

def calculo():
    
    total = (nota1*porcentaje1)+(nota2*porcentaje2)+(nota3*porcentaje3)
    
    if (total > 3):
        labelresultado= tk.Label(raiz, text = "Felicidades ya pasaste la materia y tu nota acumulada es ").place(x = 0, y = 240)
    
    
raiz.title("MIS NOTAS")
raiz.resizable(True,True)
raiz.config(bd = 5)
raiz.config(relief="sunken")
raiz.config(width="900", height ="900")

labelTitulo = tk.Label(raiz, text ="NOTAS").place(x= 300,y= 0)

primeranota = tk.Entry(raiz,textvariable = nota1).place(x=200,y=50)
labelNota1 = tk.Label(raiz, text = "Nota 1: ").place(x = 100, y = 50)
primeraporcentaje = tk.Entry(raiz,textvariable = porcentaje1).place(x=400,y=50)
labelporcentaje = tk.Label(raiz, text = "porcentaje: ").place(x = 300, y = 50)

segundanota = tk.Entry(raiz,textvariable = nota2).place(x=200,y=100)
labelNota2 = tk.Label(raiz, text = "Nota 2: ").place(x = 100, y = 100)
segundoporcentaje = tk.Entry(raiz,textvariable = porcentaje2).place(x=400,y=100)
labelporcentaje = tk.Label(raiz, text = "porcentaje: ").place(x = 300, y = 100)

terceranota = tk.Entry(raiz,textvariable = nota3).place(x=200,y=150)
labelNota3 = tk.Label(raiz, text = "Nota 3: ").place(x = 100, y = 150)
tercerporcentaje = tk.Entry(raiz,textvariable = porcentaje3).place(x=400,y=150)
labelporcentaje = tk.Label(raiz, text = "porcentaje: ").place(x = 300, y = 150)

botonCalcular = tk.Button(raiz,text='Calcular nota',width=20, command = calculo)
botonCalcular.place(x = 150, y = 200)

raiz.mainloop()
