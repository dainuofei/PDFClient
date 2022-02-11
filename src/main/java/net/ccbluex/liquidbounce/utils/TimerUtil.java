/*
 * Decompiled with CFR 0_132.
 */
package net.ccbluex.liquidbounce.utils;

public class TimerUtil {
    public long lastMS;

    private long getCurrentMS() {
        return System.nanoTime() / 1000000L;
    }

    public boolean delay(double milliseconds) {
        if ((double)(this.getCurrentMS() - this.lastMS) >= milliseconds) {
            reset();
            return true;
        }
        return false;
    }

    public void reset() {
        this.lastMS = this.getCurrentMS();
    }

    public boolean delay(float milliSec) {
        if ((float)(this.getTime() - this.lastMS) >= milliSec) {
            reset();
            return true;
        }
        return false;
    }

    public long getTime() {
        return System.nanoTime() / 1000000L;
    }
}

