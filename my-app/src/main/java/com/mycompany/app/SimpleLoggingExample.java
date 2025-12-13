
package com.mycompany.app;

import com.esotericsoftware.minlog.Log;

public class SimpleLoggingExample {
    public static void main(String[] args) {
        // set logging level (e.g., INFO)
        Log.set(Log.LEVEL_INFO);

        Log.info("SimpleLoggingExample", "Program started.");
        try {
            int result = divide(10, 0);
            Log.info("SimpleLoggingExample", "Result: " + result);
        } catch (Exception e) {
            Log.error("SimpleLoggingExample", "An error occurred during division", e);
        }
        Log.info("SimpleLoggingExample", "Program finished.");
    }

    private static int divide(int a, int b) {
        Log.debug("SimpleLoggingExample", "Entering divide() with a=" + a + ", b=" + b);
        return a / b;
    }
}
