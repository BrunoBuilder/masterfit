package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Athlete;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código: ");
		int code = sc.nextInt();
		System.out.print("Nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Sexo[M/F]: ");
		char gender = sc.next().charAt(0);
		System.out.print("Data Nascimento: ");
		Date birthDate = sdf.parse(sc.next()) ;
	    System.out.print("Altura: ");
	    double height = sc.nextDouble();
	    System.out.print("Peso: "); 
	    double weight = sc.nextDouble();
	    System.out.print("BF: ");
	    double bf = sc.nextDouble();
	    System.out.print("Nível de treino ([I]niciante, Inter[M]ediário ou [A]vançado): ");
	    char trainingLevel = sc.next().charAt(0);
	    
	    Athlete athlete = new Athlete(code, name, gender, birthDate, height, weight, bf, trainingLevel);
	    
	    System.out.println(athlete.toString());

	    sc.close();

	}

}
