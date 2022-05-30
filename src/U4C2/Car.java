package U4C2;

public class Car {

	int numberOfPassenger;
	int numberOfKms;
}

class Sedan extends Car{
	final int farePerKm = 20;
}

class HatchBack extends Car{
	final int farePerKm = 15;
}