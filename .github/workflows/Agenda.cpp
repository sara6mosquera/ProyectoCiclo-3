#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#define localizar (struct nodo *) malloc(sizeof(struct nodo))

void Insertar(struct nodo **);
void Eliminar(struct nodo **);
void Buscar(struct nodo *);
void Imprimir(struct nodo *);

struct nodo
{
	struct nodo *ant;
	int Codigo;
	char Nombre [30];
	int Telefono;
	char Correo [31];
	struct nodo *sig;	
};

main (){
	
	struct nodo *P = NULL;
	int opc;
	do
	{
		printf("\n Programa de agenda\n");
		printf ( " \n |---------------------------------------------| " );
		printf ( " \n |                 ° Agenda °                  | " );
		printf ( " \n |---------------------|-----------------------| " );
		printf ( " \n |1. Insertar          | 3. Buscar y eliminar  | " );
		printf ( " \n |2. Buscar            | 4. Salir              | " );
		printf ( " \n |---------------------|-----------------------| " );
		printf("\n Seleccione una opcion:\n");
		scanf("%d", &opc);
		switch(opc)
		{
			case 1:
				Insertar(&P);
			break;
			
			case 2:
				Buscar(P);
			break;
			
			case 3:
				Eliminar(&P);
			break;
			
			case 4:
					printf("\n ¿De verdad desea salir? \n 1. Si\n 2.No");
					scanf("%d", &opc);
					if(opc == 1){
						opc = 4;
					}
			break;
			
		}
	}
	while(opc != 4);
	getchar();
}


void Insertar(struct nodo **P){
	
	int cod, tel;
	struct nodo *R, *S ,*T;
	char nom[30],correo[30];
	
	printf("\nDigite el codigo de la persona a ingresar: ");
	scanf("%d",&cod);
	fflush(stdin);
	printf("\nDigite el nombre  de la persona a ingresar: ");
	scanf("%[^\n]", &nom); 
	printf("\nDigite telefono de la persona a ingresar: ");
	scanf("%d",&tel);
	fflush(stdin);
	printf("\nDigite el correo de la persona a ingresar: ");
	scanf("%[^\n]", &correo); 
	
	if(*P == NULL){
		
   	 	R = localizar;
   		R->Codigo = cod;
		strcpy(R->Nombre ,nom);
  		R->Telefono = tel;
  		strcpy(R->Correo ,correo);
		R->sig = NULL;
		R->ant = NULL;
		*P = R;
		
		}else{
			
			R = *P;
			S = localizar;
			S->Codigo = cod;
			strcpy(S->Nombre ,nom);
  			S->Telefono = tel;
  			strcpy(S->Correo ,correo);
  			if(cod< R->Codigo){
			
				S->sig = NULL;
				S->ant = NULL;
				*P = S;

			}else{
				
				while(R != NULL && (R->Codigo != cod)){
					if(R->sig == NULL){
						
						R->sig = S;
						S->ant = S;
						S->sig = NULL;
						
					}else{
						
						if(cod < R->sig->Codigo){
							
						T = R->sig;
						S->sig = T;
						T->ant = S;
						R->sig = S;
						S->ant = R;
						
						}else{
							R = R->sig;
						}
					}
				}
			}	
		}
		
		Imprimir(*P);	
}

void Eliminar(struct nodo **P){
	
	int dato;
	bool  a = false ;
	struct nodo *R, *S;
		
	if(*P == NULL){
		
		printf("\n Lista Vacia\n");
	
	}else{
		
		R = *P;
		printf("\nDigite el codigo que va a eliminar: ");
		scanf("%i", &dato);		
		while((R->Codigo != dato) && (a == false)){
			if(R->sig != NULL){
				
				S = R;
				R = R->sig;
				
			}else{
				
				a=true;
			}
		}
		
		if(a==true){
			
			printf("\n El codigo no fue encontrado \n");
			printf("\n Lista \n ");
			Imprimir(*P);
				
			}else{
				
				printf("\n El codigo fue encontrado \n");	
				printf("\nCodigo eliminado: %d\nNombre:  %s\nTelefono: %d\nCorreo:  %s\n \n", R->Codigo, R->Nombre, R->Telefono, R->Correo);
				
				if(*P == R){
					
					*P = R->sig;
						
				}else{
					
					if(R->sig == NULL){
						
						S->sig=NULL;
						
					}else{
						
						R->sig->ant = S->sig;
						S->sig = R->sig;
					}
				}
				printf("\n Lista nueva \n");
				Imprimir(*P);
			}
		}
}


void Buscar(struct nodo *P){
	
	struct nodo *Q;
	Q = P;
	int dato;
	
	printf("Ingrese el codigo a buscar: ");
	scanf("\n %d", &dato);
	while((Q != NULL)&&( Q->Codigo != dato)){
		
		Q = Q->sig;
	}
	if(Q == NULL){
		
		printf("El codigo pudo ser encontrado");
 
	}else{
		
		printf("\nCodigo encontrado: %d\nNombre:  %s\nTelefono: %d\nCorreo:  %s\n \n", Q->Codigo, Q->Nombre, Q->Telefono, Q->Correo);
	}	
}


void Imprimir(struct nodo *P){
	
	while (P != NULL){
		
		printf("\n Datos de la persona \t");
		printf("\n Codigo: %d \t", P->Codigo);
		printf("\n Nombre: %s \t", P->Nombre);
		printf("\n Telefono: %d \t", P->Telefono);
		printf("\n Correo : %s \t", P->Correo);
		printf("\n");
		P = P->sig;
	}
	printf("\n");
}
