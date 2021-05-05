package com.petclinic.pet.service;

import com.petclinic.pet.models.Owner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="owner-service")
public interface OwnerServiceProxy {

    @GetMapping("ownerapi/owner/getById/{id}")
    Owner getOwnerById(@PathVariable("id") long id);
}

