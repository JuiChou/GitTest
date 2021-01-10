package xxx;

public class TestBMI {
	
	public static void main(String[] args) {
		
		double height = 1.65;  // double hight = 1.65, weight = 66.5;


		double weight = 66.5;  // weight = 90.0


		double bmi = weight/height/height; // bmi = weight / Math.pow(height, 2); 2=平方,3=立方
		
		System.out.println("BMI = " + bmi);
		System.out.printf("BMI = %.2f%n", bmi); //printf(格式),%.f(浮點數格式) %.2f%n 取到小數點後第二位且換行
		
		if (bmi<18.5) {
			System.out.println("過瘦");
		}
		
		else if (bmi>=24) {				//(18.5<=bmi<24)-->會先運算18.5<=18.5(結果為布林值) 無法再運算
			System.out.println("過胖");
		}
		
		else {
			System.out.println("正常");
		}
		
		
			
	
	
	}

}


