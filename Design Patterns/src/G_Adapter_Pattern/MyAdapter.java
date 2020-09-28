/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G_Adapter_Pattern;

/**
 *
 * @author Simplx
 */
public class MyAdapter implements Vehicle {

    Bicycle bicycle;

    public MyAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelarate() {
        bicycle.pedal();
    }

    @Override
    public void pushBreak() {
        bicycle.stopped();
    }

    @Override
    public void soundHourn() {
        bicycle.Ring();
    }

}
