/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant_Bill;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author susha
 */
public class SuperClass {
    public double VegBurger;
        public double PaneerBurger;
        public double Chowmean;
        public double Paasta;
        public double Snacks;
        public double Paratha;
        public double Pizza;
        
        public double VanillaShake;
        public double MangoShake;
        public double OreoShake;
        public double BananaShake;
        public double ChoclateShake;
        public double Lassi;
        public double ColdDrink;
        
        public double Meals;
        public double Drinks;
        public double TotalofMade;
        public double AllTotalofMade;
        
        public double getAmount(){
            
            Meals = VegBurger + PaneerBurger + Chowmean + Paasta + Snacks + Paratha + Pizza;
            Drinks = VanillaShake + MangoShake + OreoShake + BananaShake + ChoclateShake + Lassi + ColdDrink;
            TotalofMade = Meals+Drinks;
            AllTotalofMade = TotalofMade;
            return AllTotalofMade;
              }
       
        private JFrame frame;
        public void iExitSystem(){
            frame = new JFrame ("Exit");
            
            if(JOptionPane.showConfirmDialog(frame, "Confirm  if you want to exit", "Restaurant Bill Management System", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
                System.exit(0);
            }
            
        }
        
        //================ PRICE =============
       public double pVegBurger = 30;
        public double pPaneerBurger = 30;
        public double pChowmean = 25;
        public double pPaasta = 35;
        public double pSnacks = 10;
        public double pParatha = 10;
        public double pPizza = 75;
        
        public double pVanillaShake = 20;
        public double pMangoShake = 20;
        public double pOreoShake = 30;
        public double pBananaShake = 20;
        public double pChoclateShake = 25;
        public double pLassi = 25;
        public double pColdDrink = 15;
        
        
        public double resTax = 0.18;
        
        public Double cFindTax(double AllTotalofMade){
        
            double FindTax =  (AllTotalofMade * resTax);
            return FindTax;
        }
                
}
