
/**
*  Laboratorio 1 POO python
*  Por: Jerónimo Hoyos Botero
*/

#include <iostream> 
#include <algorithm>
#include <cstdlib>
#include <ctime>
using namespace std;

void print_array(int* array, int n){
    for (int i = 0; i < n; i++){
        cout << array[i] << " ";
    }
}

int encontrar_maximo(int* arr, int n) {
    int max = arr[0];
    for (int i = 1; i < n; ++i) {
        if (arr[i] > max)
            max = arr[i];
    }
    return max;
}

int main(){
    int tamano;

    while (true) {
        cout << "Ingrese tamaño de lista menor o igual a 12: ";
        cin >> tamano;
        if (0 < tamano && tamano <= 12){break;};
    };

    int A[tamano],B[tamano],C[tamano*2];
    int valor,sumaAyB[tamano],productoAyB[tamano],pares_enterosA,sumaB,max,indice_max;

    for (int i = 0; i < tamano; i++){
        cout << "Ingrese valor entero para el índice " << i << " de A: ";
        cin >> valor;
        A[i] = valor;
    }
    
    srand(time(0));
    for (int i = 0; i < tamano; i++) {

        B[i] = rand() % 20 + 1; 
    }

    for (int i = 0; i < tamano; i++) {sumaAyB[i] = A[i] + B[i]; };

    for (int i = 0; i < tamano; i++) {productoAyB[i] = A[i] * B[i];};

    for (int i = 0; i < tamano; i++) {if(A[i]%2 == 0){pares_enterosA += A[i];}};

    sumaB=0;
    for (int i = 0; i < tamano; i++) {sumaB += B[i];};

    float promedioB = sumaB / tamano;

    for (int i = 0; i < tamano; i++) {
        C[i*2] = A[i];
        C[i*2+1] = B[i];
    };

    max = encontrar_maximo(C,tamano*2);

    for (int i = 0; i < tamano*2; i++) {
        if(max==C[i]){indice_max = i;}
    };
    
    cout << "Resultados";
    cout << "\n";
    cout << "Contenido del arreglo A: ";
    print_array(A,tamano);
    cout << "\n";
    cout << "Contenido del arreglo B: ";
    print_array(B,tamano);
    cout << "\n";
    cout << "Contenido del arreglo A + B: ";
    print_array(sumaAyB,tamano);
    cout << "\n";
    cout << "Contenido del arreglo A * B: ";
    print_array(productoAyB,tamano);
    cout << "\n";
    cout << "Suma enteros pares A: " << pares_enterosA;
    cout << "\n";
    cout << "Promedio del arreglo B: "<< promedioB;
    cout << "\n";
    cout << "Contenido del arreglo C: ";
    print_array(C,tamano*2);
    cout << "\n";
    cout << "El valor maximo del arreglo C es: "<< max << " el cual esta en el indice " << indice_max;

}