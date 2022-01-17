package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
            {
                String modulecode = "CSC1009";
                switch(modulecode)
                {
		    case "CSC1006":
			System.out.println("Mathematics 2");
			break;
                    case "CSC1007":
                        System.out.println("operating systems");
                        break;
                    case "CSC1008":
                        System.out.println("data structure and algorithms");
                        break;
                    case "CSC1009":
                        System.out.println("object oriented programming");
                        break;
                    case "CSC1010":
                        System.out.println("computer networks");
                        break;
                    default:
                        System.out.println("error! no module found");
                        break;
                }
            }
        }
    }
}
