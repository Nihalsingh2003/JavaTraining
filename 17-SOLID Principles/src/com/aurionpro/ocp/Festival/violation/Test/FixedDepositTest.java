package com.aurionpro.ocp.Festival.violation.Test;



import com.aurionpro.ocp.Festival.violation.model.FestivalType;
import com.aurionpro.ocp.Festival.violation.model.FixedDeposit;

public class FixedDepositTest {
public static void main(String[] args) {
FixedDeposit fd=new FixedDeposit(123,"Nihal",1000,2,FestivalType.DIWALI);
if(fd.calculateSimpleInterst()==0) {
	System.out.println("Please Give Proper Festival");
}else {
	System.out.println("Interst is:"+fd.calculateSimpleInterst());
}
}
}
