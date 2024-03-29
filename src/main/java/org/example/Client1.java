package org.example;

public class Client1 {
    public static void main(String[] args) {
        Thread clientThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    Client.main(new String[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        clientThread1.start();
    }
}
