package com.example.Tablebank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService serivce;

    public BankController(BankService serivce) {
        this.serivce = serivce;
    }
    @PostMapping("/bank_insert")
    public void insertion(@RequestBody BankAccount entry) {
        serivce.addDetails(entry);
    }
    @PostMapping("/adduser")
    public BankAccount addUser(@RequestBody BankAccount user)
    {
        user.setBalance(1000);
        return serivce.addUserdata(user);

    }

    @GetMapping("/getuser")
    public List<BankAccount> getUser()
    {
        return serivce.getUserdata();
    }

    @PutMapping("/updateuser/{id}")
    public String updateUser(@PathVariable("id") int id,
                             @RequestBody BankAccount user)
    {
        BankAccount obj = serivce.getById(id);
        obj.setBalance(obj.getBalance() + user.getBalance());
        serivce.savetodb(obj);
        return "Updated";
    }
}

