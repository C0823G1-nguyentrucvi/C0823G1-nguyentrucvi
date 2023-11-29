package ss18_case_study.bai_1.sevice;

import ss18_case_study.bai_1.repository.BookingRepository;
import ss18_case_study.bai_1.repository.IBookingRepository;

public class BookingService implements IBookingService{
private IBookingRepository iBookingRepository=new BookingRepository();
}
