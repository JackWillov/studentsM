package com.intentsg.model;

import javax.persistence.*;

@Entity
@Table(name = "TICKETS")
public class Ticket {

    @Id
    @Column(name = "TICKET_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "YEAR_OF_CREATION", nullable = false)
    private int creationYear;

    @Column(name = "PRICE", nullable = false)
    private double price;

    @ManyToOne
    private User userRelation;


    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
