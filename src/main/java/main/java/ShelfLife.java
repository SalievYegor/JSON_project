package main.java;

import java.util.Date;

public class ShelfLife {
    private Date manufacture;
    private Date expire;

    public Date getManufacture() {
        return manufacture;
    }
    public Date getExpire() {
        return expire;
    }

    @Override
        public String toString() {
            return "ShelfLife{" +
                    "manufacture=" + manufacture +
                    ", expire=" + expire +
                    '}';
    }
}


