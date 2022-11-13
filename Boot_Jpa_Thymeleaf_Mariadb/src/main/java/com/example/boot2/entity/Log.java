package com.example.boot2.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "log")
@NoArgsConstructor
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int log_id ;

    private String memo;

    @org.hibernate.annotations.Generated(GenerationTime.ALWAYS)
    private LocalDateTime reg_day;

    public Log(String memo) {
        this.memo = memo;
    }
}
