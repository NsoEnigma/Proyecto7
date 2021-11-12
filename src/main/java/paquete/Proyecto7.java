package paquete;

import java.util.Scanner;

public class Proyecto7 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		short tribunaAlta=3000;
		short tribunaBaja=1000;
		short preferenciaAlta=5000;
		short preferenciaBaja=3000;
		short fondoSurAlto=500;
		short fondoSurBajo=1000;
		short fondoNorteAlto=500;
		short fondoNorteBajo=1000;
		
		short totalAbonados = 15000;
		
		short sitiosPrefAlta = 5345;
		short sitiosPrefBaja = 3345;
		short sitiosTribunaAlta = 5345;
		short sitiosTribunaBaja = 3345;
		short sitiosFondoSBajo = 1986;
		short sitiosFondoSAlto = 3896;
		short sitiosFondoNBajo = 1986;
		short sitiosFondonAlto = 3896;
		
		
		System.out.println("Elige el tipo de partido de la cual quieres saber la recaudación de taquilla máxima");
		System.out.println("Los tipos de partido disponibles son (introduce el numero)");
		System.out.println("1:Playoff Ascenso /  2:Liga / 3:Copa del Rey / 4: Otro tipo"); 
		short tipoPartido = Short.parseShort(lector.nextLine());
		
		System.out.println("¿Quieres calcualar la recaudación con el estadio lleno? (s/n)");
		char respuesta = lector.nextLine().charAt(0);
		
		int totalConAbonado = ((sitiosPrefAlta*35)+(sitiosPrefBaja*40)+(sitiosTribunaAlta*45)+(sitiosTribunaBaja*50)+(sitiosFondoSBajo*20)+(sitiosFondoSAlto*15)+(sitiosFondoNBajo*20)+(sitiosFondonAlto*15));
		
		int totalSinAbonado = ((345*35)+(345*40)+(2345*45)+(2345*50)+(986*20)+(3396*15)+(986*20)+(3396*15));
		
		if (respuesta == 's') {
			
			if (tipoPartido==1 || tipoPartido==3) {
				System.out.println("En estos tipos de partido los abonados pagan la entrada asi que la recaudacion total con el tipo de partido elegido y el estadio lleno es de: " + totalConAbonado + " euros.");
			}
			
			if (tipoPartido==2 || tipoPartido==4) {
				System.out.println("En estos tipos de partidos los abonados entran gratis asi que la recaudacion total con el tipo de partido elegido y el estadio lleno es de: " + totalSinAbonado + " euros.");	
			}
			
		} 
		
		if (respuesta == 'n') {

			System.out.println("Dime el porcentaje que quieres calcular del 0-100 y por favor no introduzcas el símbolo %: ");
			byte porcentaje = Byte.parseByte(lector.nextLine());
			
			if (tipoPartido==1 || tipoPartido==3) {
				System.out.println("En estos tipos de partidos los abonados pagan asi que la recaudacion total con el tipo de partido elegido y el " + porcentaje + "% del aforo permitido es de: " + ((totalConAbonado*porcentaje)/100) + " euros.");			
			}
			
		
			if (tipoPartido==2 || tipoPartido==4) {
				System.out.println("En estos tipos de partidos los abonados entran gratis asi que la recaudacion total con el tipo de partido elegido y el " + porcentaje + "% del aforo permitido es de: " + ((totalSinAbonado*porcentaje)/100) + " euros.");
			}
			
			if (porcentaje>100) {
				System.out.println("Te dije que desde el 0 al 100 y sin el simbolo %.");
			}
		}
		
	}
	
}		

