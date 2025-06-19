import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskScheduler {

    private Queue<Runnable> taskQueue = new LinkedList<>();
    private ExecutorService executor = Executors.newFixedThreadPool(3);

    public void scheduleTask(Runnable task) {
        taskQueue.offer(task);
    }

    public void executeAll() {
        while (!taskQueue.isEmpty()) {
            Runnable task = taskQueue.poll();
            if (task != null) {
                executor.execute(task);
            }
        }
        executor.shutdown();
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            scheduler.scheduleTask(() -> {
                System.out.println("Executing task " + taskId + " by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        scheduler.executeAll();
    }
}
