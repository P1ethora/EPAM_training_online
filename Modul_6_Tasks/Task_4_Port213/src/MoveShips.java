class MoveShips extends Thread {     //Поток движение

    @Override
    public void run() {

        while (true) {

            Ship ship = new Ship();          //Создание объекта ship

            try {
                if (Port.queue.size() == 10) {   //Информирование о заполнении очереди

                    System.out.println("\n" + "Слишком много кораблей, порт приостановил прием" + "\n");
                    Thread.sleep(10000);

                } else {

                    Port.queue.put(ship);       //Добавление корабля в очередь
                    System.out.println("Корабль " + ship + " прибыл в порт");
                    System.out.println("Ждут свободного дока " + Port.queue.size() + " кораблей");

                    try {
                        Thread.sleep(900);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}