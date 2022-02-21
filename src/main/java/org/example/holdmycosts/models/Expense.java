package org.example.holdmycosts.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Expense implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String reasonForExpenditure;
    private BigDecimal amountOfExpenditure;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Expense () {}

    public Expense (String reason, BigDecimal amount) {
        this.reasonForExpenditure = reason;
        this.amountOfExpenditure = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReasonForExpenditure() {
        return reasonForExpenditure;
    }

    public void setReasonForExpenditure(String reasonForExpenditure) {
        this.reasonForExpenditure = reasonForExpenditure;
    }

    public BigDecimal getAmountOfExpenditure() {
        return amountOfExpenditure;
    }

    public void setAmountOfExpenditure(BigDecimal amountOfExpenditure) {
        this.amountOfExpenditure = amountOfExpenditure;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
