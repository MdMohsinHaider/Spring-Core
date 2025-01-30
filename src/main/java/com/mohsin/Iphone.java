package com.mohsin;

public class Iphone implements Mobile{
    /**
     * Calling feature Implement
     */
    @Override
    public void call() {
        System.out.println("Calling.....");
    }

    /**
     * Massage feature Implement
     */
    @Override
    public void massage() {
        System.out.println("Messaging ......");
    }

    /**
     * Mail feature implement
     */
    @Override
    public void mail() {
        System.out.println("Mail sending .....");
    }

    /**
     * SnapShot feature Implement.
     */
    @Override
    public void snapShot() {
        System.out.println("Snap...");
    }
}
