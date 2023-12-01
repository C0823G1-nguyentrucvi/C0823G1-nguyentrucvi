package case_study.service;

import case_study.repository.BookingRepository;
import case_study.repository.IBookingRepository;

public class BookingService implements IBookingService{
    private static IBookingRepository iBookingRepository=new BookingRepository();
}
