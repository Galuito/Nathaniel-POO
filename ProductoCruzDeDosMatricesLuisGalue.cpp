//Producto cruz de dos matrices por Luis Galue
//Ambas matrices son capaces de alojar numeros reales

#include<iostream>
using namespace std;

int main(){
    float suma;
    float A[3][3];
    float B[3][3];
    float C[3][3];

	cout << "Comenzando el llenado de la matriz A" << endl;
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			cout << "A[" << i+1 <<"][" << j+1 << "]: "; cin >> A[i][j];
		}
		cout << endl;
	}
	
	cout << "Comenzando el llenado de la matriz B" << endl;
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			cout << "B[" << i+1 <<"][" << j+1 << "]: "; cin >> B[i][j];
		}
		cout << endl;
	}	
	
	//Calculando La matriz resultante C la cual es el Producto Cruz de A y B (AxB)
	//Desarrollar la logica detras de esto fue el mayor problema del programa
    for(int i = 0; i < 3; i++){
        for(int o = 0; o < 3; o++){
            suma = 0;
            for(int u = 0; u < 3; u++){
                suma += A[i][u] * B[u][o];
            }
            C[i][o] = suma;
        }
        
            
        
    }
	
	cout << "Imprimiendo la matriz resultante AxB: " << endl;
    for(int i = 0; i < 3; i++){
        for(int o = 0; o < 3; o++){
            cout <<"|" << C[i][o] << "| ";
        }
        cout << endl;
    }

    system("pause");


    return 0;
}
