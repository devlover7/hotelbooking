package org.cp.hotelbooking.entity;

import java.time.LocalDateTime;

public class Booking {

    int bookingId;
    Room room;
    LocalDateTime checkin;
    LocalDateTime checkout;
    User user;

}
