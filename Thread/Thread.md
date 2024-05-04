# Java Thread Life Cycle:

- **New:** Instance of thread is created but not started by invoking `start()` method.
- **Runnable:** After calling `start()` method and before selection by Scheduler.
- **Running:** After the thread scheduler selects it.
- **Not Runnable:** Thread is alive but not eligible to run.
- **Terminated:** `run()` method is terminated.

## Inter-thread Communication

Inter-thread communication in Java is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed.

- **wait():** It tells the calling thread to give up the lock and go to sleep until some other thread enters the same monitor and calls notify().
- **notify():** It wakes up one single thread called wait() on the same object. It should be noted that calling notify() does not give up a lock on a resource.
- **notifyAll():** It wakes up all the threads called wait() on the same object.

## Java Thread Priority in Multithreading

Priorities in threads is a concept where each thread is having a priority which in layman’s language one can say every object is having priority here which is represented by numbers ranging from 1 to 10. 

The default priority is set to 5 as expected.
Minimum priority is set to 1.
Maximum priority is set to 10.
Here 3 constants are defined in it namely as follows:

- `public static int NORM_PRIORITY`
- `public static int MIN_PRIORITY`
- `public static int MAX_PRIORITY`
