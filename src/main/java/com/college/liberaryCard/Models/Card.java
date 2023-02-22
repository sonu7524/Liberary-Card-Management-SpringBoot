package com.college.liberaryCard.Models;

import com.college.liberaryCard.Enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;

    @CreationTimestamp
    private Date createdOn;
    //there are two date formate one is util & other one is sql
    // but util is advance also gives times para as well
    @UpdateTimestamp
    private Date updatedOn;


    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @OneToOne
    @JoinColumn
    private Student student;


    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    private List<Book> booksIssued = new ArrayList<>();

    public Card() {
    }

    public Card(int cardNo, Date createdOn, Date updatedOn, CardStatus cardStatus, Student student, List<Book> booksIssued) {
        this.cardNo = cardNo;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.cardStatus = cardStatus;
        this.student = student;
        this.booksIssued = booksIssued;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public List<Book> getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(List<Book> booksIssued) {
        this.booksIssued = booksIssued;
    }
}
