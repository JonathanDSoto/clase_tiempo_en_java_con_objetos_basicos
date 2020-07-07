import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h,m,s;
		Scanner teclado = new Scanner(System.in);
		Tiempo hora;
		
		/*
		System.out.println("Ingrese las horas");
		h = teclado.nextInt();
		
		System.out.println("Ingrese los minutos");
		m = teclado.nextInt();
		
		*System.out.println("Ingrese los segundos");
		s = teclado.nextInt();*/
		
		hora = new Tiempo(17,53,52);
		
		System.out.println(hora.toString());
		
		hora.aumentarHoras(2);
		System.out.println(hora.toString());
		
		hora.aumentarMinutos(120);
		System.out.println(hora.toString());
		
		hora.aumentarSegundos(3400);
		System.out.println(hora.toString());
		
		hora.disminuirHoras(22);
		System.out.println(hora.toString());
		
		hora.disminuirMinutos(120);
		System.out.println(hora.toString());
		
		hora.disminuirMinutos(3600);
		System.out.println(hora.toString());
	}  
	 
}