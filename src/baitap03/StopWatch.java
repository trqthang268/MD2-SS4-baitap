package baitap03;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public StopWatch(){

    }


    public void setStartTime() {
        startTime = System.currentTimeMillis();
    }
    public void setEndTime(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime-startTime;
    }
}
