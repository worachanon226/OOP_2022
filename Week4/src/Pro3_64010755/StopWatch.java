package Pro3_64010755;

public class StopWatch {
    private long startTime,endTime;
    public StopWatch(){
        startTime = System.nanoTime();
    }
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public double getElapsedTime() {
        return (endTime - startTime) / (double)10e6;
    }
}
