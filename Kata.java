public class Bio {
    public String dnaToRna(String dna) {
      
      //check length of string, for loop through string, 
      //for all the indexes with T values, 
      //replace all T values with U values
      
      int lastIndex = dna.length() - 1;
      System.out.println("lastIndexToChange " + lastIndex);
      
    
      for(int i = 0; i <= lastIndex; i++){
        
        char tValue = dna.charAt(i);
        System.out.println("char tValue before changing " + tValue);
        
        if(tValue == 'T'){
          
         dna = dna.replace(tValue, 'U');
          System.out.println("char tValue after changing " + tValue);
          
        }//End if
        
        
      }//End for
      
      System.out.println("new String " + dna);
      
      
        return dna; 
    } 
}