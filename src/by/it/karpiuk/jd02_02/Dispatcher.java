package by.it.karpiuk.jd02_02;

class Dispatcher {
    private Dispatcher() {
    }

    private static volatile int customersInside = 0;
    private static volatile int customersCompleted = 0;

    static boolean shopClosed() {
        return customersCompleted == Config.PLAN_BUYERS;
    }

    static boolean shopOpened() {
        return customersCompleted + customersInside < Config.PLAN_BUYERS;
    }

    static synchronized void addNewCustomer() {
        customersInside++;
    }

    static synchronized void customerCounter() {
        customersInside--;
        customersCompleted++;
    }
}
