package com.bvan.javaoop.sample.multithreading.interruption.factorial;

import com.bvan.javaoop.sample.multithreading.ThreadUtils;
import java.util.concurrent.TimeUnit;

/**
 * @author bvanchuhov
 */
public class FactorialRunner {

    public static void main(String[] args) {
        Thread thread = new Thread(new FactorialTask(1_000_000));
        thread.start();

        ThreadUtils.sleep(TimeUnit.SECONDS.toMillis(3));

        thread.interrupt();

        ThreadUtils.println("Main is finished");
    }
}
