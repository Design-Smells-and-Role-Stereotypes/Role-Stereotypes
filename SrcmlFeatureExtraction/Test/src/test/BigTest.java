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
public class BigTest {
    private final String tdate;
    private final String tvenue;
    private final int passmark;
    
    
    public BigTest(String tdate, String tvenue, int passmark){
        this.tdate = tdate;
        this.tvenue = tvenue;
        this.passmark = passmark;
    }
    
    public String getTdate(){
        return this.tdate;
    }
    
    public String getTvenue(){
        return this.tvenue;
    }
    
    public int getPassmark(){
        return this.passmark;
    }
}
