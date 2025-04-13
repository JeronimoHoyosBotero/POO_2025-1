# /**
#  *  Laboratorio 1 POO python
#  *  Por: Jerónimo Hoyos Botero
# */
import random

while True:
    tamano = int(input("Ingrese tamaño de lista menor o igual a 12: "))
    if 0 < tamano and tamano <= 12:
        break
A = []
B = []

for i in range(tamano):
    valor = int(input("Ingrese valor entero para el indice " + str(i) + " de A: "))
    A.append(valor)

for i in range(tamano):
    valor = random.randint(1,20)
    B.append(valor)

suma_AyB = []

for i in range(tamano):
    valor = A[i] + B[i]
    suma_AyB.append(valor)

producto_AyB = []

for i in range(tamano):
    valor = A[i] * B[i]
    producto_AyB.append(valor)

pares_enterosA = 0

for i in range(tamano):

    if A[i]%2 == 0:
        pares_enterosA+=A[i]

promedio_B = sum(B)/tamano

C = []

for i in range(tamano):
    C.append(A[i])
    C.append(B[i])

maximo = max(C)

indice_max = C.index(maximo)


print("Resultados")
print("Contenido del arreglo A:", A)
print("Contenido del arreglo B:", B)
print("Contenido del arreglo A + B:", suma_AyB)
print("Contenido del arreglo A * B:", producto_AyB)
print("Suma enteros pares A:", pares_enterosA)
print("Promedio del arreglo B:", promedio_B)
print("Contenido del arreglo C:", C)
print(f"El valor máximo del arreglo C es: {maximo} el cual está en el índice {indice_max}")