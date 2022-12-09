import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your goal in minutes: ");
        int goal = scan.nextInt();

        // create an ActivityTracker object
        ActivityTracker tracker = new ActivityTracker(goal);

        // repeatedly ask user to enter an activity session's number of minutes
        // and enter -1 when done entering
        int logMinutes = 0;
        while (logMinutes > -1) {
            System.out.print("Enter the minutes of your activity session, -1 to end: ");
            logMinutes = scan.nextInt();
            if (logMinutes != -1) {
                tracker.logMinutes(logMinutes);
            }
        }

        // log the number of minutes associated with each activity session

        // when the user is done entering numbers, end the loop and
        // tell the user their stats:
        // - total sessions logged
        // - total minutes logged
        // - max minutes logged
        // - did they reach their goal?

        System.out.println();
        System.out.println("Good job being active! Let's look at your stats: ");
        System.out.println("Number of sessions: "+ tracker.getSessions());
        System.out.println("Total number of minutes: " + tracker.getTotalMinutes());
        System.out.println("Longest session logged (max minutes): " + tracker.getMaxMinutes());
        System.out.println("You reached your goal: " + tracker.goalAchieved());

    }
}


//public class Main {
//    public static void main(String[] args) {
//
//        // target goal of 120 minutes of activity
//        ActivityTracker tracker = new ActivityTracker(120);
//
//        int total = tracker.getTotalMinutes();
//        System.out.println(total);
//
//        int sessions = tracker.getSessions();
//        System.out.println(sessions);
//
//        int maxMinTracked = tracker.getMaxMinutes();
//        System.out.println(maxMinTracked);
//
//        boolean goalMet = tracker.goalAchieved();
//        System.out.println(goalMet);
//        System.out.println(); // blank line
//
//        tracker.logMinutes(35);
//        System.out.println(tracker.getTotalMinutes());
//        System.out.println(tracker.getSessions());
//        System.out.println(tracker.getMaxMinutes());
//        System.out.println(tracker.goalAchieved());
//        System.out.println(); // blank line
//
//        tracker.logMinutes(30);
//        System.out.println(tracker.getTotalMinutes());
//        System.out.println(tracker.getSessions());
//        System.out.println(tracker.getMaxMinutes());
//        System.out.println(tracker.goalAchieved());
//        System.out.println(); // blank line
//
//        tracker.logMinutes(45);
//        System.out.println(tracker.getTotalMinutes());
//        System.out.println(tracker.getSessions());
//        System.out.println(tracker.getMaxMinutes());
//        System.out.println(tracker.goalAchieved());
//        System.out.println(); // blank line
//
//        tracker.logMinutes(15);
//        System.out.println(tracker.getTotalMinutes());
//        System.out.println(tracker.getSessions());
//        System.out.println(tracker.getMaxMinutes());
//        System.out.println(tracker.goalAchieved());
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Student student = new Student("Benny", "Gudman", 2020, 94.5, true);
//        System.out.println(student.studentInfo());
//        System.out.println(student.getFirstName());
//        System.out.println(student.getLastName());
//        System.out.println(student.getGradYear());
//        System.out.println(student.getGpa());
//        System.out.println(student.isInClub());
//        student.setFirstName("Benjamin");
//        student.setLastName("Goodman");
//        student.setGradYear(2021);
//        student.setGpa(64.5);
//        student.setInClub(false);
//        System.out.println(student.studentInfo());
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//
//        Dog myDog = new Dog("Toby", 10);
//        System.out.println(myDog.dogInfo());
//        System.out.println(myDog.getName());
//        System.out.println(myDog.getAge());
//        System.out.println(myDog.isSleeping());
//
//        myDog.setName("Tobias");
//        myDog.setAge(11);
//        myDog.setSleeping(true);
//        System.out.println(myDog.dogInfo());
//    }
//}
