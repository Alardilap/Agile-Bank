package com.mindhub.AppHomeBanking.dtos;

import com.mindhub.AppHomeBanking.models.Card;
import com.mindhub.AppHomeBanking.models.CardColor;
import com.mindhub.AppHomeBanking.models.CardType;

import java.time.LocalDate;

public class CardDTO {

    private Long id;
    private String cardHolder;
    private CardType type;
    private CardColor color;
    private String number;
    private String cvv;
    private LocalDate fromDate;
    private LocalDate thruDate;
    private Boolean active;

    public CardDTO(Card card) {
        this.id = card.getId();
        this.cardHolder = card.getCardHolder();
        this.type = card.getType();
        this.color = card.getColor();
        this.number =card.getNumber();
        this.cvv =card.getCvv();
        this.fromDate = card.getFromDate();
        this.thruDate = card.getThruDate();
        this.active=card.getActive();
    }

    public Long getId() {
        return id;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public CardType getType() {
        return type;
    }

    public CardColor getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

    public String getCvv() {
        return cvv;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getThruDate() {
        return thruDate;
    }

    public Boolean getActive() {
        return active;
    }
}
