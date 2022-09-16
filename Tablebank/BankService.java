package com.example.Tablebank;

//public class BankService {
//}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {
    @Autowired
    private BankRepository repo;

    public BankService(BankRepository repo) {
        this.repo = repo;
    }
    public void addDetails(BankAccount entry) {
        repo.save(entry);
        System.out.println("Entry added");
    }

    public BankAccount addUserdata(BankAccount user) {
        return repo.save(user);
    }

    public List<BankAccount> getUserdata() {
        return repo.findAll();
    }

    public BankAccount getById(int id) {
        return repo.findById(id).get();
    }

    public void savetodb(BankAccount obj) {
        repo.save(obj);
    }
}
