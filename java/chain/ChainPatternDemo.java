/**
 * PatternType: Behavior
 *
 * 按顺序创建一个类似于套娃的结构对象
 * 按照规则决定是自己处理还是下一个对象来处理
 */
public class ChainPatternDemo{
    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);


        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
    public static void main(String[] args){
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.ERROR, "Error level message");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.DEBUG, "Debug level message");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.INFO, "Info level message");
    }
}
