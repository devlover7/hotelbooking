package org.cp.util;

import java.util.concurrent.atomic.AtomicInteger;

public class AutoIDGenerator {

    private static AtomicInteger hotelRoomId = new AtomicInteger(0);
    private static AtomicInteger bookingId = new AtomicInteger(0);
    private static AtomicInteger customerId = new AtomicInteger(0);

    public static Integer generateAutoRoomId(){
       return hotelRoomId.incrementAndGet();
    }

    public static Integer generateAutoBookingId(){
        return bookingId.incrementAndGet();
    }

    public static Integer generateCustomerId(){
        return customerId.incrementAndGet();
    }




}
