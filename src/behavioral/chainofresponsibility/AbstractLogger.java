package behavioral.chainofresponsibility;

abstract class AbstractLogger {
    static int INFO = 1;
    static int DEBUG = 2;
    static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if (nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
