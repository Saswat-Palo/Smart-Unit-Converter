package suc;
import java.util.Scanner;
public class SUC {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Welcome to SMART UNIT CONVERTER");
		System.out.println("\tWhich type of conversion you want to perform ? ");
		System.out.println("Press (1-Weight Conversions),(2-Length Conversions),(3-INR to other Currency Conversions),(4-Temperature Conversions) ");
		int c = sc.nextInt();
		if (c==1) {
			System.out.println("Press (1- kg to lbs),(2- lbs to kg),(3- gm to kg),(4- kg to gm),(5- gm to lbs),(6- lbs to gm) ");
			int p = sc.nextInt();
			switch(p) {
			case 1: System.out.println("Enter kg ");
			double kg = sc.nextDouble();
			System.out.println(kg+" kg in lbs is "+(kg*2.205)+" pounds");
			break;
			case 2: System.out.println("Enter lbs ");
			double lbs = sc.nextDouble();
			System.out.println(lbs+" pounds in kg is "+(lbs/2.205)+" kg");
			break;
			case 3: System.out.println("Enter grams ");
			double gm = sc.nextDouble();
			System.out.println(gm+" grams in kg is "+(gm/1000)+" kg");
			break;
			case 4: System.out.println("Enter kg ");
			double w = sc.nextDouble();
			System.out.println(w+" kg in gram is "+(w*1000)+" gram");
			break;
			case 5: System.out.println("Enter grams ");
			double g = sc.nextDouble();
			System.out.println(g+" grams in lbs is "+(g*0.002205)+" pounds");
			break;
			case 6: System.out.println("Enter lbs ");
			double l = sc.nextDouble();
			System.out.println(l+" pounds in grams is "+(l*453.592)+" gram");
			break;
			default:System.out.println("Invalid input from user");
			
			
			}
		}
		else if(c==2) {
			System.out.println("Press (1- mm to cm),(2- cm to mm),(3- cm to m),(4- m to cm),(5- m to km),(6- km to m) ");
			int p = sc.nextInt();
			switch(p) {
			case 1: System.out.println("Enter mm ");
			double mm = sc.nextDouble();
			System.out.println(mm+" mm in cm is "+(mm/10)+" cm");
			break;
			case 2: System.out.println("Enter cm ");
			double cm = sc.nextDouble();
			System.out.println(cm+" cm in mm is "+(cm*10)+" mm");
			break;
			case 3: System.out.println("Enter cm ");
			double lc = sc.nextDouble();
			System.out.println(lc+" cm in m is "+(lc/100)+" m");
			break;
			case 4: System.out.println("Enter m ");
			double m = sc.nextDouble();
			System.out.println(m+" m in cm is "+(m*100)+" cm");
			break;
			case 5: System.out.println("Enter m ");
			double lm = sc.nextDouble();
			System.out.println(lm+" m in km is "+(lm/1000)+" km");
			break;
			case 6: System.out.println("Enter km ");
			double km = sc.nextDouble();
			System.out.println(km+" km in m is "+(km/1000)+" m");
			break;
			default:System.out.println("Invalid input from user");
			
			}
			
		}
		else if(c==3) {
			System.out.println("Currency values are updated as of 08/12/2025");
			System.out.println("USD- US DOLLARS $, EUROS- EUROZONE €, JYP- JAPANESE YEN ¥, GBP- GREAT BRITISH POUND £, CNY- CHINESE RENMINBI ¥");
			System.out.println("Press (1- ₹ INR to $ USD), (2- ₹ INR to € EUROS), (3- ₹ INR to ¥ JPY), (4- ₹ INR to £ GBP), (5- ₹ INR to ¥ CNY ) ");
			int cr = sc.nextInt();
			switch(cr) {
			case 1: System.out.println("Enter value in INR ");
			double inr = sc.nextDouble();
			System.out.println(inr+" Rupees is "+(inr*0.011)+" USD");
			break;
			case 2: System.out.println("Enter value in INR ");
			double in = sc.nextDouble();
			System.out.println(in+" Rupees is "+(in*0.0096)+" EUROS");
			break;
			case 3: System.out.println("Enter value in INR ");
			double i = sc.nextDouble();
			System.out.println(i+" Rupees is "+(i*1.73)+" JPY");
			break;
			case 4: System.out.println("Enter value in INR ");
			double g = sc.nextDouble();
			System.out.println(g+" Rupees is "+(g*0.0083)+" GBP");
			break;
			case 5: System.out.println("Enter value in INR ");
			double cn = sc.nextDouble();
			System.out.println(cn+" Rupees is "+(cn*0.079)+" CNY");
			break;
			default:System.out.println("Invalid input from user");
			}
		}
		else if(c==4) {
			System.out.println("Press (1- Celsius to  Kelvin),(2- Kelvin to Celsius),(3- Celsius to Fahrenheit),(4- Fahrenheit to Celsius),(5- Fahrenheit to Kelvin),(6- Kelvin to Fahrenheit) ");
			int temp = sc.nextInt();
			switch(temp) {
			case 1: System.out.println("Enter degree in Celsius ");
			double cel = sc.nextDouble();
			System.out.println(cel+" degree Celsius is "+(cel+273.15)+" Kelvin");
			break;
			case 2: System.out.println("Enter value in Kelvin ");
			double kel = sc.nextDouble();
			System.out.println(kel+" Kelvin is "+(kel-273.15)+" degree Celsius");
			break;
			case 3: System.out.println("Enter degree in Celsius ");
			double ce = sc.nextDouble();
			System.out.println(ce+" degree Celsius is "+((ce*9/5)+32.0)+" degree Fahrenheit");
			break;
			case 4: System.out.println("Enter degree in Fahrenheit ");
			double fh = sc.nextDouble();
			System.out.println(fh+" degree Fahrenheit is "+((fh-32)*5/9)+" degree Celsius");
			break;
			case 5: System.out.println("Enter degree in Fahrenheit ");
			double f = sc.nextDouble();
			System.out.println(f+" degree Fahrenheit is "+(((f-32)*5/9)+273.15)+" Kelvin");
			break;
			case 6: System.out.println("Enter value in Kelvin ");
			double k = sc.nextDouble();
			System.out.println(k+" Kelvin is "+(((k-273.15)*9/5)+32.0)+" degree Fahrenheit");
			break;
			default:System.out.println("Invalid input from user");
			}
			
		}
		else {
			System.out.println("Invalid Input please restart the program");
			
		}
		System.out.println("THANK YOU, HOPE MEETING YOU SOON");
	}

}


