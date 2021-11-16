package activities;


class Car
{
		
		String color;
		String transmission;
		int make;
		int tyres;
		int doors;
		Car()
		{
			tyres=4;
			doors=4;
		}
		
		public void displayCharacteristics()
		{
			System.out.println("Car color is "+color);
			System.out.println("Car transmission is "+transmission);
			System.out.println("Car make is "+make);
			System.out.println("Car tyres are "+tyres);
			System.out.println("Car doors are "+doors);
			
		}
		
		public void accelarate()
		{
			System.out.println("The car is moving forward");
		}
		public void brake()
		{
			System.out.println("Car has stopped");
		}
		
}

class activity1 
{
	public static void main(String[] args)
	{
	Car tata = new Car();
	tata.make=2014;
	tata.color="blue";
	tata.transmission="manual";
	tata.accelarate();
	tata.brake();
	tata.displayCharacteristics();
	
	}


}



