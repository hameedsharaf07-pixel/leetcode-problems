class DiningPhilosophers {

    private final ReentrantLock lock;

    public DiningPhilosophers() {
        this.lock = new ReentrantLock();
    }
    public void wantsToEat(int philosopher,
                            Runnable pickLeftFork,
                            Runnable pickRightFork,
                            Runnable eat,
                            Runnable putLeftFork,
                            Runnable putRightFork) throws InterruptedException {
        
        lock.lock();
        try {
            pickLeftFork.run();
            pickRightFork.run();
            eat.run();
            putLeftFork.run();
            putRightFork.run();
        } finally {
            lock.unlock();
        }
    }
}
