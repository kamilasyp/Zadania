import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LiczbaNaSlowo {
	public static void main(String[] args) {
		
		System.out.println("Proszê o podanie liczby trzycyfrowej z zakresu 100-999"); 
		
		Map<Integer, String> jednosci = new HashMap<Integer, String>();
		
		jednosci.put( 0, "zero");
		jednosci.put( 1, "jeden");
		jednosci.put( 2, "dwa");
		jednosci.put( 3, "trzy");
		jednosci.put( 4, "cztery");
		jednosci.put( 5, "piec");
		jednosci.put( 6, "szesc");
		jednosci.put( 7, "siedem");
		jednosci.put( 8, "osiem");
		jednosci.put( 9, "dziewiec");
		
		
		
		Map<Integer, String> nascie = new HashMap<Integer, String>();
		
		nascie.put(1, "jedenascie");
		nascie.put(2, "dwanascie");
		nascie.put(3, "trzynascie");
		nascie.put(4, "czternascie");
		nascie.put(5, "pietnascie");
		nascie.put(6, "szesnascie");
		nascie.put(7, "siedemnascie");
		nascie.put(8, "osiemnascie");
		nascie.put(9, "dziewietnascie");
		
		
		
		Map<Integer, String> dziesiatki = new HashMap<Integer, String>();
		
		dziesiatki.put(1, "dziesiec");
		dziesiatki.put(2, "dwadziescia");
		dziesiatki.put(3, "trzydziesci");
		dziesiatki.put(4, "czterdziesci");
		dziesiatki.put(5, "piecdziesiat");
		dziesiatki.put(6, "szescdziesiat");
		dziesiatki.put(7, "siedemdziesiat");
		dziesiatki.put(8, "osiemdziesiat");
		dziesiatki.put(9, "dziewiecdziesiat");
		
		
		Map<Integer, String> setki = new HashMap<Integer, String>();
		
		setki.put(1, "sto");
		setki.put(2, "dwiescie");
		setki.put(3, "trzysta");
		setki.put(4, "czterysta");
		setki.put(5, "piecset");
		setki.put(6, "szescset");
		setki.put(7, "siedemset");
		setki.put(8, "osiemset");
		setki.put(9, "dziewiecset");
		
		Scanner odczyt = new Scanner (System.in);
		int podanaLiczba = odczyt.nextInt();
		String pomocnicza=	Integer.toString(podanaLiczba);
			
		
		
		if ((podanaLiczba >=100)&&(podanaLiczba<=999)) {
			
			String cyfraSetek = pomocnicza.substring(0, 1);
			int skladowaSetek =Integer.parseInt(cyfraSetek);
			
			String cyfraDziesiatek = pomocnicza.substring(1, 2);
			int skladowaDziesiatek =Integer.parseInt(cyfraDziesiatek);
			
			String cyfraJednosci = pomocnicza.substring(2, 3);
			int skladowaJednosci =Integer.parseInt(cyfraJednosci);
			
			if (skladowaDziesiatek == 1 & skladowaJednosci != 0)
			{
				System.out.println(setki.get(skladowaSetek) + " " + nascie.get(skladowaJednosci));
			}
			
			else if (skladowaDziesiatek == 0 & skladowaJednosci != 0)
			{
				System.out.println(setki.get(skladowaSetek) + " " + jednosci.get(skladowaJednosci));
			}
			
			else if ((skladowaDziesiatek != 0 & skladowaDziesiatek != 1) & skladowaJednosci != 0)
			{
				System.out.println(setki.get(skladowaSetek) + " " + dziesiatki.get(skladowaDziesiatek) + " " + jednosci.get(skladowaJednosci));
			}
			else if ((skladowaDziesiatek != 0 & skladowaDziesiatek != 1) & skladowaJednosci == 0)
			{
				System.out.println(setki.get(skladowaSetek) + " " + dziesiatki.get(skladowaDziesiatek));
			}
			
		}
		else {
			System.out.println("Podano nieprawidlowa liczbe." 
					+'\n'+"Proszê o podanie liczby 3 cyfrowej z zakresu 100-999");
		}
		 odczyt.close();
	}

}
