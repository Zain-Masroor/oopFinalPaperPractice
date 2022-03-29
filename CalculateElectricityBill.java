
public class CalculateElectricityBill {
	
	ElectricityBillCalculator electricitybillcalculator;
	
	public CalculateElectricityBill(ElectricityBillCalculator electricitybillcalculator) {
		this.electricitybillcalculator = electricitybillcalculator;
	}
	
	public double calculateBill2020() {
		return electricitybillcalculator.ElectricityBill();
	}
	
	public double calculateBill2020Discount() {
		return electricitybillcalculator.ElectricityBill_d();
	}

	public double calculateBill2021() {
		return electricitybillcalculator.ElectricityBill();
	}
	
	public double calculateBill2021Discount() {
		return electricitybillcalculator.ElectricityBill_d();
	}
	
}
