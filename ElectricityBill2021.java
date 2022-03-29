import java.util.Scanner;

public class ElectricityBill2021 implements ElectricityBillCalculator{
	
	private int units, discount, bankCharges_r = 9, bankCharges_c = 17, meterRent_r = 8, meterRent_c = 11;
	private String consumerType;
	private double eb2021, eb2021_d, rpu_1_r = 9.9, rpu_2_r = 11.1, rpu_3_r = 12.4, rpu_4_r = 14.8
			, rpu_1_c = 12.9, rpu_2_c = 15.2, rpu_3_c = 15.8, rpu_4_c = 20.2,
			electricityDuty_r = 0.0105, electricityDuty_c = 0.0205,
			generalSaleTax_r = 0.08, generalSaleTax_c = 0.15;
	
	
	public double ElectricityBill() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter units consumed = ");
		this.units = scan.nextInt();
		System.out.print("Enter Consumer type = ");
		this.consumerType = scan.next();
		if(consumerType.equalsIgnoreCase("residential") && units > 200 && units < 400) {
			double ebTariff2021_r = ((rpu_1_r*100)+(rpu_2_r*100)+((units-200)*rpu_3_r));
			eb2021 = (ebTariff2021_r+(ebTariff2021_r*electricityDuty_r)
					+(ebTariff2021_r*generalSaleTax_r)+bankCharges_r+meterRent_r);		
		}else if(consumerType.equalsIgnoreCase("residential") && units < 100) {
			double ebTariff2021_r = ((rpu_1_r*(100-units)));
			eb2021 = (ebTariff2021_r+(ebTariff2021_r*electricityDuty_r)
					+(ebTariff2021_r*generalSaleTax_r)+bankCharges_r+meterRent_r);
		}else if(consumerType.equalsIgnoreCase("residential") && units > 100 && units < 200) {
			double ebTariff2021_r = ((rpu_1_r*100)+(rpu_2_r*(200-units)));
			eb2021 = (ebTariff2021_r+(ebTariff2021_r*electricityDuty_r)
					+(ebTariff2021_r*generalSaleTax_r)+bankCharges_r+meterRent_r);
		}if(consumerType.equalsIgnoreCase("commercial") && units < 100) {
			double ebTariff2021_c = ((rpu_1_c*(100-units)));
			eb2021 = (ebTariff2021_c+(ebTariff2021_c*electricityDuty_c)
					+(ebTariff2021_c*generalSaleTax_c)+bankCharges_c+meterRent_c);
		}else if(consumerType.equalsIgnoreCase("commercial") && units > 100 && units < 100) {
			double ebTariff2021_c = ((rpu_1_c*100)+(rpu_2_c*(200-units)));
			eb2021 = (ebTariff2021_c+(ebTariff2021_c*electricityDuty_c)
					+(ebTariff2021_c*generalSaleTax_c)+bankCharges_c+meterRent_c);
			}	
			return eb2021;
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
			double ebTariff2021_r = ((rpu_1_r*100)+(rpu_2_r*100)+((units-200)*rpu_3_r));
			eb2021 = (ebTariff2021_r+(ebTariff2021_r*electricityDuty_r)
					+(ebTariff2021_r*generalSaleTax_r)+bankCharges_r+meterRent_r);
			eb2021_d = eb2021 - (eb2021*(this.discount/100)); 
		}else if(consumerType.equalsIgnoreCase("residential") && units < 100) {
			double ebTariff2021_r = ((rpu_1_r*(100-units)));
			eb2021 = (ebTariff2021_r+(ebTariff2021_r*electricityDuty_r)
					+(ebTariff2021_r*generalSaleTax_r)+bankCharges_r+meterRent_r);
			eb2021_d = eb2021 - (eb2021*(this.discount/100)); 
		}else if(consumerType.equalsIgnoreCase("residential") && units > 100 && units < 200) {
			double ebTariff2021_r = ((rpu_1_r*100)+(rpu_2_r*(200-units)));
			eb2021 = (ebTariff2021_r+(ebTariff2021_r*electricityDuty_r)
					+(ebTariff2021_r*generalSaleTax_r)+bankCharges_r+meterRent_r);
			eb2021_d = eb2021 - (eb2021*(this.discount/100)); 
		}if(consumerType.equalsIgnoreCase("commercial") && units < 100) {
			double ebTariff2021_c = ((rpu_1_c*(100-units)));
			eb2021 = (ebTariff2021_c+(ebTariff2021_c*electricityDuty_c)
					+(ebTariff2021_c*generalSaleTax_c)+bankCharges_c+meterRent_c);
			eb2021_d = eb2021 - (eb2021*(this.discount/100)); 
		}else if(consumerType.equalsIgnoreCase("commercial") && units > 100 && units < 100) {
			double ebTariff2021_c = ((rpu_1_c*100)+(rpu_2_c*(200-units)));
			eb2021 = (ebTariff2021_c+(ebTariff2021_c*electricityDuty_c)
					+(ebTariff2021_c*generalSaleTax_c)+bankCharges_c+meterRent_c);
			eb2021_d = eb2021 - (eb2021*(this.discount/100)); 
			}	
			return eb2021_d;
		}
		
	
	

}
