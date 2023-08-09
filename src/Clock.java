public class Clock {
    ClockHand second;
    ClockHand minute;
    ClockHand hour;

    public Clock() {
        this.second = new ClockHand(60);
        this.minute = new ClockHand(60);
        this.hour = new ClockHand(24);
    }

    public void advance() {
        this.second.advance();

        if (this.second.getValue() == 0) {
            this.minute.advance();

            if (this.minute.getValue() == 0) {
                this.hour.advance();
            }
        }
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
