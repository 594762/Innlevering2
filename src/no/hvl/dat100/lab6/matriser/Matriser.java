package no.hvl.dat100.lab6.matriser;
import java.util.Arrays;
public class Matriser {
	


	    public static void main(String[] args) {

	        int [][] matrise = { { 1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

	        int[][] mat1 = { { 1, 3, 5}, {6, 8, 10} };
	        int[][] mat2 = { { 2, 19, 21}, {5, 7, 3}};

	        skrivUt1(matrise);
	        tilStreng(matrise);
	        erLik(mat1, mat2);
	    }



	    public static void skrivUt1(int[][] matrise) {

	        for (int i = 0; i < matrise.length; i++) {


	            for (int j = 0; j < matrise.length; j++) {
	                System.out.print( matrise[i][j] + ",");

	            }

	        }


	 }

	    public static String tilStreng(int[][] matrise) {

	        String streng = "";

	        for(int i = 0; i < matrise.length; i++) {
	            for (int j=0; j < matrise[i].length; j++) {
	                if (i != matrise.length) {
	                    streng +=matrise[i][j];
	                }
	            }
	        }
	        return streng;
	    }

	    public static int[][]skaler(int tall, int[] [] matrise) {
	        int[][] nymatrise = new int[matrise.length][matrise.length];


	        for (int i = 0; i < matrise.length; i++) {
	            for (int j = 0; j < matrise.length; j++) {
	                nymatrise[i][j] = matrise[i][j] * tall;
	            }
	        }
	        return null;
	    }

	    public static boolean erLik(int[][] mat1, int[][] mat2) {

	        System.out.println("Er matrise1 like stor som matrise2?" + Arrays.equals(mat1, mat2));
	        return false;
	    }

	}

