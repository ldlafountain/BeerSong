package com.company;

public class Main {

    public static void main(String[] args) {
		
    }

 public static void Ninety_Nine_Bottles_of_Beer(){
		        for (int count=99; count >= 1; count--){

            int newBottle = count-1;

            if(count==1){
                System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer,");
                System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
            }
            else{
                System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer,");
                System.out.println("take one down, pass it around, " + newBottle + " bottles of beer on the wall.");
            }
        }
    }
}
