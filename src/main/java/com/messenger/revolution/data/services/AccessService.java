package com.messenger.revolution.data.services;

import com.messenger.revolution.data.repository.AccessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessService {

    @Autowired
    AccessRepo accessRepo;

}
