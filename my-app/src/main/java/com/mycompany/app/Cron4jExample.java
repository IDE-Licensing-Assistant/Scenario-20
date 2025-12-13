
package com.mycompany.app;

import it.sauronsoftware.cron4j.Scheduler;

public class Cron4jExample {

    public static void main(String[] args) {
        // Create a scheduler
        Scheduler scheduler = new Scheduler();

        // Schedule a task: e.g., run every minute
        String pattern = "* * * * *";  // this means “every minute”
        scheduler.schedule(pattern, new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello! The time is: " + java.time.LocalDateTime.now());
            }
        });

        // Start the scheduler
        scheduler.start();

        System.out.println("Scheduler started. Press Ctrl+C to stop.");

        // Optionally: keep the main thread alive
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            // Restore interrupt status
            Thread.currentThread().interrupt();
        }

        // When shutdown is needed:
        // scheduler.stop();
    }
}
