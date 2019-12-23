import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RocketFuel {
	private File input;
	private ArrayList<Module> modules;
	
	public RocketFuel() {
		this.input = new File("input.txt");
		this.modules = new ArrayList<Module>();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		RocketFuel rocketFuel = new RocketFuel();
		Scanner reader = new Scanner(rocketFuel.input);
		while(reader.hasNext()) {
			rocketFuel.modules.add(new Module(reader.nextInt()));
		}
		reader.close();
		
		Integer totalFuel = 0;
		for (Module mod : rocketFuel.modules) {
			totalFuel = totalFuel + mod.fuelRequired();
		}
		System.out.println("Total Fuel: " + totalFuel);
	}

}
