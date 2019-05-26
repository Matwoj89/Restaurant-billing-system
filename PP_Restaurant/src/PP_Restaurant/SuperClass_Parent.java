package PP_Restaurant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SuperClass_Parent {
	
	public double SoupOfTheDay;
	public double Wonton;
	public double TomKha;
	
	public double CrispyGyoza;
	public double SpringRolls;
	public double BeerTempura;
	
	public double SteamedDumplings;
	public double PrawnBun;
	public double ThaiCurry;
	public double PadThai;
	public double BeefUdon;
	public double TeriyakiSalmon;
	public double CrispyDuck;
	
	public double Tea;
	public double Coffee;
	public double CocaCola;
	
	public double ThaiIceCream;
	public double TempuraBanana;
	public double MangoLassi;
	

	public double Meals;
	public double Drinks;
	public double TotalofMD;
	
	public double AllTotalofMD;
	
	public double GetAmount()
	{
		Meals = SoupOfTheDay + Wonton + TomKha + CrispyGyoza + SpringRolls + BeerTempura + 
				SteamedDumplings + PrawnBun + ThaiCurry + PadThai + BeefUdon + TeriyakiSalmon + CrispyDuck +
				ThaiIceCream + TempuraBanana + MangoLassi;
		Drinks = Tea + Coffee + CocaCola;
		
		TotalofMD = Meals + Drinks;
		AllTotalofMD = TotalofMD;
		return AllTotalofMD;
	}
	
	private JFrame frame;
	
	public void iExitSystem(){
		frame = new JFrame("Exit");
		
		if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Restaurant Managment Systems",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
			System.exit(0);
	}
	}

	
	//==================Price===================
	
	public double pSoupOfTheDay = 9.9;
	public double pWonton = 12.9;
	public double pTomKha = 17.9;
	
	public double pCrispyGyoza = 14.9;
	public double pSpringRolls = 17.9;
	public double pBeerTempura = 21.9;
	
	public double pSteamedDumplings = 19.9;
	public double pPrawnBun = 16.9;
	public double pThaiCurry = 28.9;
	public double pPadThai = 35.9;
	public double pBeefUdon = 31.9;
	public double pTeriyakiSalmon = 37.9;
	public double pCrispyDuck = 39.9;
	
	public double pTea = 9;
	public double pCoffee = 10;
	public double pCocaCola = 6;
	
	public double pThaiIceCream = 15.9;
	public double pTempuraBanana = 13.9;
	public double pMangoLassi = 7.9;
	 
	//========================================
	
	public double mcTax = 0.90;
	
	public Double cFindTax(double cAmount)
	{
		double FindTax = cAmount - (cAmount* mcTax);
		return FindTax;
	}
}
