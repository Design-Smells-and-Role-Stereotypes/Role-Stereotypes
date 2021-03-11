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
public class SmallTest extends BigTest{
    
    private int duration;
    
    public SmallTest(String tdate, String tvenue, int passmark, int duration) {
        super(tdate, tvenue, passmark);
        this.duration = duration;
    }
    
    protected void setDuration(int duration){
        this.duration = duration;
    }
    
    public int getDuration(){
        return this.duration;
    }
}
