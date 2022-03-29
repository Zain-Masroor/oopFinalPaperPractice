import java.util.Scanner;

public class ElectricityBill2020 implements ElectricityBillCalculator{
	
	private int units, discount, bankCharges_r = 8, bankCharges_c = 15, meterRent_r = 7, meterRent_c = 9;
	private String consumerType;
	private double eb2020, eb2020_d, rpu_1_r = 9.3, rpu_2_r = 10.7, rpu_3_r = 12.1, rpu_4_r = 14.5
			, rpu_1_c = 12.6, rpu_2_c = 14.9, rpu_3_c = 15.2, rpu_4_c = 19.8,
			electricityDuty_r = 0.01, electricityDuty_c = 0.02,
			generalSaleTax_r = 0.07, generalSaleTax_c = 0.14;
	
	
	public double ElectricityBill() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter units consumed = ");
		this.units = scan.nextInt();
		System.out.print("Enter Consumer type = ");
		this.consumerType = scan.next();
		if(consumerType.equalsIgnoreCase("residential") && units > 200 && units < 400) {
			double ebTariff2020_r = ((rpu_1_r*100)+(rpu_2_r*100)+((units-200)*rpu_3_r));
			eb2020 = (ebTariff2020_r+(ebTariff2020_r*electricityDuty_r)
					+(ebTariff2020_r*generalSaleTax_r)+bankCharges_r+meterRent_r);
		}else if(consumerType.equalsIgnoreCase("residential") && units < 100) {
			double ebTariff2020_r = ((rpu_1_r*(100-units)));
			eb2020 = (ebTariff2020_r+(ebTariff2020_r*electricityDuty_r)
					+(ebTariff2020_r*generalSaleTax_r)+bankCharges_r+meterRent_r);
		}else if(consumerType.equalsIgnoreCase("residential") && units > 100 && units < 200) {
			double ebTariff2020_r = ((rpu_1_r*100)+(rpu_2_r*(200-units)));
			eb2020 = (ebTariff2020_r+(ebTariff2020_r*electricityDuty_r)
					+(ebTariff2020_r*generalSaleTax_r)+bankCharges_r+meterRent_r);
		}if(consumerType.equalsIgnoreCase("commercial") && units < 100) {
			double ebTariff2020_c = ((rpu_1_c*(100-units)));
			eb2020 = (ebTariff2020_c+(ebTariff2020_c*electricityDuty_c)
					+(ebTariff2020_c*generalSaleTax_c)+bankCharges_c+meterRent_c);
		}else if(consumerType.equalsIgnoreCase("commercial") && units > 100 && units < 100) {
			double ebTariff2020_c = ((rpu_1_c*100)+(rpu_2_c*(200-units)));
			eb2020 = (ebTariff2020_c+(ebTariff2020_c*electricityDuty_c)
					+(ebTariff2020_c*generalSaleTax_c)+bankCharges_c+meterRent_c);
			}	
			return eb2020;
		}
	
	
	
	public double ElectricityBill_d() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter units consumed = ");
		this.units = scan.nextInt();
		System.out.print("Enter Consumer type = ");
		this.consumerType = scan.next();
		System.out.print("Enter discount = ");
		this.discount = scan.nextInt();		
		if(consumerType.equalsIgnoreCase("residential") && units > 200 && units < 400) {
			double ebTariff2020_r = ((rpu_1_r*100)+(rpu_2_r*100)+((units-200)*rpu_3_r));
			eb2020 = (ebTariff2020_r+(ebTariff2020_r*electricityDuty_r)
					+(ebTariff2020_r*generalSaleTax_r)+bankCharges_r+meterRent_r);
			eb2020_d = eb2020 - (eb2020*(this.discount/100)); 
		}else if(consumerType.equalsIgnoreCase("residential") && units < 100) {
			double ebTariff2020_r = ((rpu_1_r*(100-units)));
			eb2020 = (ebTariff2020_r+(ebTariff2020_r*electricityDuty_r)
					+(ebTariff2020_r*generalSaleTax_r)+bankCharges_r+meterRent_r);
			eb2020_d = eb2020 - (eb2020*(this.discount/100)); 
		}else if(consumerType.equalsIgnoreCase("residential") && units > 100 && units < 200) {
			double ebTariff2020_r = ((rpu_1_r*100)+(rpu_2_r*(200-units)));
			eb2020 = (ebTariff2020_r+(ebTariff2020_r*electricityDuty_r)
					+(ebTariff2020_r*generalSaleTax_r)+bankCharges_r+meterRent_r);
			eb2020_d = eb2020 - (eb2020*(this.discount/100)); 
		}if(consumerType.equalsIgnoreCase("commercial") && units < 100) {
			double ebTariff2020_c = ((rpu_1_c*(100-units)));
			eb2020 = (ebTariff2020_c+(ebTariff2020_c*electricityDuty_c)
					+(ebTariff2020_c*generalSaleTax_c)+bankCharges_c+meterRent_c);
			eb2020_d = eb2020 - (eb2020*(this.discount/100)); 
		}else if(consumerType.equalsIgnoreCase("commercial") && units > 100 && units < 100) {
			double ebTariff2020_c = ((rpu_1_c*100)+(rpu_2_c*(200-units)));
			eb2020 = (ebTariff2020_c+(ebTariff2020_c*electricityDuty_c)
					+(ebTariff2020_c*generalSaleTax_c)+bankCharges_c+meterRent_c);
			eb2020_d = eb2020 - (eb2020*(this.discount/100)); 
			}	
			return eb2020_d;
		}
		
	
	
}