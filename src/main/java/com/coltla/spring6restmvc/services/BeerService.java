package com.coltla.spring6restmvc.services;

import com.coltla.spring6restmvc.models.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    List<Beer> listBeers();

    Beer getBeerById(UUID id);
}
