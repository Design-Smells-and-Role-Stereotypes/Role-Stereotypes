/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author danielogenrwot
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 1234567890;
        float b = 1.3456f;
        double c = 1.2345667d;
        boolean d = true;
        
        
        System.out.println(a);
        
        BigTest btest = new BigTest("July 07, 2020", "Gulu University", 50);
        System.out.println(btest.getPassmark());
        
        SmallTest smallTest = new SmallTest("July 07, 2020", "Gulu University", 50, 60);
        System.out.println(smallTest.getDuration());
        
        //update duration 
        smallTest.setDuration(100);
        System.out.println(smallTest.getDuration());

        
        
    }
    
}
