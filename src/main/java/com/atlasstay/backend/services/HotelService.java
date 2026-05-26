package com.atlasstay.backend.services;

import com.atlasstay.backend.dto.HotelDto;
import com.atlasstay.backend.entity.Hotel;

public interface HotelService {

    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(long id);
}
