package com.example.sm.SpringRipperV1;


import com.example.sm.SpringRipperV1.annotation.InjectRandomInt;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Profiling
@Component
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message = "I;ll be back";

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    @Override
    @PostProxy
    public Object sayQuote() {
        System.out.println("Phase 3");
        for(int i = 0; i<repeat; i++)
            System.out.println("message: " + message);
        return null;
    }
}
