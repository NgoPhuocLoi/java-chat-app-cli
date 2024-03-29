package org.example;

public class Client2 {
    public static void main(String[] args) {
        Thread clientThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    Client.main(new String[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        clientThread2.start();
    }
}
