package com.designpatterns;

public class GetPlanFactory {
	 public Plan getPlan(String planType){  
         if(planType == null){  
          return null;  
         }  
       if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
              return new DomesticHousePlan();  
            }   
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
             return new CommercialHousePlan();  
         }   
       else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
             return new InstitutionalHousePlan();  
       }  
   return null;  
}  
}
