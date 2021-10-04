package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	//a)
    public static void skrivUt (int[] tabell) {

        for (int i = 0; i < tabell.length; i++) {
            System.out.print("Tabellen består av elementet: [" + tabell[i] + "]" + "\n");
        }

    }
    //b)
    public static String tilStreng (int[] tabell1) {

        System.out.print("[" + tabell1[0] + "," + tabell1[1] + "," + tabell1[2] + "]" + "\n");
            return null;

    }
    // c)
    public static int summer (int[] tabell2) {

        int sum = 0;

            for (int i = 0; i < tabell2.length; i++) {

                sum += tabell2[i];

                if (sum < 8) {

                System.out.print("");

                }else    System.out.println("Summen av elementene er: " + sum);
            }

            return sum;

        }
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		for(int i = 0; i < tabell.length; i++) {
			if (tabell[i]==tall) {
				finnes=true;
				
			} else {}
		}

		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int first = -1;
		for (int i = 0; i<tabell.length; i++) {
			if (tabell[i]==tall) {
				first=i;
			}else {}
		}
		return first;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int [] newtab = new int [tabell.length];
		for (int i=0; i<tabell.length; i++) {
			newtab[i] = tabell[tabell.length-1-i];
		}
		
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int i=1;
		while (i<tabell.length) {
			if(tabell[i]<tabell[i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int length = tabell1.length+tabell2.length;
		int [] both = new int [length];
		int pos = 0;
		
		for (int element:tabell1) {
			both[pos]=element;
			pos++;
		}
	return both;
	}
}
