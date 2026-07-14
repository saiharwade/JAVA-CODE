package MultiThreading.Future;

import java.util.concurrent.Callable;

class FecthName implements Callable<String> {

    private final String name;

    public FecthName(String name) {
        this.name = name;
    }

    //Calls returns the work, whereas the run and just running whether it is completes or not
    public String call() throws Exception{
        System.out.printf("\n Getting full name of %s from sevice", name);
        Thread.sleep(4000);
        return name + " Bhartiya";
    }
}
