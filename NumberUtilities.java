


public class NumberUtilities {
        
    public static String getRange(int stop) {
        String range="" ;
        for (int i = 0; i < stop; i++) {
            range += i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++) {
            range += i;
        }
        return range;
        
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i += step) {
            range += i; 
        }
        return range;
    }
     
    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
       
        for (int i = start; i < stop; i++){
            if (i % 2 == 0) {
            evenNumbers += i;
            }
        }
        return evenNumbers;
            
    }
        

        
    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 1) {
             oddNumbers += i;
            }
        }
         return oddNumbers;
    }
    


    public static String getExponentiations(int start, int stop, int exponent) {
        String exponentiations = "";
        for (int i = start; i <= stop; i++) {
            exponentiations += (int)Math.pow(i, exponent);
        }
        
        return exponentiations;
        
    }
}


   