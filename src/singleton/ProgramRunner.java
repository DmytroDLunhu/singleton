package singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("1st log info...");
        ProgramLogger.getProgramLogger().addLogInfo("2nd log info...");
        ProgramLogger.getProgramLogger().addLogInfo("3rd log info...");
        ProgramLogger.getProgramLogger().showLogInfo();
    }
}
