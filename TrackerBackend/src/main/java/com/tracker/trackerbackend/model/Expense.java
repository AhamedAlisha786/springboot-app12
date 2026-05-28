package com.tracker.trackerbackend.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expense
{
    @Id
    private int id;
    private String Description;
    private double Amount;
    private String Category;
    private String Date;
    private String Subject;
    private String Place;
}
