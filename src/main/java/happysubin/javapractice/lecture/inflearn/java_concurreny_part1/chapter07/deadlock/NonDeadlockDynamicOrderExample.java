package happysubin.javapractice.lecture.inflearn.java_concurreny_part1.chapter07.deadlock;

public class NonDeadlockDynamicOrderExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            methodWithLocks(lock1, lock2);
        });

        Thread thread2 = new Thread(() -> {
            methodWithLocks(lock2, lock1);
        });
        thread1.start();
        thread2.start();
    }

    private static void methodWithLocks(Object lockA, Object lockB) {
        Object firstLock = lockA;
        Object secondLock = lockB;

        /**
         * 동일한 락의 순서를 보장
         */
        if (System.identityHashCode(lockA) > System.identityHashCode(lockB)) {
            firstLock = lockB;
            secondLock = lockA;
        }

        synchronized (firstLock) {
            System.out.println(Thread.currentThread().getName() + ": lockA 획득");

            synchronized (secondLock) {
                System.out.println(Thread.currentThread().getName() + ": lockB 획득");
            }
        }
    }
}