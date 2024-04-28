# Java Thread Life Cycle:

- **New:** Instance of thread is created but not started by invoking `start()` method.
- **Runnable:** After calling `start()` method and before selection by Scheduler.
- **Running:** After the thread scheduler selects it.
- **Not Runnable:** Thread is alive but not eligible to run.
- **Terminated:** `run()` method is terminated.
