package com.mk.basedemo.repo;

import com.mk.basedemo.model.Buyer;

public interface BuyerRepo {
    Iterable<Buyer>findAll();
    Buyer findAll(String id);
    Buyer save(Buyer buyer);
}
