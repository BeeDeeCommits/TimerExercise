public class Timer {

    private ClockHand hundredth;
    private ClockHand second;

    public Timer() {
        this.hundredth = new ClockHand(100);
        this.second = new ClockHand(60);
    }

    public void start() {
        while (true) {
            System.out.println(this);
            hundredth.advance();
            if (hundredth.getValue() == 0) {
                second.advance();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return second + ":" + hundredth;
    }
}
