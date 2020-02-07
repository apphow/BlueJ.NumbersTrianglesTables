 

public class TableUtilities {
   public static String getSmallMultiplicationTable() {
          return getMultiplicationTable(5);
       
    }
    
  


    public static String getLargeMultiplicationTable() {
        String x = "";
       
        for (int i = 1; i <= 9; i++){
        for (int j = 1; j <= 9; j++) {
            x += x + "|\n";
        }
    
    }
    return x;


}
 public static String getMultiplicationTable(int tableSize) {
        String x = "";
        for (int i = 1; i <= tableSize; i++){
        for (int j = 1; j <= tableSize ; j++) {
            //x +=  (i * j);
          if ((i * j) < 10) {
            x =  x +"  " + (i * j) + " |"; 
        } else if ((i * j) < 100) {
            x = x + " " + (i * j) + " |";
        } else {
            x = x + (i * j) + " |";
        } 
    }
        x +="\n";
    }
    return x;
    
}
}

  
 



 

 



   
 
    
    

