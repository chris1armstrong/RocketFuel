
public class Module {
	private Integer mass;
	
	public Module(Integer mass) {
		this.mass = mass;
	}

	public Integer fuelRequired() {
		Integer fuel = this.mass/3 - 2;
		return fuel + part2Fuel(fuel);
	}
	
	private static Integer part2Fuel(Integer fuel) {
		Integer next = fuel/3 - 2;
		if (next < 0) {
			return 0;
		}
		return next + part2Fuel(next);
	}
}
