package com.company;

public class Main {

    public static void main(String[] args){

        System.out.println("Кто сегодня у нас первым уйдёт с пар?");

        Evolution denis = (new Evolution("Пацаны: Денис"));
        Evolution nikita = (new Evolution("Девочки: Никита"));

        try {
            denis.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Первым ушёл:");
        if (nikita.thread.isAlive()){
            System.out.print("Никита");
        }else{
            System.out.print("Денис");
        }
    }

}
