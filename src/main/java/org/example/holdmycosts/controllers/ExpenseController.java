package org.example.holdmycosts.controllers;

import org.example.holdmycosts.models.Expense;
import org.example.holdmycosts.models.User;
import org.example.holdmycosts.repositories.ExpenseRepository;
import org.example.holdmycosts.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final UserRepository userRepository;

    private final ExpenseRepository expenseRepository;

    public ExpenseController(UserRepository userRepository, ExpenseRepository expenseRepository){
        this.userRepository = userRepository;
        this.expenseRepository = expenseRepository;
    }

    @GetMapping()
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @PostMapping()
    public void createExpense(@RequestBody Expense expense) {
        User user = userRepository.getById(10L);
        expense.setUser(user);
        expenseRepository.save(expense);
    }
}
