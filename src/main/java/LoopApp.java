public class LoopApp {

  public static void main(String... args) throws InterruptedException {
         int counter = 0;
         while (true) {
                counter++;
                System.out.println("LoopApp is running. Iteration: " + counter + ", PID: " + ProcessHandle.current().pid());
                Thread.sleep(3000); // пауза 3 секунды
      }
     }
    }
