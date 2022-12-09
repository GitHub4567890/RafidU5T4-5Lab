public class ActivityTracker {
    private int goalMinutes;
    private int currentTotalMinutes;
    private int numOfLogs;
    private int largestLog;

    public ActivityTracker(int goalMinutes) {
        this.goalMinutes = goalMinutes;
        currentTotalMinutes = 0;
        numOfLogs = 0;
        largestLog = 0;
    }

    public void logMinutes(int logAmt) {
        currentTotalMinutes += logAmt;
        numOfLogs += 1;
        if (logAmt > largestLog) {
            largestLog = logAmt;
        }
    }

    public int getSessions() {
        return numOfLogs;
    }

    public int getTotalMinutes() {
        return currentTotalMinutes;
    }

    public int getMaxMinutes() {
        return largestLog;
    }

    public boolean goalAchieved() {
        if (currentTotalMinutes >= goalMinutes) {
            return true;
        } else {
            return false;
        }
    }
}
