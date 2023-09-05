package com.example.service;



import com.example.model.Owner;

import java.util.List;

public interface OwnerService {
    List<Owner> selectAllOw();
    Owner selectById(int oid);


    int delOwByOid(int oid);

    int addOw(Owner owner);

    int updateSubmit(Owner owner);
}
