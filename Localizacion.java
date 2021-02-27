package es.upm.dit.prog.practica2;

import java.util.Arrays;


public class Localizacion {
	
	Coordenada c;
	Lectura [] lecturas;
	
public Localizacion (Coordenada c, int n){
	this.c=c;
	lecturas=new Lectura [n];
}

@Override
public String toString() {
	return "Localizacion [c=" + c + ", lecturas=" + Arrays.toString(lecturas)
			+ "]";
}
	
public Coordenada getC() {
	return c;
}

public void setC(Coordenada c) {
	this.c = c;
}

public void setLectura (Lectura l, int n){
	if ((n>=0) && (n<= lecturas.length-1)){
		lecturas[n]= l;
	}}

public Lectura getLectura(int n) {
	if (n>=0 && n<= lecturas.length-1){
		return lecturas[n];
	}else{ return null;}
}
	
public void intercambia(int n1, int n2){
	
	if ((n1>=0 && n1<= lecturas.length-1) && (n2>=0 && n2<= lecturas.length-1)){
		Lectura ap= lecturas[n2];
		lecturas[n2]=lecturas[n1];
		lecturas[n1]=ap;
	}
}


	
	
}
