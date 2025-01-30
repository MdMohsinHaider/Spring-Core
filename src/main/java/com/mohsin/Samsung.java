package com.mohsin;

public class Samsung implements Mobile{
    /**
     * calling features Implement
     */
    @Override
    public void call() {
        System.out.println("Calling.....");
    }

    /**
     * massage features implement
     */
    @Override
    public void massage() {
        System.out.println("massage send ....");
    }

    /**
     * mail feature implement
     */
    @Override
    public void mail() {
        System.out.println("mailing ....");
    }

    /**
     * snapShot feature implement
     */
    @Override
    public void snapShot() {
        System.out.println("snapShot...");
    }
}
